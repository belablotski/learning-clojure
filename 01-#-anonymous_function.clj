; function call
(+ 2 1)

; anonymous function (the % is placeholder for parameter)
#(+ % 1)

; call anonymous function
(prn (#(+ % 1) 5))

; many parameters: %1, %2, %3, ... The % is equivalent to %1
(prn (#(+ %1 %2 %3) 100 200 300))

; rest parameter in anonymous function
(prn (#(str %1 %2 %3 %&) 100 200 300 400 500 600))