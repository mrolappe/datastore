(defn foo [x]
  {:pre  [(number? x)]
   :post [(number? x)]}
  (cond-> x
    (even? x)
    ,,(inc)

    :true
    ,,(* 2)))
;; => #'user/foo

(foo 3)
;; => 6

(foo 4)
;; => 10
