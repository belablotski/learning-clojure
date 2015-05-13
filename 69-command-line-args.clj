; Parsing command line arguments

(defn greeting
    [name]
    (str "Hi " name))

(doseq [name *command-line-args*]
    (println (greeting name)))
