;; create a clojure file on the fly using spit
;; then load it into the REPL and use its function

(spit "mycode.clj" "(defn doub [x] (* x 2))")
;; => nil

(load-file "mycode.clj")
;; => #'user/doub

(doub 23)
;; => 46
