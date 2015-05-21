;; be careful, with-redefs can permanently change a var if applied concurrently:

(defn ten [] 10)
;; => #'user/ten
(doall (pmap #(with-redefs [ten (fn [] %)] (ten)) (range 20 100)))
;; => nil
(ten)
;; => 79
