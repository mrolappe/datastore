;; :as example.
;; :as names the group you just destructured, letting you refer to that term.

(let [[x y :as my-point] [5 3]]
  (println x y)
  (println my-point))
;; > 5 3
;; > [5 3]
;; => nil

;; equivalent to (and far better than)

(let [my-point [5 3]
      [x y]    my-point]
  (println x y)
  (println my-point))
