## Usage

    [map key val]
    [map key val & kvs]

## Docs

From asso[ciate]. When applied to a map, returns a new map of the same
(hashed/sorted) type, that contains the mapping of key(s) to
val(s). When applied to a vector, returns a new vector that contains
val at index.

## Notes

A thin wrapper around `clojure.lang.Associative`.

When used on a vector, the index cannot exceed the length of the
vector. That is, associate is an update operation on vectors, it
cannot be used to extend a vector to arbitrary length. To extend a
vector, use clj::clojure.core/conj instead.
