;; comparisons among keep, map and for.

(keep #(if (odd? %) %) (range 10))
;; => (1 3 5 7 9)

(map #(if (odd? %) %) (range 10))
;; => (nil 1 nil 3 nil 5 nil 7 nil 9)

(for [x (range 10) :when (odd? x)] x)
;; => (1 3 5 7 9)

(keep #(if (even? %) %) (range 10))
;; => (0 2 4 6 8)

(map #(if (even? %) %) (range 10))
;; => (0 nil 2 nil 4 nil 6 nil 8 nil)

(for [x (range 10) :when (even? x)] x)
;; => (0 2 4 6 8)
