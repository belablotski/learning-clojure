; Software Transactional Memory (STM)
; STM is the mechanism clojure uses to handle persistent state.


; ATOM a - will behave like a mutable object: its' state will be updated (without creating new object)

; atom the simplest sync primitive
(def a (atom {:k1 "val 1" :k2 "val 2"}))
(prn a)							; #<Atom@da62f80: {:k1 "val 1", :k2 "val 2"}>

; Update an atom with swap!
(swap! a assoc :k1 "new val 1")
(prn a)							; #<Atom@da62f80: {:k1 "new val 1", :k2 "val 2"}>

(swap! a assoc :k3 "val 3" :k4 "val 4")
(prn a)							; #<Atom@da62f80: {:k3 "val 3", :k4 "val 4", :k1 "new val 1", :k2 "val 2"}>

; '@' to dereference the atom
(prn @a)							; {:k3 "val 3", :k4 "val 4", :k1 "new val 1", :k2 "val 2"}


; ------------------------------------------------------------------------------------------------------------------------

; Classic counter example

(def cnt (atom 0))
(defn inc-cnt []
    (swap! cnt inc))

(inc-cnt)
(inc-cnt)
(inc-cnt)

(prn @cnt)							; 3