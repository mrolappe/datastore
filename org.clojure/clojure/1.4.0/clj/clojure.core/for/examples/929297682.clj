;; Demonstrating difference between :when and :while
(for [x (range 3) y (range 3) :when (not= x y)] [x y])
;; => ([0 1] [0 2] [1 0] [1 2] [2 0] [2 1])

(for [x (range 3) y (range 3) :while (not= x y)] [x y])
;; => ([1 0] [2 0] [2 1])
