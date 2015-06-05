;; create an Java integer array, then clone it
;; note that when you modify b, a remains the same
;; showing that b is not just a reference to a

(def a (int-array [1 2 3 4]))
;; => #'user/a

(def b (aclone a))
;; => #'user/b

(aset b 0 23)
;; => 23

(vec b)
;; => [23 2 3 4]

(vec a)
;; => [1 2 3 4]
