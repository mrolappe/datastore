(defn f [n] (* n n n))
;; => #'user/f

((ns-resolve *ns* (symbol "f")) 10)
;; => 1000
