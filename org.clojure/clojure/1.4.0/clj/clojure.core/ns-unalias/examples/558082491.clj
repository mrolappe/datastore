;; You are having a problem loading a redefined namespace:
(load "src/clj/com/tizra/layout_expander.clj")
;; => #<IllegalStateException java.lang.IllegalStateException: Alias xml already exists in namespace com.tizra.layout-expander, aliasing com.tizra.xml-match>

;; ns-unalias to the rescue!
(ns-unalias (find-ns 'com.tizra.layout-expander) 'xml)
;; => nil

(load "src/clj/com/tizra/layout_expander.clj")
;; => #'com.tizra.layout-expander/junk
