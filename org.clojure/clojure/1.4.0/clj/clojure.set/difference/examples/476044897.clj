(require '[clojure.set :refer :all])
;; => nil

(difference (set (keys {:1 1 :2 2 :3 3}))
            (set (keys {:1 1 :2 2})))
;; => #{:3}

(difference (set (keys {:1 1 :2 2}))
            (set (keys {:1 1 :2 2 :3 3})))
;; => #{}
