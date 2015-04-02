; set is collection of unique values

; set literal
#{ 1 2 3 4 }

; Working with sets

(def s #{ 1 2 3 4 })
(prn s)

(def s1 (conj s 1 2 5))
(prn s1)


; Test if value in a set

(if (nil? (get s1 5))
    (do (prn "5 isn't in a set"))
    (do (prn "5 is in a set"))
)

(if (nil? (get s1 6))
    (do (prn "6 isn't in a set"))
    (do (prn "6 is in a set"))
)

(prn (get s1 100 "NO SUCH VALUE"))


; Constructing sets (set from vector, set from list)

(prn (set [1 2 3 4 1 2 3 4]))
(prn (set '(1 2 3 4 1 2 3 4)))

