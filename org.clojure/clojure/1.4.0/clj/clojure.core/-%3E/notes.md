## Arities

`[expr & forms] -> Val`

## Docs

Known as "thread-first".

Sequentially threads `expr` through the forms, inserting `expr` as the
second item (first argument) of the 1st form, that form as the first
argument of the 2nd form and soforth.

If a form is not a list, Eg. is a bare symbol, set, keyworkd or other
structure, then a list is created with the form value as the 1st
element and the threaded `expr` as the 2nd element.


## See also
- clj::clojure.core/->>
