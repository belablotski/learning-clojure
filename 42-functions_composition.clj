; Composition of several functions
; Use function (comp f g h) instead of (f (g (h )))

; Simple composition

(prn (map #((comp inc dec) %) [1 -2 3]))



; Using Java classes

(prn (map #(inc (Math/abs %)) [1 -2 3]))

;(prn (map #((comp inc Math/abs) %) [1 -2 3]))		; Error: Unable to find static field: abs in class java.lang.Math

(prn (map #((comp inc (fn [x] (Math/abs x))) %) [1 -2 3]))