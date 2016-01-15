## Arities

    [atom f]
    [atom f x]
    [atom f x y]
    [atom f x y & args]

## Docs

Atomically swaps the value of atom to be:

    (apply f current-value-of-atom args)

Returns the value that was swapped in.

## Notes

`f` may be called multiple times due to CAS transaction retry, and
thus should be free of side effects.

## See Also
- clj::clojure.core/reset!
