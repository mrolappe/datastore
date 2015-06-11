;; first create a Java File object using the file function in
;; the clojure.java.io package and use that object to create a file-seq
;; then show the first and first 10 members of that seq

(def f (clojure.java.io/file "c:\\clojure-1.2.0"))
;; => #'user/f

(def fs (file-seq f))
;; => #'user/fs

(first fs)
;; => #<File c:\clojure-1.2.0>

(clojure.pprint/pprint (take 10 fs))
;; => (#<File c:\clojure-1.2.0>
;;     #<File c:\clojure-1.2.0\.gitignore>
;;     #<File c:\clojure-1.2.0\build.xml>
;;     #<File c:\clojure-1.2.0\changes.txt>
;;     #<File c:\clojure-1.2.0\cl.bat>
;;     #<File c:\clojure-1.2.0\clojure.jar>
;;     #<File c:\clojure-1.2.0\doc>
;;     #<File c:\clojure-1.2.0\doc\clojure>
;;     #<File c:\clojure-1.2.0\doc\clojure\pprint>
;;     #<File c:\clojure-1.2.0\doc\clojure\pprint\CommonLispFormat.markdown>)
