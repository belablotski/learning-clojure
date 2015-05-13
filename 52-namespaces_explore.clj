(use '[clojure.repl])
(use '[clojure.core.reducers])

; Loaded libs
(prn "Loaded libs:")
(prn (loaded-libs))

; Public vars into namespace
(prn "Public vars into namespace:")
(dir clojure.core.reducers)

; Mapping of symbols to public vars in a namespace:
(prn "Mapping of symbols to public vars in a namespace:")
(ns-publics 'clojure.core)