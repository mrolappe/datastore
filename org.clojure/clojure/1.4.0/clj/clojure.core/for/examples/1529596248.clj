;; Compute the squares over a range using for
;; Equivalent to (map #(* %1 %1) (range 3 7))

(for [x (range 3 7)]
  (* x x))

;; => (9 16 25 36)
