;; Let's create a namespace and check for our result
;; the new namespace will be "my-new-namespace"

;; obviously, it does not exist yet, so looking for it, finds nothing
(find-ns 'my-new-namespace) 
;; => nil

;; let's create it
(create-ns 'my-new-namespace)
;; => #<Namespace my-new-namespace>

;; now searching for it again will have a result
(find-ns 'my-new-namespace)
;; => #<Namespace my-new-namespace>
