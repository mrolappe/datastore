; look ma, no let!
(map #(intern *ns* (first %) (eval (last %))) (partition 2 (destructure '[[a b] ["a" "b"]])))
;; => (#'user/vec__30188 #'user/a #'user/b)

a
;; => "a"

b
;; => "b"
