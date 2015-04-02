; flatten transforms list of lists into flattened list


(def text [["Hello" "World"] ["I" "love" "lisp"] ["I" "like" "functional" "programming"]])

(prn (flatten text))

(prn (reduce #(str %1 " " %2) (flatten (map #(conj % ".") text))))




(def corpus [text text text])

(prn (reduce str (interpose " " (flatten corpus))))		; flatten works with several levels as well

