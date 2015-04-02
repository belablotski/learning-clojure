; Many of the Clojure library functions produce and consume seqs lazily.
; Source: http://clojure.org/functional_programming

; cycle produces an 'infinite' seq!
; (1 2 3 4 1 2 3 4 1 2 3 4 1 2 3)
(prn (take 15 (cycle [1 2 3 4])))

(prn (take 5 (cycle ["Hello" "World"])))