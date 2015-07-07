; Use alter-var-root to change variable's value
; https://clojuredocs.org/clojure.core/alter-var-root

(def x 1)						; 1
(prn x)

(alter-var-root #'x inc)				; 2
(prn x)

(def x (inc x))					; 3, but bad style
(prn x)


; var function.
; The symbol must resolve to a var, and the Var object itself (not its value)
; is returned. The reader macro #'x expands to (var x).
; https://clojuredocs.org/clojure.core/var

(alter-var-root (var x) inc)			; 4 (more readable macro for #'x)
(prn x)


; intern function
; Find / create variable into namespace
; https://clojuredocs.org/clojure.core/intern

(intern 'user 'x 5)				; 5
(prn x)