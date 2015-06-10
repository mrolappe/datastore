;; Behaves somewhat similar to map, but notice the differences
(map [:zeroth :first :second :third :fourth] [0 2 4 0])
;; => (:zeroth :second :fourth :zeroth)

;; 1. replace returns a vector, while map returns a seq
                                        ; 2. replace keeps unmatched values, while map replace with nil
(map {} [0])
;; => (nil)

(map [] [0])
;; => IndexOutOfBoundsException   clojure.lang.PersistentVector.arrayFor (PersistentVector.java:107)
