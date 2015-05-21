(fnext ['(a b c) '(b a c)])
;; => (b a c)

(fnext '([a b c] [b a c]))
;; => [b a c]

(fnext {:a 1 :b 2 :c 3})
;; => [:b 2]

(fnext [])
;; => nil

(fnext [1])
;; => nil
