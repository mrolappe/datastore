;; sort entries in a map by value
(sort-by val > {:foo 7, :bar 3, :baz 5})
;; => ([:foo 7] [:baz 5] [:bar 3])
