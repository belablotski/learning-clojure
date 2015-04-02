; Clojure uses Java interfaces to define its core data structures.
; This allows for extensions of Clojure to new concrete implementations of these interfaces,
; and the library functions will work with these extensions. This is a big improvement vs.
; hardwiring a language to the concrete implementations of its data types.

; A good example of this is the seq interface.
; By making the core Lisp list construct into an abstraction, a wealth of library functions
; are extended to any data structure that can provide a sequential interface to its contents.
; *All of the Clojure data structures can provide seqs.* Seqs can be used like iterators or
; generators in other languages, with the significant advantage that seqs are immutable and persistent.
; Seqs are extremely simple, providing a first function, which return the first item in the sequence,
; and a rest function which returns the rest of the sequence, which is itself either a seq or nil.

; seq interface (first and rest functions):
; * supported by all collections
; * provides iterators
; * immutable
; * persistent

; Source: http://clojure.org/functional_programming

(let [my-vector [1 2 3 4]
      my-map {:fred "ethel" :ricky "lucy"}
      my-list (list 4 3 2 1)]
  [(prn "first: " (first my-vector))
   (prn "rest: " (rest my-vector))
   (prn "first: " (keys my-map))
   (prn "rest: " (vals my-map))
   (prn "first: " (first my-list))
   (prn "rest: " (rest my-list))])