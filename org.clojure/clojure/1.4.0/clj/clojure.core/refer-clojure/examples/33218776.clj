;; Prevent namespace conflicts like:
;; `WARNING: time already refers to: #'clojure.core/time in namespace: time, being replaced by: #'time/time`
;; by using the :refer-clojure ns directive to exclude the var(s) in
;; clojure.core which you wish to shadow.

(ns time
  (:refer-clojure :exclude [time]))

(defn time []
  (System/nanoTime))
