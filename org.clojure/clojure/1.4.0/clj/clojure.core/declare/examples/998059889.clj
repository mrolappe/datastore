(defn foo []
  (undefined-func))
;; Evaluation aborted. Unable to resolve symbol: undefined-func in this context

(declare undefined-func)
;; => #'user/undefined-func

(defn foo []
  (undefined-func))
;; => #'user/foo
