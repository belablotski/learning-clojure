; You can create local names for values inside a function using let.
; Locals created with let are not variables. Once created their values never change!
; Source: http://clojure.org/functional_programming
; The scope of any local names is lexical, so a function created in 
; the scope of local names will close over their values:

(defn make-adder [x]
  (let [y x]
    (fn [z] (+ y z))))

(def add2 (make-adder 2))

(prn (add2 4))

;------------------------------------------------------------------------------------------------------

; 'let' is a block with local variables:
; (let						<-- start locals
;	[name1 value1 name2 value2]		<-- local variables
;	(+ name1 name2)				<-- operations with locals
; )						<-- end locals

; let benefits:
; * They provide clarity by allowing you to name things
; * They allow you to evaluate an expression only once and re-use the result. 
;   This is especially important when you need to re-use the result of an expensive function call. 
;   It's also important when the expression has side effects.


(prn (let [a 500]))	; nil - actually here let do nothing

(prn (let [a 500] a))	; 500

(prn 
  (let [a 100 b 200]
    (+ a b)))


; 'let' introduces new scope
(def x 100)
(prn (let [x 200] x))
(prn (let [x x] x))	; but it's possible to access outer closure during defining names in 'let' block

;------------------------------------------------------------------------------------------------------

; let forms follow all the destructuring rules as well (in example below - for vector)
; let with rest-parameters
(prn
  (let [[x y & others] [1 2 3 4 5]]
    (str x "-" y "-" others)))

;------------------------------------------------------------------------------------------------------

; let forms follow all the destructuring rules as well (in example below - for map)
(prn
  (let [{key1 :key value1 :value} {:key "kkk" :value "vvv"}]
    (str key1 "---" value1)))
