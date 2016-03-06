;; quick demonstration of using a Collections function on the resulting ArrayList

(def al (doto (java.util.ArrayList.) (.add 11) (.add 3) (.add 7)))
;; => #'user/al

al
;; => #<ArrayList [11, 3, 7]>

(java.util.Collections/sort al)
;; => nil

al
;; => #<ArrayList [3, 7, 11]>
