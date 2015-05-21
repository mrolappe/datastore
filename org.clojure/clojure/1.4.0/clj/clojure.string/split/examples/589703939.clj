(use '[clojure.string :only (split triml)])
;; => nil

;; Splitting on whitespace is a common desire.
(split "Some words to split" #"\s+")
;; => ["Some" "words" "to" "split"]

;; By using the pattern #"\s+", we split on all occurrences of one or
;; more consecutive whitespace characters.
(split "Some    words   with\tother whitespace      \n" #"\s+")
;; => ["Some" "words" "with" "other" "whitespace"]

;; If you are used to Perl's special behavior of split(' ', $str),
;; where it ignores leading whitespace in the string to be split, this
;; does not quite do it.
(split "   Leading whitespace causes empty first string" #"\s+")
;; => ["" "Leading" "whitespace" "causes" "empty" "first" "string"]

;; This will do it.
(defn perl-split-on-space [s]
  (split (triml s) #"\s+"))
;; => #'user/perl-split-on-space

(perl-split-on-space "   This is often what you want   ")
;; => ["This" "is" "often" "what" "you" "want"]

;; There might be cases where you want this instead.
(split "Some    words   with\tother whitespace      \n" #"\s")
;; => ["Some" "" "" "" "words" "" "" "with" "other" "whitespace"]
