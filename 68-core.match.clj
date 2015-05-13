; Use core.match to code logic as patterns to match.

(ns com.abelablotski.demo201505112112
  (:gen-class))

(require '[clojure.core.match :refer [match]])

(def v1 [100 101 102])

; match -- match both structure and values

(prn (match v1			; z=102
  [_ y] (str "y=" y)
  [_ _ z] (str "z=" z)))

(prn (match v1			; But this y=102
  [_ y 101] (str "Not this y=" y)
  [_ y 102] (str "But this y=" y)))
