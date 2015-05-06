;; Same category integer so this should work
(= 3 3N)
;; => true

;; Different categories, integer and floating point. This may seem unintuitive,
;; however remember that floating point is imprecise. Consequently attempting to
;; compare a finite precision floating point result to an integer is not
;; generally meaningful and doesn't work quite as expected.

(= 2 2.0)
;; => false

;; Remember collections are equivalent if their members are equivalent..

(= [0 1 2] '(0 1 2))
;; => true

;; But floating point and integer values aren't equivalent.

(= '(0 1 2) '(0 1 2.0))
;; => false
