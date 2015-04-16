; See http://en.wikibooks.org/wiki/Clojure_Programming/Concepts#Namespaces_.5B1.5D
; * require -- load clojure libraries
; * refer -- refer to functions in the current namespace
; * use -- load and refer all in one step
; * import -- refer to Java classes in the current namespace

(require '[clojure.core.reducers])
;(dir clojure.core.reducers)

; List of loaded namespaces
(prn (all-ns))			; (#<Namespace clojure.uuid> #<Namespace clojure.walk> #<Namespace user> #<Namespace clojure.main> #<Namespace clojure.core.reducers> #<Namespace clojure.core> #<Namespace clojure.java.io> #<Namespace clojure.string> #<Namespace clojure.core.protocols> #<Namespace clojure.instant>)


(refer 'clojure.core.reducers)				; refer objects from clojure.core.reducers into current namespace
(prn (reduce + (filter even? [1 2 3 4 5])))	; 6


(use 'clojure.core.reducers)				; (require 'clojure.core.reducers) and (refer 'clojure.core.reducers)

(use '[clojure.core.reducers :only (filter)])	; load and refer only "filter" function
; (use '[clojure.core.reducers :except (filter)])		; load and refer all names except "filter"


; ---------------------------------------------------------------------------------

; current namespace
(prn *ns*)

; names, which are referred into namespace
(prn (ns-refers *ns*))

; checking only one name
(prn ((ns-refers *ns*) 'filter))			; #'clojure.core.reducers/filter
(prn ((ns-refers *ns*) 'dir))				; nil


; ---------------------------------------------------------------------------------

; import - works like "refer" for Java classes
(import java.util.Random)
(prn (.nextInt (Random.)))


; (import [package Class Class...])   -- imports several Java classes
(import [java.util Date Random])
(prn (Date. (long (.nextInt (Random.)))))