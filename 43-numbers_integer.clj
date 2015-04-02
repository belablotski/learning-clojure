; Source http://en.wikibooks.org/wiki/Clojure_Programming/Concepts

(prn (format "%#x" (bit-and 2r1100 2r0100)))	; numbers with radix 2
(prn (bit-test 0x09 0x03))			; hex
(prn (bit-shift-left 03 1))			; octal


; *** Converting Integers to Strings ***
; One general purpose way to format any data for printing is to use a java.util.Formatter.
; The predefined convenience function format makes using a Formatter easy (the hash in %#x displays the number as a hexadecimal number prefixed with 0x)

(prn (format "%#x" 256))

; Converting integers to strings is even easier with java.lang.Integer. Note that since the methods are static, we must use the "/" syntax instead of ".method"

(prn (Integer/toBinaryString 10))
(prn (Integer/toHexString 10))
(prn (Integer/toOctalString 10))

(Integer/toString 10 2)			; specify radix
(. Integer toBinaryString 10)	        ;special form used for accessing arbitrary (non-private) fields or methods in Java as explained in the Clojure Reference (Java Interop)


; *** Converting Strings to Integers ***
; For converting strings to integers, we can again use java.lang.Integer. This is shown below.

(prn (Integer/parseInt "A" 16))      ; hex
(prn (Integer/parseInt "1010" 2))    ; bin
(prn (Integer/parseInt "10" 8))      ; oct
(prn (Integer/parseInt "8"))         ; dec
