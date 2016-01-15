(defn foo [x]
  (some-> x
    (.substring 1)))
;; => #'user/foo

(foo nil)
;; => nil

(foo "bar")
;; => "ar"
