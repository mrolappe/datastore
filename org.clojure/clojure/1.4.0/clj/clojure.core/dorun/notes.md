## Arities

    [coll] -> nil
    [n coll] -> nil

## Docstring

Walks the first `n` of a sequence, or its full length if `n` is not
provided forcing elements of the sequence to be computed. Returns
`nil`.

## Notes

When lazy sequences are produced via functions that have side effects,
any effects other than those needed to produce the first element in
the seq do not occur until the seq is consumed. See
clj::clojure.core/map for some discussion of this behavior. `dorun`
can be used to force any effects to occur by causing sequence elements
to be computed.
