;; Let's create a namespace and then assign it as the current namespace
(create-ns 'my-new-namespace)
;; => #<Namespace my-new-namespace>

(ns 'my-new-namespace)
;; => java.lang.ClassCastException: clojure.lang.PersistentList cannot be cast to clojure.lang.Symbol (NO_SOURCE_FILE:26)
;; oops, this is not the way to do it; if create-ns needs a symbol, ns does not

(ns my-new-namespace)
;; => nil

;; it worked as the current namespace is our newly created one

