;; re-find can be used to iterate through re matches in the string

(def phone-number "672-345-456-3212")
;; => #'user/phone-number

(def matcher (re-matcher #"\d+" phone-number))
;; => #'user/matcher

(re-find matcher)
;; => "672"

(re-find matcher)
;; => "345"

(re-find matcher)
;; => "456"

(re-find matcher)
;; => "3212"

;; when there's no more valid matches, nil is returned
(re-find matcher)
;; => nil
