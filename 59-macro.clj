; See https://en.wikipedia.org/wiki/Homoiconicity
; In Clojure it's possible to access full extent of the language to write code-generation routines (“macros”)

; -------------------------------------------------------------------------------------------------------------------------------------

; Macro basics

; defmacro -- define macro. 
; The macro should output a list that can be evaluated as clojure code.

(defmacro m1 []
    (list reverse "Hello World"))		; string to char seq + reverse
(prn (m1))						; (\d \l \r \o \W \space \o \l \l \e \H)


; macroexpand -- see result of the macro

(prn (macroexpand '(m1)))			; (#<core$reverse clojure.core$reverse@586c20e1> "Hello World")
(prn (eval (macroexpand '(m1))))		; (\d \l \r \o \W \space \o \l \l \e \H)


; manipulate with code itself

(defmacro m2 []
    '(reverse "Hello World"))
(prn (macroexpand '(m2)))			; (reverse "Hello World")	-- bare Clojure code

(defmacro m2 []
    `(reverse "Hello World"))
(prn (macroexpand '(m2)))			; (clojure.core/reverse "Hello World")	-- see difference between ` and '

; -------------------------------------------------------------------------------------------------------------------------------------

; Macro with params, quoting

; macro with params

(defmacro m3 [who]
    (list str "Hello " who))
(prn (m3 "John Doe"))				; "Hello John Doe"
(prn (macroexpand '(m3 "John Doe")))	; (#<core$str clojure.core$str@75ce994b> "Hello " "John Doe")		-- name is "hard-coded" into generated code


; Clojure provides method for quoting macros: `. 
; Inside `, it's possible to use ~ to get at the outer scope.

(defmacro m4 [who]
    `(str "Hello " ~who))
(prn (m4 "John Doe"))				; "Hello John Doe"
(prn (macroexpand '(m4 "John Doe")))	; (clojure.core/str "Hello " "John Doe")

; -------------------------------------------------------------------------------------------------------------------------------------

; Destructuring args

;Expand list variables using ~@

(defmacro m5 [& names]
    `(str "Hello " ~@names))
(prn (m5 "John Doe" "Jim Black" "Jack Brown"))					; "Hello John DoeJim BlackJack Brown"
(prn (macroexpand '(m5 "John Doe" "Jim Black" "Jack Brown")))		; (clojure.core/str "Hello " "John Doe" "Jim Black" "Jack Brown")

(defmacro m6 [& names]
    `(str "Hello " (clojure.string/join ", " '(~@names))))
(prn (m6 "John Doe" "Jim Black" "Jack Brown"))					; "Hello John Doe, Jim Black, Jack Brown"
(prn (macroexpand '(m6 "John Doe" "Jim Black" "Jack Brown")))		; (clojure.core/str "Hello " (clojure.string/join ", " (quote ("John Doe" "Jim Black" "Jack Brown"))))

; -------------------------------------------------------------------------------------------------------------------------------------

; Vars in macros

; macro isn't a function, it has no local vars -- it uses already defined global vars and can corrupt their values
; => create sysnonyms for vars, which intended to be "local"

(def delta 5)

(prn (gensym 'delta))				; delta66
(prn (gensym 'delta))				; delta69
(prn (gensym 'delta))				; delta72

(defmacro m7 [x]
    `(do 
	(def delta 3)
        (+ ~x delta)))
    
(prn (m7 7))					; 10
(prn delta)						; 3	-- macro changed "delta"
(prn (macroexpand '(m7 7)))			; (do (def user/delta 3) (clojure.core/+ 7 user/delta))

; rewrite macro to be safe (use sysnonyms for vars those should be "local" in macro)

(defmacro m8 [x]
    (let [delta (gensym 'delta)]
        `(do 
	    (def ~delta 10)
            (+ ~x ~delta))))
	
(prn (m8 8))					; 18
(prn delta)						; 3	-- macro didn't chang "delta"
(prn (macroexpand '(m8 8)))			; (do (def delta94 10) (clojure.core/+ 8 delta94))

