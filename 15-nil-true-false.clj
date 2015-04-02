(def x true)
(println (str "x=" x))
(println (str "x is nil? " (nil? x)))
(when x (println "x acts like 'true' value"))


(def x false)
(println (str "x=" x))
(println (str "x is nil? " (nil? x)))
(when x (println "x acts like 'true' value"))


(def x nil)
(println (str "x=" x))
(println (str "x is nil? " (nil? x)))
(when x (println "x acts like 'true' value"))		; in this case nil is treated like false

