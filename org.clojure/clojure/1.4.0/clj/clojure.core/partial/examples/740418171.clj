(require '[clojure.pprint])
;; => nil

(def to-english (partial clojure.pprint/cl-format nil "~@(~@[~R~]~^ ~A.~)"))
;; => #'user/to-english

(to-english 1234567890)
;; => "One billion, two hundred thirty-four million, five hundred sixty-seven thousand, eight hundred ninety"
