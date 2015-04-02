; The easiest way to avoid mutating state is to use immutable data structures. 
; Clojure provides a set of immutable lists, vectors, sets and maps. 
; Since they can't be changed, 'adding' or 'removing' something from an immutable collection means 
; creating a new collection just like the old one but with the needed change. 
; Persistence is a term used to describe the property wherein the old version of the collection is 
; still available after the 'change', and that the collection maintains its performance guarantees
; for most operations. Specifically, this means that the new version can't be created using a full
; copy, since that would require linear time. 
; Inevitably, persistent collections are implemented using linked data structures, so that the new
; versions can share structure with the prior version. Singly-linked lists and trees are the basic 
; functional data structures, to which Clojure adds a hash map, set and vector both based upon 
; array mapped hash tries.
; Source: http://clojure.org/functional_programming
; The collections have readable representations and common interfaces:

(let [my-vector [1 2 3 4]
      my-map {:fred "ethel"}
      my-list (list 4 3 2 1)]
  (list
    (prn "New states of our collections:")
    (prn (conj my-vector 5))
    (prn (assoc my-map :ricky "lucy"))
    (prn (conj my-list 5))
    
    (prn "Originals are intact:")
    (prn my-vector)
    (prn my-map)
    (prn my-list)))