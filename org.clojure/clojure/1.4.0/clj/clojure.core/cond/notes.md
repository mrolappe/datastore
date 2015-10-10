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
- returns nil if no tests returned true
