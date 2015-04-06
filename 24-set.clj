; set is collection of unique values

; set literal
#{ 1 2 3 4 }

; Working with sets

(def s #{ 1 2 3 4 })
(prn s)

(def s1 (conj s 1 2 5))
(prn s1)


; Test if value in a set

(prn (contains? #{1 2 3 4} 3))	; true
(prn (contains? #{1 2 3 4} nil))	; false
(prn (contains? #{1 2 3 nil} nil))	; true

(if (nil? (get s1 5))
    (do (prn "5 isn't in a set"))
    (do (prn "5 is in a set"))
)

(if (nil? (get s1 6))
    (do (prn "6 isn't in a set"))
    (do (prn "6 is in a set"))
)

(prn (get s1 100 "NO SUCH VALUE"))


; Constructing sets (set from vector, set from list)

(prn (set [1 2 3 4 1 2 3 4]))
(prn (set '(1 2 3 4 1 2 3 4)))
(prn (set "test"))				; #{\e \s \t}	- set of distinct letters from string


; Merging sets

(prn (into #{} [1 2 3]))			; #{1 3 2}
(prn (into #{1 2} [1 2 3]))			; #{1 3 2}


; Manipulations with set elements (add/remove)

(prn (conj #{1 2 3} 4))			; #{1 4 3 2}	- add element
(prn (conj #{1 2 3} #{1 3 6}))		; #{1 #{1 6 3} 3 2}
(prn (apply conj #{1 2 3} #{1 3 6}))	; #{1 6 3 2}	- two lists conjunction

(prn (disj #{1 2 3} 2))				; #{1 3}	- remove element from set
(prn (disj #{1 2 3} 2 3))			; #{1}		- remove elements from set
(prn (disj #{1 2 3 4} #{1 2 5}))		; #{1 4 3 2}	- trying to remove the #{1 2 5} element, which isn't present
(prn (apply disj #{1 2 3 4} #{1 2 5}))	; #{4 3}	- set MINUS opetation


; SET OPETATIONS
; All these functions are available in the clojure.set namespace (built into Clojure)

(use 'clojure.set)
(prn (clojure.set/union #{1 2 3} #{1 2 6} #{1 6 8 9}))		; #{1 6 3 2 9 8}
(prn (clojure.set/intersection #{1 2 3} #{1 2 6} #{1 6 8 9}))	; #{1}
(prn (clojure.set/difference #{1 2 3} #{1 6} #{2 6 8 9}))		; #{3}	- minus from first set
(prn (clojure.set/subset? #{1 2 3} #{1 2 3 4 5}))			; true