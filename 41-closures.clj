; A closure is a function that carries an implicit binding to all the variables referenced within it. 
; I.e. function (or method) encloses a context around the things it references.

; Closures allow us to model behavior by encapsulating both code and context into
; a single construct, the closure, that can be passed around like traditional data structures
; and executed at exactly the correct time and place.
; Capture the context, not the state!!!

; make-counter created count down function with pre-defined number of steps
; Number of steps isn't a fn's parameters - it acts more likely hard-coded constant, - closure example.
(defn make-counter [n]
    (fn [] (loop [i n] 
        (if (> i 0) 
	    (do (prn i) (recur (- i 1)))))))


(def c1 (make-counter 5))
(c1)
(c1)

(def c2 (make-counter 3))
(c2)