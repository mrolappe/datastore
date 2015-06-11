(require '[clojure.java.io :refer [reader]])

(require '[clojure.string :refer [join]])

(with-open [rdr (reader "http://www.google.com")]
  (printf "%s\n" (join "\n" (line-seq rdr))))
