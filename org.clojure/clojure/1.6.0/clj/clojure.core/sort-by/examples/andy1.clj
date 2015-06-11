(sort-by count
         ["lummox"
          "antidisestablishmentarianism"
          "a"])
;; => ("a" "lummox" "antidisestablishmentarianism")

(sort-by first >
         [[8.67 -5]
          [5 1]
          [-22/7 3.0]
          [5 0]])
;; => ([8.67 -5]
;;     [5 1]
;;     [5 0]
;;     [-22/7 3.0])
