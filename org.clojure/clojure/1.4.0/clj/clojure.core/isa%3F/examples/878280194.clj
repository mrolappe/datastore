(import 'java.util.PriorityQueue)
;; => java.util.PriorityQueue

(bases PriorityQueue)
;; => (java.util.AbstractQueue java.io.Serializable)

(import 'java.util.AbstractQueue)
;; => java.util.AbstractQueue

(isa? PriorityQueue AbstractQueue)
;; => true

(bases AbstractQueue)
;; => (java.util.AbstractCollection java.util.Queue)

(isa? PriorityQueue java.util.AbstractCollection)
;; => true

(isa? PriorityQueue java.util.Queue)
;; => true

(isa? java.util.PriorityQueue java.util.TreeMap)
;; => false
