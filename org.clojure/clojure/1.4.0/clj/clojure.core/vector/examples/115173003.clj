;; create an empty vector the long way
(vector)
;; => []

;; create an empty vector the short way
[]
;; => []

;; you can even create vectors with nil values
(vector nil)
;; => [nil]

;; create a vector the long way
(vector 1 2 3)
;; => [1 2 3]

;; create a vector the short way
[1 2 3]
;; => [1 2 3]

;; checking for the 2 results above
(class (vector 1 2 3))
;; => clojure.lang.PersistentVector

(class [1 2 3])
;; => clojure.lang.PersistentVector

(= (vector 1 2 3) [1 2 3])
;; => true

