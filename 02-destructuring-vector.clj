; concisely bind symbols to values within a collection


; Function receives a list or a vector or a set as an argument and split it apart to named arguments (like Python does for list with parameters *)

(defn my-prn
  [[first, second, third & other]]
  (prn (str "First: " first))
  (prn (str "Second: " second))
  (prn (str "Third: " third))
  (prn (str "Other: " (clojure.string/join ", " other))))

(my-prn ["one"])
(println "-------------------------------------------------------------------------------")
(my-prn ["one", "two"])
(println "-------------------------------------------------------------------------------")
(my-prn ["one", "two", "three"])
(println "-------------------------------------------------------------------------------")
(my-prn ["one", "two", "three", "four"])
(println "-------------------------------------------------------------------------------")
(my-prn ["one", "two", "three", "four", "five"])