; map function
; map is applicable for seq

(prn (map inc [1 2 3 4]))								; (2 3 4 5)

(def mul100 (fn [x] (* x 100)))
(prn (map mul100 [1 2 3 4]))								; (100 200 300 400)


; Apply map to dictionary

(def dict {"k1" "v1", "k2" "v2", "k3" "v3"})
(prn dict)
(prn (map #(str %) dict))								; ("[\"k3\" \"v3\"]" "[\"k1\" \"v1\"]" "[\"k2\" \"v2\"]")  -- returns list of [key value] vectors
(prn (map (fn [vec] (str (get vec 0) "-" (get vec 1))) dict))		; ("k3-v3" "k1-v1" "k2-v2")
(prn (map (fn [[k v]] (str k "-" v)) dict))						; ("k3-v3" "k1-v1" "k2-v2")
