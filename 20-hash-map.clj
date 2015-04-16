; Hash maps, clojure.lang.PersistentHashMap
; Hash tables support near constanttime lookup and insertion, but also require a additional amount of memory.
; This is default implementation for maps with more than 10 elements.
; The assoc on array map yields to hash map once map becomes large. The dissoc on a hash map will not yield an array map, even if it becomes small.

(def hm (hash-map :a 1 :b 2))

(prn hm)