;; atom? returns true if the form passed does not 
;; implement IPersistentCollection. The atom referred 
;; here is not the atom used in managing mutable state  

(require '[clojure.inspector :refer (atom?)])

(atom? 1)
;; => true

(atom? \a)
;; => true

(atom? "hello world")
;; => true

(atom? :keyword)
;; => true

(atom? nil)
;; => true

(atom? '())
;; => false

(atom? [1, 3, 5])
;; => false

(atom? #{\a \e \i \o \u})
;; => false

(atom? {:x 16 :y 25})
;; => false
