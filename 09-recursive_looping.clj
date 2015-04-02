; In the absence of mutable local variables, looping and iteration must take a different form than 
; in languages with built-in for or while constructs that are controlled by changing state.
; In functional languages looping and iteration are replaced/implemented via recursive function calls. 

; Many such languages guarantee that function calls made in tail position do not consume stack space,
; and thus recursive loops utilize constant space.
; Since Clojure uses the Java calling conventions, it cannot, and does not, make the same tail call
; optimization guarantees. Instead, it provides the recur special operator, which does constant-space
; recursive looping by rebinding and jumping to the nearest enclosing loop or function frame.
; While not as general as tail-call-optimization, it allows most of the same elegant constructs,
; and offers the advantage of checking that calls to recur can only happen in a tail position.

; Source: http://clojure.org/functional_programming

(defn my-zipmap [keys vals]
  (loop [my-map {}
         my-keys (seq keys)
         my-vals (seq vals)]
    (if (and my-keys my-vals)
      (recur (assoc my-map (first my-keys) (first my-vals))
             (next my-keys)
             (next my-vals))
      my-map)))

(prn (my-zipmap [:a :b :c] [1 2 3]))