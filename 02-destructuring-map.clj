; concisely bind symbols to values within a collection


; Function receives a map as an argument and split it apart to named arguments (like Python does for dictionary with params **)

(defn my-prn
  [{key :key value :value}]
  (prn (str "Key: " key))
  (prn (str "Value: " value)))

; another syntax
(defn my-prn2
  [{:keys [key value]}]
  (prn (str "Key: " key))
  (prn (str "Value: " value)))

; access to original map
(defn my-prn3
  [{:keys [key value] :as m}]
  (prn (str "Key: " (get m :key)))
  (prn (str "Value: " (get m :value))))


(my-prn {:key "k" :value "v"})
(println "-------------------------------------------------------------------------------")
(my-prn2 {:key "k" :value "v"})
(println "-------------------------------------------------------------------------------")
(my-prn3 {:key "k" :value "v"})
(println "-------------------------------------------------------------------------------")
