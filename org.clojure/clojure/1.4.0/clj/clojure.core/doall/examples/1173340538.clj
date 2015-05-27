;; Nothing is printed because map returns a lazy-seq
user=> (def foo (map println [1 2 3]))
#'user/foo

;; Get the value of foo
user=> foo
1
2
3
(nil nil nil)

;; doall forces the seq to be realized
user=> (def foo (doall (map println [1 2 3])))
1
2
3
#'user/foo

;; Like above, but note the difference
user=> foo
(nil nil nil)

;; Where
(doall (map println [1 2 3]))
1
2
3
(nil nil nil)
