(require '[clojure.java.javadoc])

(javadoc String)
;; => "http://java.sun.com/javase/6/docs/api/java/lang/String.html"

(javadoc (java.util.Date.))
;; => "http://java.sun.com/javase/6/docs/api/java/util/Date.html"
