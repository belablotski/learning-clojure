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