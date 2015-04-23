; load Java module
(import java.util.Date)

; construct new object instance
(def dt (Date.))
(prn dt)					; #inst "2015-04-21T18:43:16.416-00:00"

; call Java method (two syntaxes)
(prn (. (Date.) getTime))		; 1429641860423
(prn (.getTime (Date.)))		; 1429641860423

; call Java static method
(prn (System/currentTimeMillis))	; 1429641908884

; manipulate with mutable objects
(import java.util.Calendar)
(prn (doto (Calendar/getInstance)
        (.set 2000 1 1 0 0 0)
         .getTime))				; #inst "2000-02-01T00:00:00.638-08:00"
	 
