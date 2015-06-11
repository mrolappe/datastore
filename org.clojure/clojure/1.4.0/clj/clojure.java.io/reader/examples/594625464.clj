(do
  (spit "/tmp/foo.txt"
        "foo\nbar\nbaz\nqux\nEOF")

  (with-open [rdr (clojure.java.io/reader "/tmp/foo.txt")]
    (into []
          (line-seq rdr))))
