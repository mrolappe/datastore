;; ns-map = ns-refers + ns-interns + ns-imports
(count (ns-imports *ns*))
;; => 96

(count (ns-interns *ns*))
;; => 2

(count (ns-refers *ns*))
;; => 590

(+ *1 *2 *3)
;; => 688

(count (ns-map *ns*))
;; => 688
