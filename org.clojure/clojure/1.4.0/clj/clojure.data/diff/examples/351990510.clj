(require '[clojure.data :refer [diff]])
(def uno {:same "same", :different "one"})
(def dos {:same "same", :different "two", :onlyhere "whatever"})

(diff uno dos)
;; => ({:different "one"}                       ; different in lhs
;;     {:onlyhere "whatever", :different "two"} ; different in rhs
;;     {:same "same"})                          ; same in both

(diff {:a 1} {:a 1 :b 2})
;; => (nil
;;     {:b 2}
;;     {:a 1})
