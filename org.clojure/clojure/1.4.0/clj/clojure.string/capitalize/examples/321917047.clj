(require '[clojure.string :refer [capitalize]])
;; => nil

(capitalize "MiXeD cAsE")
;; => "Mixed case"

(capitalize "mIxEd CaSe")
;; => "Mixed case"
