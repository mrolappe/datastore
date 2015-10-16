## Arities

    [f x]

## Docstring

Returns a lazy, infinite sequence `(x, (f x), (f (f x)), ...)`.

## Note

Like all operations involving lazy sequences, f should be free of side
effects. Not because this is enforced, Clojure being an impure
language, but because sequence chunking makes it difficult if not
impossible to reason about the timing of effects.
