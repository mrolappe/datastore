(require '[clojure.java.io :only [as-url]])
;; => nil

(import 'java.io.File)
;; => nil

(as-url nil)
;; => nil

(as-url (File. "/tmp"))
;; => #<URL file:/tmp/>

(as-url "http://clojuredocs.org")
;; => #<URL http://clojuredocs.org>

(as-url "http://clojuredocs.org:8080")
;; => #<URL http://clojuredocs.org:8080>

(as-url "clojuredocs.org")
;; => #<CompilerException java.net.MalformedURLException: no protocol: clojuredocs.org>


