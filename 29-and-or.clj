; or -- returns first "true" value, or its' last argument

(prn (or false false false true false))
(prn (or nil nil "hello" nil))
(prn ((or nil nil + nil nil) 1 2))			; + is a first "true" value
(prn (or nil nil nil))					; nil is the last in a list


(prn "------------------------")

; and -- returns first "false" value, or its' last argument
(prn (and true true false true))
(prn (and true true true))
(prn (and true true nil true))
