; Use if-not instead (if (not ...)) where is possible

(def greeting-type (not true))

(def hi
    (if-not greeting-type
        "Hello World"
        "Goodbye World"))

(def hi-random
    (if-not (> (rand) 0.5)
        "Hello World"
        "Goodbye World"))

(prn hi)
(prn hi-random)


(prn (rand-nth ["Hello" "Goodbye"]))
