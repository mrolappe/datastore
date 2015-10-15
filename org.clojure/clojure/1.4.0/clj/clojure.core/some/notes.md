## Arities

    [pred coll]

## Docs

Returns the first logical true value of `(pred x)` for any `x` in
`coll`, otherwise returns nil.

## Notes

Note that `pred` can return a truthy value, not just true or false.
A common idiom is to use complex functions as a `pred`icate to extract
and compute the result in one step.
This is usually more efficient and concise than filtering on a predicate,
mapping a function and taking the first result.
