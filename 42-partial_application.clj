; Create function with partially pre-defined arguments.
; This is "function factory" pattern...

(defn mul [x y] (* x y))

(def x2 (partial mul 2))
(def x10 (partial mul 10))

(prn (mul 2 4))
(prn (x2 7))
(prn (x10 3))


; Even with "standard" function
(def my-inc (partial + 1))
(def my-dec (partial - 1))

(prn (my-inc 33))
(prn (my-dec 33))	; incorrect. will be 1-33 = -32


; Use wrapper to correct my-dec
(def my-dec #(dec %))

(prn (my-dec 33))


; https://clojuredocs.org/clojure.core/partial
(use '[clojure.pprint :only (pp pprint)])
(def to-english (partial clojure.pprint/cl-format nil "~@(~@[~R~]~^ ~A.~)"))
(prn (to-english 12345))
(prn (to-english 1234567890))
(prn (to-english 12345678901234567890))