;; Warning: You can sort a Java array and get back a sorted immutable Clojure
;; data structure, but it will also change the input Java array, by sorting it.
;; Copy the array before sorting if you want to avoid this.

(def x
  (to-array [32 11]))
;; => #'user/x

(seq x)
;; => (32 11)

(def y
  (sort x))
;; => #'user/y

;; Return sorted sequence
y
;; => (11 32)

(class y)
;; => clojure.lang.ArraySeq

;; but also modifies x, because it used the array to do the sorting.
(seq x)
;; => (11 32)

;; One way to avoid this is copying the array before sorting:
(def y
  (sort (aclone x)))
;; => #'user/y
