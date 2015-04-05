(def greeting-type (not true))

(def hi
    (if greeting-type
        "Hello World"
        "Goodbye World"))

(def hi-random
    (if (> (rand) 0.5)
        "Hello World"
        "Goodbye World"))

(prn hi)
(prn hi-random)


(prn (rand-nth ["Hello" "Goodbye"]))

; other random: GUID
(prn (java.util.UUID/randomUUID))