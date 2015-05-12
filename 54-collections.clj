; Collections


; Check if object supports collections interface

(prn (coll? [1 2 3]))		; true
(prn (coll? '(+ 2 3)))		; true
(prn (coll? (+ 2 3)))		; false


(prn (seq? [1 2 3]))		; false
(prn (seq? '(1 2 3)))		; true
(prn (seq? (+ 2 3)))		; false

; -----------------------------------------------------------------------------------------------------

; range	-- generate sequence

(prn (range 5))			; (0 1 2 3 4)
;(prn (range))				; infinite sequence
(prn (take 5 (range)))		; (0 1 2 3 4)
(prn (range 5 10 2))		; (5 7 9)		-- works like in Python: [start, end) and step

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

; check if element is in collection
(prn (some #{3} (range 10)))	; 3	-- returns value, not a position
(prn (some #{3} (range 3 10)))	; 3	-- returns value, not a position
(prn (some #{10} (range 10)))	; nil
(prn (some #{nil} [1 2 nil 4 5]))	; nil	-- impossible to check nil

(if (some #{false} [1 2 false 3])	; "FALSE is not found"
  (prn "FALSE is found")
  (prn "FALSE is not found"))

(prn (some #{false} [1 2 false 3]))	; nil

; -----------------------------------------------------------------------------------------------------

; map/filter
(prn (map inc [1 2 3]))		; (2 3 4)
(prn (filter even? [1 2 3]))	; (2)

; reduce
(prn (reduce + [1 2 3 4]))	; 10

; reduce with initial value
(prn (reduce conj [] '(3 2 1)))	; [3 2 1]     -- (conj (conj (conj [] 3) 2) 1)
