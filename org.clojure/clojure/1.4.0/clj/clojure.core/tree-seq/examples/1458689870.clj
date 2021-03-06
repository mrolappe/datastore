(tree-seq seq? seq [[1 2 [3]] [4]])
;; => ([[1 2 [3]] [4]])

(tree-seq vector? seq [[1 2 [3]] [4]])
;; => ([[1 2 [3]] [4]] [1 2 [3]] 1 2 [3] 3 [4] 4)

(tree-seq seq? seq '((1 2 (3)) (4)))
;; => (((1 2 (3)) (4)) (1 2 (3)) 1 2 (3) 3 (4) 4)
