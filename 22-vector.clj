; vector is 0-indexed collection:

(def v [3 2 1])
(prn v)

(prn (get [3 2 1] 0))
(prn (get [3 2 1] 1))
(prn (get [3 2 1] 2))
(prn (get [3 2 1] 3))		; nil


; vector can contain elements of different types

(def v2 [+ {:a 100 :b 200}])

(prn ((get v2 0) (:a (get v2 1)) (:b (get v2 1))))


; new elements get added to the end of a vector

(conj v 5)
(prn v)		; still [3 2 1] - data structures in Clojure are immutable

(def v2 (conj v 5))
(prn v)		; this is persistent - [3 2 1]
(prn v2)	; [3 2 1 5]