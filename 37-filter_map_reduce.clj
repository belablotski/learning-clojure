; interpose = Python join() function

(defn process [list-of-words]
  (reduce str 
    (interpose "," 
      (map clojure.string/upper-case 
        (filter #(< 1 (count %)) list-of-words)))))

(prn (process ["hello" "a" "beautiful" "world"]))



; Using thread-last macro
(defn process [list-of-words]
  (->> list-of-words
    (filter #(< 1 (count %)))
    (map clojure.string/capitalize)
    (interpose ",")
    (reduce str)))

(prn (process ["hello" "a" "beautiful" "world"]))