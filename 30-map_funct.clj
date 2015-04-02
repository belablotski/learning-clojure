; map function

(prn (map inc [1 2 3 4]))


(def mul100 (fn [x] (* x 100)))
(prn (map mul100 [1 2 3 4]))