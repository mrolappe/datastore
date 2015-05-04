(def x 8589934588)
;; => #'user/x
(= (bigint x) (biginteger x))
;; => true

;; hash is not consistent with = for all BigInteger values
(= (hash (bigint x)) (hash (biginteger x)))
;; => false

(def s1 (hash-set (bigint x)))
;; => #'user/s1

(def s2 (hash-set (biginteger x)))
;; => #'user/s2

;; s1 and s2 look the same
s1
;; => #{8589934588N}

s2
;; =>  #{8589934588}

;; their elements are =
(= (first s1) (first s2))
;; => true

;; However, the sets are not = because of hash inconsistency.
(= s1 s2)
;; => false
