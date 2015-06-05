(defn foo []
  (undefined-func))
;; Evaluation aborted. Unable to resolve symbol: undefined-func in this context

(declare undefined-func)
;; => #'user/undefined-func

(defn foo []
  (undefined-func))
;; => #'user/foo

;; Note that while foo can be defined thanks to the forward declaration in
;; declare, it cannot be invoked until the forward declared var becomes bound by
;; a def.
