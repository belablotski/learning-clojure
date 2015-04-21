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
(prn v2)		; [3 2 1 5]


; Access and remove last element
(prn (last v2))	; 5
(prn (pop v2))	; [3 2 1]


; Sub-vector
(prn (subvec [1 2 3 4] 1))		; [2 3 4]
(prn (subvec [1 2 3 4] 1 3))		; [2 3]


; Access (read) to elements by index
(prn (nth [1 2 3 4 5] 2))				; 3
;(prn (nth [1 2 3 4 5] 5))					; Exception in thread "main" java.lang.IndexOutOfBoundsException
(prn (nth [1 2 3 4 5] 5 "No such value"))		; "No such value"

; or using vector as a "function"
(prn (v2 2))				; 1 (the third element)
;(prn (v2 10))					; Exception in thread "main" java.lang.IndexOutOfBoundsException
;(prn (v2 -1))					; Exception in thread "main" java.lang.IndexOutOfBoundsException

; or using get
(prn (get v2 2))				; 1 (the third element)
(prn (get v2 10))			; nil


; Set element by index
(prn v2)					; [3 2 1 5]
(prn (assoc v2 1 100))		; [3 100 1 5]

; ---------------------------------------------------------------------------------------------------------------------

; get-in -- traverse thru nested structures

(def vec [0 [10 11 [120 121 123]] 2 3])

(prn (get-in vec [1 2 0]))		; 120

; ---------------------------------------------------------------------------------------------------------------------

; sorting seq

(prn (sort [4 2 3 1]))			; (1 2 3 4)
(prn (sort > [4 2 3 1]))		; (4 3 2 1)

(def vm [{:key "k3", :val "v3"} {:key "k2", :val "v2"} {:key "k1", :val "v1"}])

; compare - compares arguments and returns -1, 0, 1
(prn (sort #(compare (:key %1) (:key %2)) vm))	; ({:key "k1", :val "v1"} {:key "k2", :val "v2"} {:key "k3", :val "v3"})
(prn (sort-by :val vm))						; ({:key "k1", :val "v1"} {:key "k2", :val "v2"} {:key "k3", :val "v3"})
