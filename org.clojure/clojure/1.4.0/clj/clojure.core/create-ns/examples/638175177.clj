;; If you try this, you're doing it wrong
(create-ns my-new-namespace)
;; => java.lang.Exception: Unable to resolve symbol: my-new-namespace in this context (NO_SOURCE_FILE:2)


;; Same deal, if you try this, you're doing it wrong
(create-ns "my-new-namespace")
;; => java.lang.ClassCastException: java.lang.String cannot be cast to clojure.lang.Symbol (NO_SOURCE_FILE:0)


;; This is how you do it
(create-ns 'my-new-namespace)
;; => #<Namespace my-new-namespace>
