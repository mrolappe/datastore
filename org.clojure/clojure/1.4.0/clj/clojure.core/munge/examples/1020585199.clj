(defn foo []
  (println "foo"))
;; => #'user/foo

foo
;; => #<user$foo user$foo@a0dc71>

(munge foo)
;; => "user_DOLLARSIGN_foo_CIRCA_a0dc71"
