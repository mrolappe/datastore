;; With case-insensitive-cmp, "AiR" is a duplicate with "air" and
;; not added to the set, and the order is different.
(require '[clojure.string :as str])

(defn case-insensitive-cmp [s1 s2]
  (compare (str/lower-case s1) (str/lower-case s2)))
;; => #'user/case-insensitive-cmp

(sorted-set-by case-insensitive-cmp
               "Food" "good" "air" "My" "AiR" "My")
;; => #{"air" "Food" "good" "My"}
