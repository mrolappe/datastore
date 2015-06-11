(defonce foo 5)
;; => #'user/foo

foo
;; => 5

;; defonce does nothing the second time
(defonce foo 10)
;; => nil

foo
;; => 5
