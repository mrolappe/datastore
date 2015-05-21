;; create a simple hierarchy using the global hierarchy
;; and demonstrate how underive is used

(derive ::dog ::animal)
;; => nil

(derive ::spaniel ::dog)
;; => nil

(derive ::tabby ::dog)
;; => nil

(ancestors ::tabby)
;; => #{:user/dog :user/animal}

(underive ::tabby ::dog)
;; => nil

(ancestors ::tabby)
;; => nil
