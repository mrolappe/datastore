## Arities

`[expr & forms] -> Val`

## Docs

Threads `expr` through `forms` as if by clj::clojure.core/-> but short
circuits if a `nil` is generated.

## Notes

Handy for dealing with `nil` punning together with Java interop which
is not `nil` safe.

## See Also

- clj::clojure.core/some->>
