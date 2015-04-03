; Multimethod - polymorphism without inheritance.
; Method dispatching depends on data structure content.

(defstruct person :name :surname)

(def name-only (struct person "Aliaksei" nil))
(def surname-only (struct person nil "Belablotski"))
(def full-name (struct person "Aliaksei" "Belablotski"))

(prn name-only)
(prn surname-only)
(prn full-name)


(defn prn-name-disp [pers]
	(cond (and ((complement nil?) (:name pers)) (nil? (:surname pers))) "name"
		(and ((complement nil?) (:surname pers)) (nil? (:name pers))) "surname"
		true "fullname"))

(defmulti prn-name prn-name-disp)

(defmethod prn-name "name" [pers]
	(str "Hi " (:name pers)))
	
(defmethod prn-name "surname" [pers]
	(str "Hello Mr. " (:surname pers)))

(defmethod prn-name "fullname" [pers]
	(str "Hello " (str (:surname pers) ", " (:name pers))))


(prn (prn-name name-only))
(prn (prn-name surname-only))
(prn (prn-name full-name))