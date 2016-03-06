;; Take a sequence of sequences (vector of vectors, and create a map
;; using date as the map key.
(def csv1 [["01/01/2012" 1 2 3 4] ["06/15/2012" 38 24 101]])

(map #(hash-map (keyword (first %1)) (vec (rest %1))) csv1)
;; => {:01/01/2012 [1 2 3 4]} {:06/15/2012 [38 24 101]}

;; merge the list of maps into a single map
(apply merge '({"01/01/2012" [1 2 3 4]} {"06/15/2012" [38 24 101]}))
;; => {"06/15/2012" [38 24 101], "01/01/2012" [1 2 3 4]}
