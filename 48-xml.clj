; xml parsing

(use 'clojure.xml)

(def xml-map (parse "48-xml.xml"))
(prn xml-map)									; XML as map
(prn (:tag xml-map))								;:subaru_cars
(prn (:name (:attrs (get (:content xml-map) 0))))			;Outback