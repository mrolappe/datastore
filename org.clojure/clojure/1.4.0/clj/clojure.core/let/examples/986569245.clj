;;; no value of a key
(let [{:keys [a b] :as m} (:x {})]
  [a b m])
;; => [nil nil nil]

;;; same as above
(let [{:keys [a b] :as m} nil]
  [a b m])
;; => [nil nil nil]

;;; similar case on Vector
(let [[a b :as v] nil]
  [a b v])
;; => [nil nil nil]
