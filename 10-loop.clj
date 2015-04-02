(loop [n 10]
  (if (> n 0)
    (do (prn n) (recur (- n 1)))
  )
)