;;; `:only' accepts only original names.
;; wrong
(refer 'clojure.string
       :rename '{capitalize cap, trim trm}
       :only '[cap trm])
;; => IllegalAccessError cap does not exist  clojure.core/refer (core.clj:3849)

;; right
(refer 'clojure.string
       :rename '{capitalize cap, trim trm}
       :only '[capitalize trim])
;; => nil

;; work well
(cap (trm " hOnduRAS  "))
;; => "Honduras"

;; and also, cannot use either of them.
(join \, [1 2 3])
;; => CompilerException java.lang.RuntimeException: Unable to resolve symbol: join in this context, compiling:(NO_SOURCE_PATH:1:1)
