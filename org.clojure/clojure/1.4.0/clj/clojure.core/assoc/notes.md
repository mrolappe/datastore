## Arities

    [Associative key val] -> Associative
    [Associative key val & kvs] -> Associative

## Docs

Assoc[iate] keys to values on an associative collection. When applied
to a map, returns a new map of the same (hashed/sorted) type, that
contains the mapping of key(s) to val(s). When applied to a vector,
returns a new vector that contains val at index.

## Notes

**WARNING** A vector cannot be extended beyond its existing length via
assoc. See clj::clojure.core/conj for vector extending behavior.
