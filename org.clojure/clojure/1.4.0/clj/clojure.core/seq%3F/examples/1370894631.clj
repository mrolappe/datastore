;; contrast to example code for sequential?
;;

(seq? '(1 2 3))
;; => true

(seq? [1 2 3])   ; for sequential?, returns true
;; => false

(seq? (range 1 5))
;; => true

(seq? 1)
;; => false

(seq? {:a 2 :b 1})
;; => false

