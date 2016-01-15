(defn foo
  "Function from a number X to an even number X'. If X is even,
  returns (* 2 (+ x 1)), otherwise (* x 2)."
  [x]
  (cond-> x
    (even? x) ;; If x is even, add 1 to make it odd
    ,,(inc)

    :true     ;; Double every x with a truthy constant
    ,,(* 2)))
;; => #'user/foo

(foo 3)
;; => 6

(foo 4)
;; => 10
