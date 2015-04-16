; Flattening collection
; Returns the result of applying concat to the result of applying map to f and colls.  Thus function f should return a collection.
; https://clojuredocs.org/clojure.core/mapcat

(prn (mapcat seq [[1 2 3] '(4 5 6) {7 8, 9 10}]))			; (1 2 3 4 5 6 [7 8] [9 10])
(prn (mapcat reverse [[3 2 1 0] [6 5 4] [9 8 7]]))			; (0 1 2 3 4 5 6 7 8 9)
