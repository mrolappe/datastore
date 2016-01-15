## Arities

    [f]
    [f coll]
    [f c1 c2]
    [f c1 c2 c3]
    [f c1 c2 c3 & colls]

## Docs

Returns an eagerly evaluated vector of the results of applying `f` to
the set of first items of each coll, followed by applying `f` to the
set of second items in each coll, until any one of the colls is
exhausted.

Any remaining items in other colls are ignored.

Function `f` should accept number-of-colls arguments.

Returns a transducer when no collections are provided.

## Notes

`mapv` is identical to clj::clojure.core/map except that where `map`
generates a lazy sequence, `mapv` is eager. Thus while side-effects in
a `map` operation aren't a great idea, they are at least predictable
within a `mapv` where they may not be in a `map`.

## See Also

- clj::clojure.core/mapv
