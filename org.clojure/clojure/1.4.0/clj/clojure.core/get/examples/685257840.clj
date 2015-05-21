;; to get an index of the element of a vector, use .indexOf
(def v ["one" "two" "three" "two"])
;; => #'user/v

(.indexOf v "two")
;; => 1

(.indexOf v "foo")
;; => -1
