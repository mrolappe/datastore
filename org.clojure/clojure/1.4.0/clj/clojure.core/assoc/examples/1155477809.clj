(assoc {} :key1 "value" :key2 "another value")
;; => {:key2 "another value", :key1 "value"}

(assoc {:key1 "old value1" :key2 "value2"} :key1 "value1" :key3 "value3")
;; => {:key3 "value3", :key2 "value2", :key1 "value1"}

(assoc nil :key1 4)
;; => {:key1 4}

(assoc [1 2 3] 0 10)
;; => [10 2 3]

(assoc [1 2 3] 3 10)
;; => [1 2 3 10]

(assoc [1 2 3] 4 10)
;; => java.lang.IndexOutOfBoundsException (NO_SOURCE_FILE:0)

;; From http://clojure-examples.appspot.com/clojure.core/assoc
