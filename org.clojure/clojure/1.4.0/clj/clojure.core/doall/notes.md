## Arities

    [coll] -> coll
    [n coll] -> coll

## Docstring

Walks the first `n` of a sequence, or its full length if `n` is not
provided forcing elements of the sequence to be computed. Returns the
head of the sequence as if no elements had been consumed, however the
first `n` will have been forced and will reside in memory.

## Notes

When lazy sequences are produced via functions that have side effects,
any effects other than those needed to produce the first element in
the seq do not occur until the seq is consumed. See
clj::clojure.core/map for some discussion of this behavior. `doall`
can be used to force any effects to occur by causing sequence elements
to be computed.

## See Also
- clj::clojure.core/dorun
