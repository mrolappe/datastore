;; Nothing is printed because map returns a lazy-seq
(def foo (map println [1 2 3]))
;; => #'user/foo

;; Get the value of foo
foo
;; > 1
;; > 2
;; > 3
;; => (nil nil nil)

;; doall forces the seq to be realized
(def foo (doall (map println [1 2 3])))
;; > 1
;; > 2
;; > 3
;; => #'user/foo

;; Like above, but note the difference
foo
;; => (nil nil nil)

;; Where
(doall (map println [1 2 3]))
;; > 1
;; > 2
;; > 3
;; => (nil nil nil)
