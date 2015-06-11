(set? #{1 2 3})
;; => true

(set? [1 2 3])
;; => false

(set? {:a 1 :b 2})
;; => false
