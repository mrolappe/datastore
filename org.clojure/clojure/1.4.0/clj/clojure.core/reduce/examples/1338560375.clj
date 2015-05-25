;; converting a vector to a set.
(into #{} [:a :b :c])
;; => #{:a :c :b}
;; This is the same as writing (reduce conj #{} [:a :b :c]), however
;; it will perform better in the general case because where (reduce
;; conj) will construct intermediary persistent datastructures, into
;; will take advantage of transient operations if possible.
