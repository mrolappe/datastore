Removes an alias for another namespace from the target namespace.

Note that aliases are not mappings. Aliases are abbreviations for other
namespaces created by clj::clojure.core/alias

This is distinct from a binding of `s` created via `(def s ...)`, which is said
to be a mapping, see clj::clojure.core/ns-unmap
