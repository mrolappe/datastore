;; from http://groups.google.com/group/clojure/msg/71702435ccd1d189
(import java.util.Date)
;; => java.util.Date

(def d (proxy [Date] [] (toString [] "hello")))
;; => #'user/d

d
;; => #<Date$0 hello>

(.toString d)
;; => "hello"

(.toGMTString d)
;; => "17 Nov 2010 12:57:28 GMT"

(update-proxy d {"toGMTString" (fn [this] "goodbye")})
;; => nil

(.toGMTString d)
;; => "goodbye" 
