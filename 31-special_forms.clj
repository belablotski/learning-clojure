; special forms:
;   * don't always evaluate all of their operands, unlike function calls
;   * impossible to use them as arguments to functions

(if true
  (prn "This is evaluated" (+ 1 2 3))
  (prn "This is not evaluated" (+ 1 2 3))
)

(prn			; works, prints "1"
  (if true
    1
    0
  )
)
