## Arities

    [ns sym] -> nil

## Usage

Removes a mapping for a symbol from the target namespace.

Namespace mappings represent top level bindings created by
clj::clojure.core/def, and aliases for defs.

Note that mappings are distinct from aliases in that where mappings represent
defs or renamings of defs (see clj::clojure.core/refer `:rename`) where aliases
allow shorthand for other namespaces (see clj::clojure.core/require `:as`,
clj::clojure.core/ns-unalias).
