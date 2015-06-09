(ffirst '([]))
;; => nil 

(ffirst ['(a b c) '(b a c)])
;; => a 

(ffirst '([a b c] [b a c]))
;; => a
