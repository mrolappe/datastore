## Arities

    [f coll]
    [f val coll]

## Docs

Clojure's fold right.

`f` should be a function of 2 and also of 0 arguments.

- If `val` is not supplied, returns the result of applying `f` to the
  first 2 items in coll, then applying `f` to that result and the 3rd
  item, etc.

- If coll contains no items, `f` must accept no arguments as well, and
  reduce returns the result of calling `f` with no arguments.

- If `val` is supplied, returns the result of applying `f` to `val`
  and the first item in coll, then applying `f` to that result and the
  2nd item, etc.

- If coll contains no items, returns val and f is not called.

## Notes

While clj::clojure.core/into may seem to do the same thing as
`(reduce conj ...)`, into should be preferred as it is able to make use of
transients for a significant speedup.
