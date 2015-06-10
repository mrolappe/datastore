;; Let's create a namespace and then remove it

(create-ns 'my-new-namespace)
;; => #<Namespace my-new-namespace>

;; removing a namespace will give you the namespace you just deleted, if one existed
(remove-ns 'my-new-namespace)
;; => #<Namespace my-new-namespace>

;; removing a namespace that does not exist, will tell you that nothing was removed, 
;; by returning nil, and won't give any errors
(remove-ns 'my-new-namespace)
;; => nil
