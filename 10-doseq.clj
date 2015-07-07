; See https://clojuredocs.org/clojure.core/doseq

; Python zip function analogue in Clojure
(prn (map list [1 2 3] [1 2 3]))

(doseq [[x y]
  (map list [1 2 3] [1 2 3])] 
    (prn (* x y)))