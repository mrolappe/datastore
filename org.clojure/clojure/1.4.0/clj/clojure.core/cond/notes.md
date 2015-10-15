## Arities

    [& clauses] -> Any

## Docs

Macro on a series of tests followed by exprs. Each test is evaluated
one at a time, if a test returns logical true, the corresponding expr
is evaluated and returned without evaluating any more tests or
exprs.

Most easily understood as a shorthand for flattening chains of deeply
nested clj::clojure.core/if forms.

## Notes

- `(cond)` returns nil.
- Returns nil if no tests returned true
- It is a common pattern to use the keyword `:else` as the test on the
  final clause of a `cond` form. `:else` has no special meaning, it is
  simply a truthy value which clearly communicates that the following
  clause is the final else branch of the entire cond form. `:else`
  should be preferred to the `true` constant for clarity's sake.
