(defstruct mystruct :foo :bar)
;; => #'user/mystruct

(struct mystruct "eggplant" "pizza")
;; => {:foo "eggplant", :bar "pizza"}
