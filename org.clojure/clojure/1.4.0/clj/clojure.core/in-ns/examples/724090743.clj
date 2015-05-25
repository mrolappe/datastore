;; The "in-ns" function works almost the same as "ns", but does not load clojure.core 

(in-ns 'my-namespace)
#<Namespace my-namespace>

;; The function clojure.core/inc won't just work becayse
;; the "my-namespace" ns is empty and doesn't alias in all the defs
;; from clojure.core. As a result if we just say inc...
(inc 1)
;; => java.lang.Exception: Unable to resolve symbol: inc in this context (NO_SOURCE_FILE:15)
;; we can't find it.

;; We can however use the fully qualified name to refer to inc despite
;; not having aliased it in.
(clojure.core/inc 1)
;; => 2
