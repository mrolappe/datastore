;; same as println, but without a newline
(do (print "foo")
    (print "foo")
    nil)
;; > foofoo
;; => nil
