;; A really goofy way to find the size of a collection
(reduce + (map (constantly 1) [:a :b :c]))
;; => 3
