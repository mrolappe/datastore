;; simple example a toy poodle is a poodle is a dog is an animal

(derive ::dog ::animal)
;; => nil

(derive ::poodle ::dog)
;; => nil

(derive ::toy_poodle ::poodle)
;; => nil

(descendants ::animal)
;; => #{:user/toy_poodle :user/poodle :user/dog}
