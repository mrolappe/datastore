(defn sqr [n] 
  "Squares a number"
  (* n n))
;; => #'user/sqr

(sqr 5)
;; => 25

(alter-var-root 
 (var sqr)                     ; var to alter
 (fn [f]                       ; fn to apply to the var's value
   #(do (println "Squaring" %) ; returns a new fn wrapping old fn
        (f %))))

(sqr 5)
;; > Squaring 5
;; => 25
