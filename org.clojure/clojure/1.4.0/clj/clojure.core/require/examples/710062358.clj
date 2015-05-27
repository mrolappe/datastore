;; Require clojure.java.io and call its file function:

(require '(clojure.java io))
;; => nil

(clojure.java.io/file "filename")
;; => #<File filename>
