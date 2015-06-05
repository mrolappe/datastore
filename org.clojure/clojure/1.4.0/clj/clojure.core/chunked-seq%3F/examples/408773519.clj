(chunked-seq? (range 1000))
;; => false

(chunked-seq? (seq (range 1000)))
;; => true

(chunked-seq? (iterate inc 10))
;; => false

(chunked-seq? (seq (iterate inc 10)))
;; => false
