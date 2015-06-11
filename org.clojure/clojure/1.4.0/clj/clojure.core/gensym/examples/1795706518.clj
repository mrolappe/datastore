;; syntax-reader uses gensym for non-namespace-qualified symbols ending with '#'
;; http://clojure.org/reader

`(name0#) ;; gensym, form is useful in defmacro
;; => (name0__1206__auto__)

`(user/name1#) ;; no gensym, namespace-qualified
;; => (user/name1#)

`(:key0#) ;; no gensym, keyword
;; => (:key0#)

`(::key1#) ;; no gensym, keyword
;; => (:user/key1#)
