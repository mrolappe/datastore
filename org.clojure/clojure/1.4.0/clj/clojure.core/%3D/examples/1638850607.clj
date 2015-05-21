(= 1)
;; => true

(= 1 1)
;; => true

(= 1 2)
;; => false

(= 1 1 1)
;; => true

(= 1 1 2)
;; => false

(= '(1 2) [1 2])
;; => true

(= nil nil)
;; => true

;; It should be noted that equality is not defined for Java arrays.
;; Instead you can convert them into sequences and compare them that way.
;; (= (seq array1) (seq array2))
