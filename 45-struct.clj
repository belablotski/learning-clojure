; Source http://en.wikibooks.org/wiki/Clojure_Programming/Concepts#Structures
; Structures are created using defstruct which is a macro wrapping the function create-struct which actually 
; creates the struct. defstruct creates the structure using create-struct and binds it to the structure name 
; supplied to defstruct.
; The object returned by create-struct is what is called the structure basis. This is not a structure instance 
; but contains information of what the structure instances should look like. New instances are created using 
; struct or struct-map.

(defstruct employee :name :id)
;(struct employee "Mr. X" 10)
;(struct-map employee :id 20 :name "Mr. Y")
 
(def a (struct-map employee :id 20 :name "Mr. Y"))
(def b (struct employee "Mr. X" 10))
 
; :name and :id are accessors
(prn (:name a))
(prn (:id a))
(prn (b :name))
(prn (b :id))

; ------------------------------------------------------------------------------------------------------------

(def e-str (struct employee "John" 123))
(prn e-str)
 
;("name" e-str) 	                    ; ERROR: string not an accessor
 
(def e-name (accessor employee :name))      ; bind accessor to e-name
(prn (e-name e-str))                        ; use accessor

; -----------------------------------------------------------------------------------------------------------

; As structures are maps, new fields can be added to structure instances using assoc. dissoc can be used to 
; remove these instance specific keys. Note however that struct base keys cannot be removed.

(prn b)                                     ; {:name "Mr. X", :id 10}

(def b1 (assoc b :function "engineer"))
(prn b1)                                    ; {:name "Mr. X", :id 10, :function "engineer"}
 
(def b2 (dissoc b1 :function))              ; this works as :function is instance
(prn b2)                                    ; {:name "Mr. X", :id 10}
 
;(dissoc b2 :name)                          ; this fails. base keys cannot be dissociated
                                            ; ERROR java.lang.Exception: Can't remove struct key

; -----------------------------------------------------------------------------------------------------------

; assoc can also be used to "update" a structure.

; Observe that like other sequences in Clojure, structures are also immutable, hence, simply doing assoc above 
; does not change a. Hence we rebind it to a1. While it is possible to rebind the new value back to a, this 
; is not considered good style.

(prn a)                                     ; {:name "Mr. Y", :id 20}
 
(assoc a :name "New Name")                  ; {:name "New Name", :id 20}
 
(prn a)                                     ; note that 'a' is immutable and did not change
                                            ;  {:name "Mr. Y", :id 20}
 
(def a1 (assoc a :name "Another New Name")) ; bind to a1
(prn a1)                                    ; {:name "Another New Name", :id 20}

