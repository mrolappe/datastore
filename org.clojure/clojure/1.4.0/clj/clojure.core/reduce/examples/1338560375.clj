;; converting a vector to a set
(reduce conj #{} [:a :b :c])
;; => #{:a :c :b}
