## Arities

    [pred coll]

## Docs

Returns the first logical true value of `(pred x)` for any `x` in
`coll`, otherwise returns nil.

## Notes

Note that `pred` need not return a boolean, merely a truthy
value. idiom is to use complex functions as a 'pred'icate and use the
result directly. This is likely more efficient and consise than
filtering on a predicate, mapping a function and taking the first
result thereof.
