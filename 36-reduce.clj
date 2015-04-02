; "process each element and return result"

(prn (+ (+ (+ 1 2) 3) 4))
(prn (reduce + [1 2 3 4]))


; reduce can take an optional initial value
(prn (reduce + 1000 [1 2 3 4]))