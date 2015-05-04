(= (float 1.0e9)
   (double 1.0e9))
;; => true

;; hash is not consistent with = for all float/double values
(= (hash (float 1.0e9))
   (hash (double 1.0e9)))
;; => false
