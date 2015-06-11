(defn has-neg [coll] 
  (if-not (empty? coll)   ;;  = (if (not (empty? coll)) ...
    (or (neg? (first coll)) (recur (rest coll)))))
;; => #'user/has-neg

(has-neg [])
;; => nil 

(has-neg [1 2 -3 4])
;; => true
