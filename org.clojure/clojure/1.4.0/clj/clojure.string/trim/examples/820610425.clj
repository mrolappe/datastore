;; Trim basically does what you'd expect.  What the doc string
;; does not tell you however is that:
;;  - null will cause an error
;;  - non-string parameters will be converted to a string
;;    before being trimed.

(require '[clojure.string :refer [trim]])
;; => nil

(trim "     a      ")
;; => "a"

(trim nil)
;; > java.lang.NullPointerException (NO_SOURCE_FILE:0)

(trim 1.1)
;; => "1.1"

(trim [1 2 3])
;; => "[1 2 3]"
