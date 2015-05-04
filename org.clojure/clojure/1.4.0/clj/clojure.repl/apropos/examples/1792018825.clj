(require '[clojure.repl :refer [apropos]])

(apropos "temp")
;; => ()

(require 'clojure.template)
;; => nil

(apropos "temp")
;; => (apply-template do-template)
