; when is if+do, but without else

(def n (int (Math/floor (* (rand) 10))))
(println (str "Number is " n))

(def is-even (= (rem n 2) 0))
(println (str "Number is even? " is-even))

(when is-even
    (println "Double check - really even"))
(when (not is-even)
    (println "Double check - really odd"))