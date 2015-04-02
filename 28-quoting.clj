; Quoting a symbol tells Clojure to use the symbol itself as a data structure, not the object the symbol refers to

(def v [1 2 3 4])

(prn v)
(prn 'v)
(prn (eval 'v))


; quote collections - all symbols within the collection will be unevaluated
(prn [(+ 1 2 3) (- 100 5 3)])		; [6 92]
(prn '[(+ 1 2 3) (- 100 5 3)])		; [(+ 1 2 3) (- 100 5 3)]