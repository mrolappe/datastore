(hash "a")
;; => 97

(.hashCode "a")  ; notice it is the same hash as java.lang.String.hashCode()
;; => 97

(hash [1 2 3])
;; => 30817

(hash [1 2 3 4])
;; => 955331
