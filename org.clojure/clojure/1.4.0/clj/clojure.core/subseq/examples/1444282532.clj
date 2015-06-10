;; Note, that collection passed to subseq must implement Sorted.  
;; Just passing a collection that has been sorted is not enough.

(subseq [1 2 3 4] > 2)
;; => java.lang.ClassCastException: clojure.lang.PersistentVector cannot be cast to clojure.lang.Sorted (NO_SOURCE_FILE:0)

(subseq (sorted-set 1 2 3 4) > 2)
;; => (3 4)
