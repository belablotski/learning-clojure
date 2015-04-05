; http://clojure.github.io/clojure/clojure.string-api.html

(def s1 "Just say \"Hello, World\".\nIt's really simple.")

(println s1)

(println (str "\n\n" "And once again..." "\n" s1))


; Collection to string
(prn (apply str ["aaa" "bbb" "ccc"]))		; "aaabbbccc"

(prn (clojure.string/join [1 2 3 4]))			; "1234"

(prn (clojure.string/join "," [1 2 3 4]))		; "1,2,3,4"


; Chars in string
(prn (seq "hello"))					; (\h \e \l \l \o)
(prn (int \A))						; 65 (ASCII code of 'A')
(prn (map int (seq "hello")))				; (104 101 108 108 111)

(prn (char 65))						; A
