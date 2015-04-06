(prn (hash-set 1 2 3 4 5))

(prn (hash-set :a :b :c))			; #{:c :b :a}
(prn (hash-set :a [:b :c]))			; #{[:b :c] :a}
(prn (apply hash-set :a [:b :c]))		; #{:c :b :a}