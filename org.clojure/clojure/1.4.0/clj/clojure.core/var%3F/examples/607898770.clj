(var? 1)
;; => false

(var? #'defn)
;; => true

(var? (var defn))
;; => true

(var? apply)
;; => false

(var? #'apply)
;; => true

;; Note: macros (let, defn, fn etc) cannot be taken as values!
(var? defn)
;; => CompilerException java.lang.RuntimeException: Can't take value of a macro: #'clojure.core/defn, compiling:(NO_SOURCE_PATH:1:1) 
