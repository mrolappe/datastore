;; 2 is a truthy value so the body will be evaluated
(when-let [a 2]
  (+ a a))
;; => 4

;; nil is falsey so (+ nil nil) - which would throw a null pointer exception if
;; evaluated is not evaluated. This makes a very convenient guard for
;; conditional imperative blocks which could otherwise error out.

(when-let [a nil]
  (+ a a))
;; => nil
