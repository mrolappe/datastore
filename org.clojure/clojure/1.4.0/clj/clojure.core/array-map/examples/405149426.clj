(array-map :a 10)
;; => {:a 10}

(array-map :a 10 :b 20)
;; => {:a 10 :b 20}

(apply array-map [:a 10 :b 20 :c 30])
;; => {:a 10 :b 20 :c 30}

(apply assoc {} [:a 10 :b 20 :c 30]) ;same result using assoc
;; => {:a 10 :b 20 :c 30}
