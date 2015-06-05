(decimal? 1)
;; => false

(decimal? 1.0)
;; => false

(decimal? 1M)
;; => true

(decimal? 99999999999999999999999999999999999)
;; => false

(decimal? 1.0M)
;; => true
