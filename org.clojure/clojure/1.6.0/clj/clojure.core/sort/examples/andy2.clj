(def x (to-array [32 9 11]))
;; => #'user/x

;; You can seq an array, the result being the sequence of its elements.

(seq x)
;; => (32 9 11)

;; You can sort it to return the sequence in sorted order

(sort x)
;; => (9 11 32)

;; But sorting also modifies the backing JVM array. Note that (seq x) changed.

(seq x)
;; => (9 11 32)

;; One may avoid this by manually copying the array. Note that this is
;; only required for mutable Java arrays, Clojure persistent
;; collections will not present this behavior.

(sort (aclone x))
;; => (9 11 32)
