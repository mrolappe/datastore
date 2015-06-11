;; Metadata is ignored when comparing values to each other.
(= (with-meta #{1 2 3} {:key1 1})
   (with-meta #{1 2 3} {:key1 2}))
;; => true
