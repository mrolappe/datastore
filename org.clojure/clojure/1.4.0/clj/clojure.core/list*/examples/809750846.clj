;; `list*` function:
(list* 1 [2 3])
;; => (1 2 3)

(list* 1 2 [3 4])
;; => (1 2 3 4)

;; compared to regular `list` function:
(list 1 [2 3])
;; => (1 [2 3])

(list 1 2 [3 4])
;; => (1 2 [3 4])

;; Corner cases:
(list* nil [1 2])
;; => (nil 1 2)

(list* 1 nil)
;; => (1)

(list* () [1 2])
;; => (() 1 2)

(list* 1 ())
;; => (1)
