(derive ::Feline ::Animal)
;; => nil

(derive ::Cat ::Feline)
;; => nil

(derive ::Lion ::Feline)
;; => nil

(isa? ::Lion ::Feline)
;; => true

(isa? ::Lion ::Animal)
;; => true

(isa? ::Tuna ::Feline)
;; => false
