;; simple example showing single parented derivation
;; then adding another parent

(derive ::toy_poodle ::poodle)
;; => nil

(parents ::toy_poodle)
;; => #{:user/poodle}

(derive ::toy_poodle ::toy_dogs)
;; => nil

(parents ::toy_poodle)
;; => #{:user/poodle :user/toy_dogs}
