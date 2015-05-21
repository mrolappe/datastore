(require '[clojure.string :as cs])
;; => nil

;; Suppose you have a fn in a `map` that itself returns
;; multiple values.
(map #(cs/split % #"\d") ["aa1bb" "cc2dd" "ee3ff"])
;; => (["aa" "bb"] ["cc" "dd"] ["ee" "ff"])

;; Now, if you want to concat them all together, you *could*
;; do this:
(apply concat (map #(cs/split % #"\d") ["aa1bb" "cc2dd" "ee3ff"]))
;; => ("aa" "bb" "cc" "dd" "ee" "ff")

;; But `mapcat` can save you a step:
(mapcat #(cs/split % #"\d") ["aa1bb" "cc2dd" "ee3ff"])
;; => ("aa" "bb" "cc" "dd" "ee" "ff")
