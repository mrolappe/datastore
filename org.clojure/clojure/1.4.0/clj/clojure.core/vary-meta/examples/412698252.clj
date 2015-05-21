;; continuing from the previous with-meta example
(def wm (with-meta [1 2 3] {:my "meta"}))
;; => #'user/wm

wm
;; => [1 2 3]

(meta wm)
;; => {:my "meta"}

(def new-wm (vary-meta wm assoc :your "new meta"))
;; => #'user/new-wm

new-wm
;; => [1 2 3]

(meta new-wm)
;; => {:my "meta", :your "new meta"}

