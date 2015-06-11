(derive ::Cat ::Feline)
;; => nil

(derive ::Lion ::Feline)
;; => nil

(isa? ::Lion ::Feline)
;; => true

(isa? ::Tuna ::Feline)
;; => false
