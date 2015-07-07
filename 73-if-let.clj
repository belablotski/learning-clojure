; let + if

(if-let [flag (> (rand) 0.3)]
	(prn "Random value was greater then 0.3")
	(prn "Random value was less then 0.3"))