;; Note this is not strictly necessary since keySet is a collection
;; implementing Iterable but it does show the usage.

(iterator-seq (.iterator (.keySet (java.lang.System/getProperties))))
;; => ("java.runtime.name"
;;     "sun.boot.library.path"
;;     "java.vm.version"
;;     "java.vm.vendor"
;;     "java.vendor.url"
;;     "path.separator"
;;     "java.vm.name"
;;     "file.encoding.pkg"
;;     ....
;;     sun.cpu.isalist")
