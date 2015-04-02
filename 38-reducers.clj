; Reducers - A Library and Model for Collection Processing
; http://clojure.com/blog/2012/05/08/reducers-a-library-and-model-for-collection-processing.html

(require '[clojure.core.reducers :as r])

(prn 
  (reduce + 
    (r/filter even? 
      (r/map inc [1 1 1 2]))))