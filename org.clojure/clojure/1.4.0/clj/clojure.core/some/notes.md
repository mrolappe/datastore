## Arities

    [pred coll]

## Docs

Returns the first logical true value of `(pred x)` for any `x` in
`coll`, otherwise returns nil.

## Notes

Note that `pred` need not return a boolean, merely a truthy value. An
idiom is to use complex functions as `pred` and then consider the
result directly rather than simply using some as a test.
