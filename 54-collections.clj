; Collections


; Check if object supports collections interface

(prn (coll? [1 2 3]))		; true
(prn (coll? '(+ 2 3)))		; true
(prn (coll? (+ 2 3)))		; false


(prn (seq? [1 2 3]))		; false
(prn (seq? '(1 2 3)))		; true
(prn (seq? (+ 2 3)))		; false

; -----------------------------------------------------------------------------------------------------

; range

(prn (range 5))			; (0 1 2 3 4)
;(prn (range))				; infinite sequence
(prn (take 5 (range)))		; (0 1 2 3 4)

; -----------------------------------------------------------------------------------------------------

; add element

; add at the beginning of a list or vector
(prn (cons 4 [1 2 3]))		; (4 1 2 3)
(prn (cons 4 '(1 2 3)))	; (4 1 2 3)

; add element in the most efficient way.
; For lists: at the beginning. 
; For vectors: at the end.
(prn (conj [1 2 3] 4))		; [1 2 3 4]
(prn (conj '(1 2 3) 4))		; (4 1 2 3)

; list/vector concatenation
(prn (concat [1 2] '(3 4)))	; (1 2 3 4)
(prn (concat [1 2] [3 4]))	; (1 2 3 4)
(prn (concat '(1 2) [3 4]))	; (1 2 3 4)

; -----------------------------------------------------------------------------------------------------

; map/filter
(prn (map inc [1 2 3]))		; (2 3 4)
(prn (filter even? [1 2 3]))	; (2)

; reduce
(prn (reduce + [1 2 3 4]))	; 10

; reduce with initial value
(prn (reduce conj [] '(3 2 1)))	; [3 2 1]     -- (conj (conj (conj [] 3) 2) 1)
