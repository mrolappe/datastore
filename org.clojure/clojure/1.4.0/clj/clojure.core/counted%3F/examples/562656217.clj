(counted? [:a :b :c])
;; => true

(counted? '(:a :b :c))
;; => true

(counted? {:a 1 :b 2 :c 3})
;; => true

(counted? #{:a :b :c})
;; => true

(counted? "asdf")
;; => false

(counted? (into-array Integer/TYPE [1 2 3]))
;; => false
