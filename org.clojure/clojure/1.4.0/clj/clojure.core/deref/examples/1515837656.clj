(def a (atom 0))
;; => #'user/a

@a
;; => 0

(deref a)
;; => 0

(def b (ref 1))
;; => #'user/b

@b
;; => 1

(deref b)
;; => 1

(def c (agent 2))
;; => #'user/c

@c
;; => 2

(deref c)
;; => 2

(def d (future 3))
;; => #'user/d

@d
;; => 3

(deref d)
;; => 3
