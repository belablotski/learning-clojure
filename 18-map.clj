(def subaru-models
     {:SUV "Forester"
      :wagon "Outback"
      :sedan "Legacy"
      :hatchback "Impreza"})

(prn subaru-models)



(def math-ops
    {:plus +
     :minus -
     :mul *
     :div /})

(prn math-ops)

(prn ((get math-ops :plus) 100 200))
(prn ((get math-ops :div) 100 300))
(prn (get math-ops :xyz))			; key xyz is absent in map, nil will be returned
; (prn ((get math-ops :xyz) 100 300))		; NullPointerException
(prn ((get math-ops :xyz str) 100 300))		; use default value if key is missing
