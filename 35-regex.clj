; pound, open quote, close quote: #"regular-expression"


(def s "My phone number is 425-283-0000, please call during business hours")

(prn s)

(prn (re-find #"\d{3}-\d{3}-\d{4}" s))		; returns "425-283-0000"

(prn (clojure.string/replace s (re-find #"\d{3}-\d{3}-\d{4}" s) "XXX-XX-XXXX"))		; mask my phone number




(def s "Home phone: 425-283-0000, business phone: 425-283-0001")

(prn (re-find #"\d{3}-\d{3}-\d{4}" s))		; returns "425-283-0000"

(prn (clojure.string/replace s (re-find #"\d{3}-\d{3}-\d{4}" s) "XXX-XX-XXXX"))		; mask first phone only
