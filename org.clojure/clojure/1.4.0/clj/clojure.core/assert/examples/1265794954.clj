(assert true)
;; => nil

(assert false)
;; => java.lang.AssertionError: Assert failed: false (NO_SOURCE_FILE:0)

(assert nil)
;; => java.lang.AssertionError: Assert failed: nil (NO_SOURCE_FILE:0)

(assert 0)
;; => nil

(assert [1 2 3])
;; => nil

(assert "foo")
;; => nil
