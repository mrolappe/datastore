;; not supplying 'end' returns vector from 'start' to (count vector)
(subvec [12 3 4 5 6 7] 2)
;; => [4 5 6 7]

;; supplying 'end' returns vector from 'start' to element (- end 1)
(subvec [12 3 4 5 6 7] 2 4)
;; => [4 5]




