(when-first [a [1 2 3]] a)
;; => 1

(when-first [a []] a)
;; => nil

(when-first [a nil] a)
;; => nil
