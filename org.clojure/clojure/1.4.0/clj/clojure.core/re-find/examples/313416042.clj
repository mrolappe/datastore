;;It's possible to get variables out of your string with regexp

(re-find #"(\d\d\d) (USD)" "450 USD")
;; => ["450 USD" "450" "USD"]

(nth *1 1)
;; => "450"

;;thanks kotarak @ stackoverflow.com for this one
