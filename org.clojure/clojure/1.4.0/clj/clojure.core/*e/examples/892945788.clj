(ns-refers) ;; Oops! we missed a namespace (ns-refers 'user)
;; => #<CompilerException java.lang.IllegalArgumentException: Wrong number of args passed to: core$ns-refers (NO_SOURCE_FILE:0)>

*e
;; => #<CompilerException java.lang.IllegalArgumentException: Wrong number of args passed to: core$ns-refers (NO_SOURCE_FILE:0)>
