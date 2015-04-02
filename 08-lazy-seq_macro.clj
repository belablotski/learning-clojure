; You can define your own lazy seq-producing functions using the lazy-seq macro,
; which takes a body of expressions that will be called on demand to produce a list of 0 or more items.
; Here's a simplified take.
; Source: http://clojure.org/functional_programming


(defn take [n coll]
  (lazy-seq
    (when (pos? n)
      (when-let [s (seq coll)]
       (cons (first s) (take (dec n) (rest s)))))))

(prn (take 5 [1 2 3 4 5 6 7 8 9]))