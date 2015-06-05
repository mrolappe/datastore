;; Can be used to test set membership
(def s #{"a" "b" "c"})
;; => #'user/s

(contains? s "a")
;; => true

(contains? s "z")
;; => false
