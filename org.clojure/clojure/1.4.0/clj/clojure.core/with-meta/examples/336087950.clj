;; the same example above in a simplified way
(def wm
  (with-meta [1 2 3]
    {:my "meta"}))
;; => #'user/wm

wm
;; => [1 2 3]

(meta wm)
;; => {:my "meta"}
