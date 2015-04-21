; Clojure uses Java object types for booleans, strings and numbers.

(prn (class 1)) 		; java.lang.Long by default
(prn (class 1.))		; java.lang.Double
(prn (class ""))		; java.lang.String
(prn (class false)) 	; java.lang.Boolean
(prn (class nil))		; "null" value

(prn (class [1 2]))	; clojure.lang.PersistentVector
(prn (class '(1 2)))	; clojure.lang.PersistentList