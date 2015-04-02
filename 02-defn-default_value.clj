; Implementing a "default value" for function parameter

(defn hi
  ([] (hi "Unknown" nil))
  ([name] (hi name nil))
  ([name surname] (str "Hi " name " " surname)))

(prn (hi))
(prn (hi "Aliaksei"))
(prn (hi "Aliaksei" "Belablotski"))