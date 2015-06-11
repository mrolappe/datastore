(sequential? '(1 2 3))
;; => true

(sequential? [1 2 3])
;; => true

(sequential? (range 1 5))
;; => true

(sequential? 1)
;; => false

(sequential? {:a 2 :b 1})
;; => false
