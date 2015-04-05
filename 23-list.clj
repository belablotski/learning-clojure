; list is linear collections of values

; list literal is preceding by single quote
'(1 2 3 4)

; list function
(def lst (list 1 2 3 4))
(prn lst)

; get isn't working for lists
(prn (get lst 0))		; nil

; could be a performance issue
(prn (nth lst 0))

; elements get added into beginning
(prn (conj '(1 2 3) 4))

(prn (conj '(1 2 3) 4 5 6))

(prn (conj '(1 2 3) '(4 5 6)))		; list in list


; take first n elements
(prn (take 5 [1 2 3 4 5 6 7 8 9]))


; list from vector
(def v [1 2 3 4])
(prn v)					; [1 2 3 4]
(prn (list v))				; ([1 2 3 4])  -- mistake: list of vector
(prn (apply list v))			; (1 2 3 4)
(prn (into '() v))				; (4 3 2 1)  -- in fact this is a sequince of conj operations


; remove first element
(prn (pop '(1 2 3 4)))			; (2 3 4)
(prn (rest '(1 2 3 4)))			; (2 3 4)
; removing from empty list
;(prn (pop '()))				; Exception in thread "main" java.lang.IllegalStateException: Can't pop empty list
(prn (rest '()))			; ()


; distinguish list
(prn (list? v))				; false
(prn (seq? v))				; false !!!
(prn (list? (apply list v)))		; true
(prn (seq? (apply list v)))		; true

