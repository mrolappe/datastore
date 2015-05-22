(read-string "; foo\n5")
;; => 5

(read-string "#^String x")
;; => x

(read-string "(1)")
;; => (1)

(read-string "(+ 1 2) (- 3 2)")
;; => (+ 1 2)

(read-string "@a")
;; => (clojure.core/deref a)

(read-string "(+ 1 2))))))")
;; => (+ 1 2)

(read-string "::whatever-namespace-you-are-in")
;; => :user/whatever-namespace-you-are-in
