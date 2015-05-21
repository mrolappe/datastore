;; Create a Java ArrayList using the 0 argument constructor
(def a  (new java.util.ArrayList))
;; => #'user/a
(.add a "aaa")
;; => true
(.add a "bbb")
;; => true
a
;; => #<ArrayList [aaa, bbb]>
