## Arities

    [n coll]
    [n step coll]
    [n step pad coll]

## Docstring

Returns a lazy sequence of partitions of the input `coll` of `n` items
each, at offsets `step` apart. If step is not supplied, defaults to
`n`, i.e. the partitions do not overlap.

**WARNING**: No validiation is performed to ensure that the last
partition contains `n` elements! By default `partition` will happily
return a ragged last element.

If a pad collection is supplied, its elements are used as necessary to
pad the last partition up to `n` items. In case there are not enough
padding elements, a ragged trailing element will still be generated.
