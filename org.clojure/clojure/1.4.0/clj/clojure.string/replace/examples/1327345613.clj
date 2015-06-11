(require '[clojure.string :as s])
;; => nil

;; To title case
(s/replace "hello world" #"\b." #(.toUpperCase %1))
;; => "Hello World"

;; Note that a vector is passed to your replacement function
;; when pattern contains capturing groups (see re-groups)
(s/replace "hello world" #"\b(.)" #(.toUpperCase (%1 1)))
;; => "Hello World"
