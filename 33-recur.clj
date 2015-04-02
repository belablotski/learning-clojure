; Recursive down count
; recur works in tail position only

; Since Clojure uses the Java calling conventions, it cannot, and does not, make the same tail call 
; optimization guarantees. Instead, it provides the recur special operator, which does constant-space 
; recursive looping by rebinding and jumping to the nearest enclosing loop or function frame. 
; While not as general as tail-call-optimization, it allows most of the same elegant constructs, and 
; offers the advantage of checking that calls to recur can only happen in a tail position.
; http://clojure.org/functional_programming

(defn down-count [n]
  (if (<= n 1)
    1
    (do (prn n) (recur (- n 1)))
  )
)

(prn (str "Start for 3: " (down-count 3)))
(prn (str "Start for 5: " (down-count 5)))



; ERROR:
; Exception in thread "main" java.lang.UnsupportedOperationException: 
; Can only recur from tail position, compiling:(D:\Projects2\Clojure\experiments\33-recur.clj:

(defn down-count [n]
  (if (<= n 1)
    1
    (do (recur (- n 1)) (prn n))
  )
)

(prn (str "Start for 3: " (down-count 3)))
(prn (str "Start for 5: " (down-count 5)))