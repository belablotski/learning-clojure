; Applications often need to associate attributes and other data about data that is orthogonal 
; to the logical value of the data. Clojure provides direct support for this metadata. Symbols,
; and all of the collections, support a metadata map. It can be accessed with the meta function.
; Metadata does not impact equality semantics, nor will metadata be seen in operations on the
; value of a collection. Metadata can be read, and can be printed.
; Source: http://clojure.org/functional_programming


(def v [1 2 3])
(def attributed-v (with-meta v {:source :trusted}))

; nil
(prn (meta v))

{:source :trusted}
(prn (meta attributed-v))

; :trusted
(prn (:source (meta attributed-v)))

; true
(prn (= v attributed-v))
