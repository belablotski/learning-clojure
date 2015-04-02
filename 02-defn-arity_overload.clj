; Source: http://clojure.org/functional_programming

(defn argcount
  ([] 0)
  ([x] 1)
  ([x y] 2)
  ([x y & more] (+ (argcount x y) (count more))))	; clojure will put other parameters into list named "more"

(prn (argcount))

(prn (argcount 1))

(prn (argcount 1 2))

(prn (argcount 1 2 3 4 5))

(prn (argcount 1 "2" 3 "4" 5 "six"))

(prn "---------------------------------------------------------------------------------------------------------")


; only arguments list -- variable number of parameters
(defn greeting
  [& names]
  (map (defn greet [name] (str "hi " name)) names)
)

(prn (greeting))
(prn (greeting "John"))
(prn (greeting "John" "Tom"))
(prn (greeting "John" "Jim" "Tom"))

(prn "---------------------------------------------------------------------------------------------------------")


; variable arguments should be at the end into parameters list
(defn greeting2
  [whoop & names]
  (str
    whoop
    " "
    (clojure.string/join
      ", "
      (map (defn greet [name] (str "mr. " name)) names))))

;(prn (greeting2))					; error - wrong number of arguments passed
;(prn (greeting2 "Hello")				; error - clojure.string/join with empty list
(prn (greeting2 "Hello" "John"))
(prn (greeting2 "Hello" "John" "Tom"))
