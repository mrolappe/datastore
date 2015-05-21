;; The shortest input stops interleave:
(interleave [:a :b] (iterate inc 1))
;; => (:a 1 :b 2)
