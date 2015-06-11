(declare show)
;; => #'user/show

(defn welcome [user-name]
  (prn (show) user-name))
;; => #'user/welcome

(defn show []
  (prn "welcome "))
;; => #'user/show

(welcome "lu4nx")
;; > "welcome "
;; > nil
;; > "lu4nx"
;; => nil
