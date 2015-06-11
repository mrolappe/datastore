;; Both unsorted and sorted maps follow the rule of 'first equal key to
;; be added wins'.  The difference is in what keys they consider to be
;; equal: unsorted uses =, sorted uses compare or a custom comparator.
(def m1
  (hash-map 1.0  "floatone"
            1    "intone"
            1.0M "bigdecone"
            1.5M "bigdec1.5"
            3/2  "ratio1.5"))
;; => #'user/m1

;; Note that every key is unique according to =, so all values are retained.
m1
;; => {1.0  "floatone",
;;     1    "intone",
;;     3/2  "ratio1.5",
;;     1.5M "bigdec1.5",
;;     1.0M "bigdecone"}

;; Dissoc also operates on equality, so if we remove 1 and 1.5...
(dissoc m1 1 3/2)
;; => {1.0  "floatone",
;;     1.5M "bigdec1.5",
;;     1.0M "bigdecone"}
