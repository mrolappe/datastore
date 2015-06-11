;; Create another ArrayList and add integers using the doto macro
(def ai (doto (new java.util.ArrayList) (.add 1) (.add 2) (.add 0)))
;; => #'user/ai
ai
;; => #<ArrayList [1, 2, 0]>
