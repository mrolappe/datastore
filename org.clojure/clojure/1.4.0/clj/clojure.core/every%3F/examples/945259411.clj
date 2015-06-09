;; you can use every? with a set as the predicate to return true if 
;; every member of a collection is in the set
(every? #{1 2} [1 2 3])
;; => false

(every? #{1 2} [1 2])
;; => true

;; or use a hash-map as the predicate with every? to return true 
;; if every member of a collection is a key within the map
(every? {1 "one" 2 "two"} [1 2])
;; => true

(every? {1 "one" 2 "two"} [1 2 3])
;; => false
