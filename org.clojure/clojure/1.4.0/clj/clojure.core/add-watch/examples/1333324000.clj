;; timing of agent actions and watches using nrepl (ymmv)
(def a (agent 0))
;; => #'user/a
a
;; => #<Agent@2bd9c3e7: 0>
(add-watch a :key (fn [k r os ns] (print k r os ns)))
;; => #<Agent@2bd9c3e7: 0>
(send a inc)
;; => :key #<Agent@2bd9c3e7: 1> 0 1
;; => #<Agent@2bd9c3e7: 1>
a
;; => :key #<Agent@2bd9c3e7: 2> 1 2
;; => #<Agent@2bd9c3e7: 2>
