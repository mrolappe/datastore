(def *strings* ["str1" "str2" "str3"])
;; => #'user/*strings*

;; Oops!
(str *strings*)
;; => "[\"str1\" \"str2\" \"str3\"]"

;; Yay!
(apply str *strings*)
;; => "str1str2str3"

;; Note the equivalence of the following two forms
(apply str ["str1" "str2" "str3"])
;; => "str1str2str3"

(str "str1" "str2" "str3")
;; => "str1str2str3"
