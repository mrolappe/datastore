;; This should be about as quick as summing up a array of floats in java.

(defn asum [#^floats xs]
  (areduce xs i ret (float 0)
           (+ ret (aget xs i))))
;; => #'user/asum

(asum (float-array [1 2 3]))
;; => 6.0
