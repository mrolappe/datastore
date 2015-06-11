(def *foo* "(println [1 2 3])")
;; => #'user/*foo*

*foo*
;; => "(println [1 2 3])"

(eval *foo*)   ; Notice eval'ing a string does not work.
;; => "(println [1 2 3])"

(eval (read-string *foo*))
;; > [1 2 3]
;; => nil
