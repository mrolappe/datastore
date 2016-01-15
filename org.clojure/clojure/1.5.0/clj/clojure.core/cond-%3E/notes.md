## Arities

`[expr & clauses] -> Val`

## Docs

Takes an expression `expr` and a series of `test, form` pairs.
Threads the `expr` through each form as if by clj::clojure.core/->
when the corresponding test is truthy. Unlike clj::clojure.core/cond,
does not short circuit on the first true test expression, so all tests
will be evaluated and all forms may be applied to `expr`.

## Notes

Composes nicely with clj::clojure.core/-> and clj::clojure.core/->> to
express several applications on a single expr. Also composes with
clj::clojure.core/as-> and itself.

While `cond->` can succinctly express huge chains of sequential
conditional updates, taste should be used to avoid repetition, limit
length and ensure reusability.
