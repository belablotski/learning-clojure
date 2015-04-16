; Array maps, clojure.lang.PersistentArrayMap
; Efficient for very small maps (internally based on simple array).
; This is a default implementation for maps with less than 10 elements.
; Perform assoc onto array map will yield a hash map if it reaches a certain size.
; The dissoc on a hash map will not yield an array map, even if it becomes small.

(prn (array-map))			; empty array map

(def am (array-map "key1" "value1", "key2" "value2", "key3" "value3"))
(prn am)					; {"key1" "value1", "key2" "value2", "key3" "value3"}
(prn (get am "key2"))			; "value2"
(prn (get am "key4"))			; nil

