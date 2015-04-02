; Clojure function definition:
;    * defn
;    * A name
;    * (Optional) a docstring
;    * Parameters
;    * The function body

(defn f
    "Square x"
    [x]
    (* x x)
)

(prn (f 5))
(prn f)
(prn 'f)