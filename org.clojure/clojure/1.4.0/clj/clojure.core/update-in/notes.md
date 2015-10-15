## Arities

    [m [k & ks] f & args]

## Docs

'Updates' a value in a nested associative structure, where `ks` is a
sequence of keys or expressions yielding keys and `f` is a function
that will take the old value and any supplied args and return the new
value. Returns a new nested structure. If any levels do not exist,
empty hash-maps will be created.

## Notes

As of Clojure 1.7, clj::clojure.core/update should be preferred to
`(update-in m [:foo] f)` which was previously an idiom.
