;; While this map is similar to the vector in that it maps the
;; same integers 0, 1, and 2 to the same values, maps and vectors
;; are never = to each other even if the logical k/v pairs are the same.
(= ["a" "b" "c"]
   {0 "a" 1 "b" 2 "c"})
;; => false
