## Arities

    [pred coll] -> coll
    
## Docs

Returns a vector of the items in `coll` for which `(pred item)` is truthy.

## Notes

`pred` is supposed to be free of side-effects according to the
official docs. However as vectors must be eagerly constructed,
side-effects in `filterv` are predictable.

Otherwise identical to `filter` which is lazy.

## See Also
- clj::clojure.core/filter
