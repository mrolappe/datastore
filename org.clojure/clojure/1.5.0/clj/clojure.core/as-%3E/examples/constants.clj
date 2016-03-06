;; `as->` does _not_ implicitly place arguments as clj::clojure.core/->
;; or clj::clojure.core/->> will. `as->` through a constant expression
;; such as a map will generate that constant.
(as-> 1 v
      2
      {2 3})
;; => {2 3}
