;; make up a hierarchy a beagle is a sporting breed is a dog is a quadraped is an 
;; animal

(derive ::quadruped ::animal)
;; => nil

(derive ::dog ::quadruped)
;; => nil

(derive ::sporting_breed ::dog)
;; => nil

(derive ::beagle ::sporting_breed)
;; => nil

(ancestors ::beagle)
;; => #{:user/dog :user/sporting_breed :user/animal :user/quadruped}
