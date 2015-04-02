; anonymous functions

; anonymous function is created and executed
(prn ((fn [s] (str "Hi, " s)) "Alex"))

(prn (map (fn [x] (* x x x)) [1 2 3 4 5]))

; associate your anonymous function with a name
(def hi(fn [] "Hello, World"))
(prn (hi))