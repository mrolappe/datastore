[(type []) (class [])]
;; => [clojure.lang.PersistentVector clojure.lang.PersistentVector]

(with-redefs [type (constantly java.lang.String)
              class (constantly 10)]
  [(type []) (class [])])
;; => [java.lang.String 10]
