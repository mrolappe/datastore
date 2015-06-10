(some true? [false false false])
;; => nil

(some true? [false true false])
;; => true

(some true? [true true true])
;; => true
