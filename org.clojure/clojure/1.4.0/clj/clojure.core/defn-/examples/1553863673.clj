(ns test)
;; => nil

(defn- foo []
  "World!")
;; => #'test/foo

(defn bar []
  (str "Hello " (foo)))
;; => #'test/bar

(foo)
;; => "World!"

(bar)
;; => "Hello World!"

(ns playground)
;; => nil

(test/bar)
;; => "Hello World!"

(test/foo)
;; => Error: var: #'test/foo is not public
