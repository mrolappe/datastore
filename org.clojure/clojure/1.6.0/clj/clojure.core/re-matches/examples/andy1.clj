(re-find #"\d+" "abc123def")
;; => "123"

(re-matches #"\d+" "abc123def")
;; => nil

(re-matches #"\d+" "123")
;; => "123"
