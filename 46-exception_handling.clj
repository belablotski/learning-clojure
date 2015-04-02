; Source: http://en.wikibooks.org/wiki/Clojure_Programming/Concepts#Clojure_Exceptions
;
; In Clojure, exceptions can be handled using the following functions:
; (try expr* catch-clause* finally-clause?)
;    catch-clause -> (catch classname name expr*)
;    finally-clause -> (finally expr*)
;
; (throw expr)
; Two types of exceptions you may want to handle in Clojure are:
;    * Clojure Exception: These are exception generated by Clojure or the underlying Java engine
;    * User Defined Exception: These are exceptions which you might create for your applications

(try (/ 1 0)
    (catch Exception e (prn "in catch"))
    (finally (prn "in finally")))


; --------------------------------------------------------------------------------------------------------

; User-Defined Exceptions
; As mentioned previously, all exceptions in Clojure need to be a subclass of java.lang.Exception (or 
; generally speaking - java.lang.Throwable which is the superclass for Exception). This means that even 
; when you want to define your own exceptions in Clojure, you need to derive it from Exception.


(gen-and-load-class 'user.UserException :extends Exception)		; isn't working

(defn user-exception-test []
  (try
    (throw (new user.UserException "msg: user exception was here!!"))
    (catch user.UserException e
      (prn "caught exception" e))
    (finally (prn "finally clause invoked!!!"))))

