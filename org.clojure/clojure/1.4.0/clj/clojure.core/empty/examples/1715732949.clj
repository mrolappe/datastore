;; The output will not necessarily be of the same JVM class as the input
(class (seq [1]))
;; => clojure.lang.PersistentVector$ChunkedSeq

(class (empty (seq [1])))
;; => clojure.lang.PersistentList$EmptyList
