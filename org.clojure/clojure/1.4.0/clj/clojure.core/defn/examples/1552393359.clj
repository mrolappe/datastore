(defn bar
  ([a b]   (bar a b 100))
  ([a b c] (* a b c)))
;; => #'user/bar

(bar 5 6)
;; => 3000

(bar 5 6 2)
;; => 60
