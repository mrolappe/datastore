(get [1 2 3] 1)
;; => 2

(get [1 2 3] 5)
;; => nil

(get {:a 1 :b 2} :b)
;; => 2

(get {:a 1 :b 2} :z "missing")
;; => "missing"

