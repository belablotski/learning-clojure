; Sorted maps, clojure.lang.PersistentTreeMap
; Implemented as a balanced red-black binary tree. 
; They are more space-efficient than hash maps, but have slower insertion and access times.
; assoc or conj on a sorted map will always yield another sorted map.

(def sm (sorted-map :c 3 :a 1 :d 4 :b 2 :e 5 :a 11))

(def m {:c 3 :a 1 :d 4 :b 2 :e 5})

(prn sm)
(prn m)


; Sorted map with custom comparator
(def irr-verbs (sorted-map-by #(< (count %1) (count %2))
	"arise" 1,
	"awake" 2,
	"backslide" 1,
	"be" 3,
	"bear" 1,
	"beat" 4,
	"become" 1,
	"begin" 5,
	"bend" 1,
	"bet" 3,
	"bid" 1,
	"bind" 4,
	"bite" 1,
	"bleed" 5,
	"blow" 1,
	"break" 1,
	"breed" 2,
	"bring" 3,
	"broadcast" 1,
	"browbeat" 1,
	"build" 4,
	"burn" 4,
	"burst" 5,
	"bust" 1,
	"buy" 1,
	"cast" 1,
	"catch" 6,
	"choose" 1,
	"cling" 1,
	"clothe" 5,
	"come" 1,
	"cost" 1,
	"creep" 3,
	"crossbreed" 1,
	"cut" 2 ))

(prn irr-verbs)			; {"be" 3, "bet" 2, "bear" 1, "arise" 3, "become" 5, "browbeat" 1, "backslide" 1, "crossbreed" 1}
