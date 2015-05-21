;; We can use get-in for reaching into nested maps:
(def m {:username "sally"
        :profile {:name "Sally Clojurian"
                  :address {:city "Austin" :state "TX"}}})
;; => #'user/m

(get-in m [:profile :name])
;; => "Sally Clojurian"

(get-in m [:profile :address :city])
;; => "Austin"

(get-in m [:profile :address :zip-code])
;; => nil

(get-in m [:profile :address :zip-code] "no zip code!")
;; => "no zip code!"

;; Vectors are also associative:
(def v [[1 2 3]
        [4 5 6]
        [7 8 9]])
;; => #'user/v

(get-in v [0 2])
;; => 3

(get-in v [2 1])
;; => 8

;; We can mix associative types:
(def mv {:username "jimmy"
         :pets [{:name "Rex"
                 :type :dog}
                {:name "Sniffles"
                 :type :hamster}]})
;; => #'user/mv

(get-in mv [:pets 1 :type])
;; => :hamster
