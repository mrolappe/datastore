(def f (future (inc 0)))
;; => #'user/f

(future-cancel f)
;; => false

(future-cancelled? f)
;; => false

(future-done? f)
;; => true

@f
;; => 1
