; Ratio
; Represents a ratio between integers. Division of integers that can't be reduced to an integer yields a ratio, i.e. 22/7 = 22/7, rather than a floating point or truncated value.
; Ratios allows a computation to be maintained in numeric form. This can help avoid inaccuracies in long computations.
; Source http://en.wikibooks.org/wiki/Clojure_Programming/Concepts

; floating-point numbers
(def a (/ 1.0 3.0))
(def b (/ 3.0 1.0))
 
(prn (* a b))		; 1.0
 
(def c (* a a a a a a a a a a))
(def d (* b b b b b b b b b b))
 
(prn (* c d))		; 0.9999999999999996


; ratios
(def a (/ 1 3))
(def b (/ 3 1))
 
(prn (* a b))		; 1N

(def c (* a a a a a a a a a a))
(def d (* b b b b b b b b b b))
 
(prn (* c d))		; 1N