;; If there are no parenthesized 'groups' in the regex, re-find either
;; returns the substring of s that matches, or nil if there is no match.
;; It also behaves this way if all parenthesized groups do not 'capture',
;; because they begin with ?:

(re-find #"\d+" "abc123def")
;; => "123"

(re-find #"\d+" "abcdef")
;; => nil

(re-find #"(?:\d+)" "abc123def")
;; => "123"
