;; be careful, with-redefs can permanently change a var if applied concurrently:

(defn ten [] 10)
;; => #'user/ten
(doall (pmap #(with-redefs [ten (fn [] %)] (ten)) (range 20 100)))
;; => (20 21 22 22 24 25 29 27 26 29 30 31 32 33 35 35 36 37 38 39 40 41 42 43 46 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 75 79 80 81 82 83 84 85 86 87 88 89 90 91 92 88 91 95 96 97 98 99)
(ten)
;; => 90
