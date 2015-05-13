; Trying Library Without Explicit Dependencies

; Extend ~/.lein/profiles.clj file by adding [lein-try "0.4.1"]

; lein-try will automatically grab the most recent version, if version isn't specified
; $ lein try clj-time
; or
; lein try [com.datomic/datomic-free "0.8.4020.26"] [io.rkn/conformity "0.2.0"]