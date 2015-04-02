; Functions can return other functions. 
; The returned functions are closures: they can access all the variables that were in scope when the function was created.
; Source http://www.braveclojure.com/do-things/

; inc-by is in scope, so the returned function has access to it even
; when the returned function is used outside inc-maker
(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc1 (inc-maker 1))
(def inc2 (inc-maker 2))
(def inc3 (inc-maker 3))

(prn (inc1 7))
(prn (inc2 7))
(prn (inc3 7))
