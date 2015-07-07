; Check pre- and post-conditions (works like assert)
; See http://clojure.org/special_forms

(defn f
  [x]
  {:pre [(> x 0)] 
   :post [(> % 5), (< % 7)] }
  (+ x 3))
 
(prn (f 3))
;(prn (f 2)) 	; Exception in thread "main" java.lang.AssertionError: Assert failed: (> % 5), compiling:(D:\Clojure\learning-clojure\70-pre-post.clj:8:11)
;(prn (f 5))	; Exception in thread "main" java.lang.AssertionError: Assert failed: (< % 7), compiling:(D:\Clojure\learning-clojure\70-pre-post.clj:7:11)
;(prn (f -5))	; Exception in thread "main" java.lang.AssertionError: Assert failed: (> x 0), compiling:(D:\Clojure\learning-clojure\70-pre-post.clj:8:12)
