## Arities

`[x y] -> Integer`

## Docs

Compares `x` to `y` as if via Java `x.compareTo(y)` and returns an
integer `n`.

- `n < 0` if `x` is "less than" `y`
- `n = 0` if `x` is "equal to" `y`
- `n > 0` if `x` is "greater than" `y`

- **Numbers**: increasing numeric order, returning 0 if two numbers
  are numerically equal by clj::clojure.core/==, even if
  clj::clojure.core/= is false.
- **Strings**, **Symbols**, **Keywords**: lexicographic order (aka
  dictionary order) by their representation as sequences of UTF-16
  code units.  This is alphabetical order (case-sensitive) for strings
  restricted to the ASCII subset.
- **Vectors**: shortest-to-longest, with lexicographic ordering among
  equal length vectors.
- `nil`: can be compared to all values above, and is considered less
  than anything else.
- All Java types implementing the Comparable interface such as
  characters, booleans, File, URI, and UUID are compared via their
  `.compareTo` methods.

## Notes

An exception will be thrown if `x` and `y` are "too different" and
cannot be compared.  Integers, Longs, and Doubles can be compared to
each other, but not strings to keywords or keywords to symbols. lists,
sequences, sets, and maps also cannot be compared.

Implementation detail: Clojure Refs can also be sorted using compare.
They are sorted in the order they were created.
