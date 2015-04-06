; Sets created with sorted-set keep their elements in ascending order using compare.

(prn (sorted-set 1 2 3 4 1 2 3 4))


; Using sorted set
(def alphabet (into (sorted-set) "qwertyuiopasdfghjklzxcvbnm"))
(prn (last alphabet))				; \z
(prn (second (disj alphabet \b)))		; \c


; Use sorted-set-by function to define how a set is sorted
; Specify a custom comparator using sorted-set-by.

(def desc-num (sorted-set-by > 1 2 3))
(prn desc-num)							; #{3 2 1}
(prn (into desc-num [1 3 5]))				; #{5 3 2 1}