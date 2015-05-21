(require '[clojure.java.io :refer [file]])

(clojure.java.io/file "/tmp/foo")
;; => #<File /tmp/foo>

(clojure.java.io/file "http://asdf.com")
;; => #<File http:/asdf.com>

(clojure.java.io/file "/tmp/foo" "bar")
;; => #<File /tmp/foo/bar>
