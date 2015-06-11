(second '(:alpha :bravo :charlie))
;; => :bravo

(second [1 2 3])
;; => 2

(second {:a 1 :b 2 :c 3})
;; => [:b 2]

(second #{1 2 3})
;; => 2
