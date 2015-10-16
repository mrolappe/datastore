## Arities

    [pred]
    [pred coll]

## Docstring

Returns a lazy sequence of the items in coll for which `(pred item)`
returns true. pred must be free of side-effects.

Returns a transducer when no collection is provided.

## Notes

 - See also clj::clojure.core/keep which should be preferred to
   `(->> col (filter p) (map f))`
