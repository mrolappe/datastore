(require '[clojure.set :refer [difference]])
;; => nil

(difference #{1 2 3})
;; => #{1 2 3}

(difference #{1 2} #{2 3})
;; => #{1}

(difference #{1 2 3} #{1} #{1 4} #{3})
;; => #{2}
