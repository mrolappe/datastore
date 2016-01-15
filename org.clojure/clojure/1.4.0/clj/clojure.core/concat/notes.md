## Arities

    []
    [x]
    [x y]
    [x y & zs]

## Docs

Returns a lazy sequence consisting of the elements of the argument
sequences concatenated from left to right.

## Notes

Concatenated concatenations do not flatten automatically! Thus
clj::clojure.core/reduce with `concat` will generate hugely nested
structures and can easily generate stack overflows when attempting to
walk the resulting sequence. `(apply concat ...)` should be preferred.
