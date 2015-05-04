(sort [3 -7 10 8 5.3 9/5 -7.1])
;; => (-7.1 -7 9/5 3 5.3 8 10)

;; Note that sort can also use a custom comparator, here for instance to reverse
;; the sorting order.

(sort #(compare %2 %1)
      '(apple banana aardvark zebra camel))
;; => (zebra camel banana apple aardvark)
