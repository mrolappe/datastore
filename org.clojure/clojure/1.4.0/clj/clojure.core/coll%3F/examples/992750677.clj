;; contrast to example code for sequential?
;;
(coll? '(1 2 3))
;; => true

(coll? [1 2 3])
;; => true

(coll? (range 1 5))
;; => true

(coll? 1)
;; => false

(coll? {:a 2 :b 1})   
;; => true

(coll? {:a 2 :b 1})  ; in contrast to sequential?, coll? returns true for a hash map
;; => true

(sequential? {:a 2 :b 1})
;; => false
