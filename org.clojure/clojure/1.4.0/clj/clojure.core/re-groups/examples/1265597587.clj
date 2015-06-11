(def phone-number "672-345-456-3212")
;; => #'user/phone-number

(def matcher (re-matcher #"((\d+)-(\d+))" phone-number))
;; => #'user/matcher

(re-find matcher)
;; => ["672-345" "672-345" "672" "345"]

;; re-groups gets the most recent find or matches
(re-groups matcher)
;; => ["672-345" "672-345" "672" "345"]

(re-groups matcher)
;; => ["672-345" "672-345" "672" "345"]


(re-find matcher)
;; => ["456-3212" "456-3212" "456" "3212"]

(re-groups matcher)
;; => ["456-3212" "456-3212" "456" "3212"]

(re-groups matcher)
;; => ["456-3212" "456-3212" "456" "3212"]


(re-find matcher)
;; => nil

(re-groups matcher)
;; => IllegalStateException No match found  java.util.regex.Matcher.group (Matcher.java:468)
