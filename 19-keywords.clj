; Keywords can be used as functions those look up the corresponding value in a data structure. 

(def subaru-models
     {:SUV "Forester"
      :wagon "Outback"
      :sedan "Legacy"
      :hatchback "Impreza"})

(prn (:SUV subaru-models))
(prn (:convertible subaru-models))
(prn (:convertible subaru-models "No such SUBARU"))