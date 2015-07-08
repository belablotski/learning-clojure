; Useful shortcuts
; + intervals checking

(def x (rand))

(prn x)

(if-not (< 0.33 x 0.66) 
	(do (prn "x below 0.33 or above 0.66") (prn (* x 2)))
	(do (prn "x between 0.33 and 0.66") (prn (* x 3))))



; if + do = when

(when-not (< 0.33 x 0.66) 
	(prn "x below 0.33 or above 0.66") (prn (* x 2)))

