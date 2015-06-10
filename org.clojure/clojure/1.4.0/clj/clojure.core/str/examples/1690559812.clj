;; Destructuring with a string, getting just a few characters from it
(let [[first-char second-char] "abcde"] 
  (prn 'first= first-char) 
  (prn 'second= second-char))
;; > first= \a
;; > second= \b
;; => nil

;; More destructuring with a string
(let [[first-char second-char & rest-of-chars] "abcde"] 
  (prn 'first= first-char) 
  (prn 'second= second-char) 
  (prn 'rest= rest-of-chars))
;; > first= \a
;; > second= \b
;; > rest= (\c \d \e)
;; => nil

;; Destructuring, getting the first character of a string
;; and then a reference to the entire string
(let [[first-char :as all-the-string] "abcde"] 
  (prn 'first= first-char) 
  (prn 'all= all-the-string))
;; > first= \a
;; > all= "abcde"
;; => nil
