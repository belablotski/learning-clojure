; max with comparator
; https://clojuredocs.org/clojure.core/max-key

(def v [["new year" "2015-01-01 00:00:00"]
          ["7 nov" "2015-11-07 00:00:00"]
	  ["23 feb" "2015-02-23 00:00:00"]
	  ["8 mar" "2015-03-08 00:00:00"]])

(prn (apply max-key #(.getTime (.parse (java.text.SimpleDateFormat. "yyyy-MM-dd HH:mm:ss") %)) (map #(get % 1) v)))
