; Fibonacci numbers

(defn fib [n]
  (if (<= n 1)
    1
    (+ (fib (- n 1)) (fib (- n 2)))
  )
)

(prn (fib 5))


(prn "-------------------------------------------")


(defn fib [n]
  (if (<= n 1)
    1
    (let [res (+ (fib (- n 1)) (fib (- n 2)))]
      (prn res)
      res
    )
  )
)

(prn (fib 5))