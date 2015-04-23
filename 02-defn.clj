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

;--------------------------------------------------------------------------------

; "do" groups statements together without naming this block

(defn f
    [x]
    (do
        (prn (str "x=" x))
        (* x x)))
	
(prn (f 5))


; function definition also groups statements together (explicit "do" isn't needed)
; "let" works in the same way

(defn f
    [x]
    (prn (str "x=" x))
    (* x x))
	
(prn (f 5))

