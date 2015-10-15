## Arities

    [coll x] -> coll
    [coll x & xs] -> coll

## Docs

Conjoins elements onto a collection. Returns a new collection with the
xs 'added'. The 'addition' may happen at different 'places' depending
on the concrete type.

## Notes

- If `coll` is nil, builds a list.
- Lists (clj::clojure.core/list) are added to at the front
- Vectors (clj::clojure.core/vector) are added to at the back
- Queues are added to at the back
- Maps may have `[k v]` pairs added and aren't generally ordered
- Sets may have elements added and aren't generally ordered

Not to be confused with clj::clojure.core/cons

Collections which wish to participate in the conj function must
implement `clojure.lang.IPersistentCollection.cons(Object)`
[link](https://github.com/clojure/clojure/blob/master/src/jvm/clojure/lang/RT.java#L649),
however as with most of the Clojure implementation this is not
officially considered a public API.
