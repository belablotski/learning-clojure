(def greeting-type (> (rand) (+ 0.1 0.2 0.3)))

(def do-greeting (if greeting-type
    (do (println "Hello World") "Hi")
    (do (println "Goodbye World") "Bye")))

(println (str "Return result of do-greeting: " do-greeting))


