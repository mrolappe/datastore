;; An alternate to the example in the documentation is 

(are [result {:keys [x y] :as m}] (= result (+ x y))
  5  {:x 2 :y 3}
  10 {:x 6 :y 4})

