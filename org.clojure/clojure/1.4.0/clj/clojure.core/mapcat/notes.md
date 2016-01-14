## Usage

    [f]
    [f & colls]

## Docs

Returns the result of applying clj::clojure.core/concat to the result
of applying clj::clojure.core/map to `f` and `colls`. Thus function
`f` should return a collection or `nil`.

Returns a transducer when no collections are provided.

