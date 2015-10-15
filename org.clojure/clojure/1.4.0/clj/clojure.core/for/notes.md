## Arities

    [bindings body-expr] -> Seq

## Docs

For is a macro for concisely expressing list comprehensions. Takes a
vector of one or sequence expressions, each of which may be followed
by zero or more modifiers, and yields a lazy sequence of evaluations
of the body expression. Unlike regular bindings established by
clj::clojure.core/let, sequence expressions are bindings understood to
be bindings to the elements of a collection. These bindings are
iterated in a nested fashion, rightmost fastest, and nested coll-exprs
can refer to bindings created in prior binding-forms.

Supported modifiers are:

- `:let [binding-form expr ...]` which establishes normal non-iterated bindings
- `:while form` which allows for the termination of the sequence when `form` is truthy
- `:when form` which continues unless `form` is truthy

## Notes

For is lazy! This means that you can't really use for to express
imperatively performing some operation a bunch of times as one would
with an imperative loop. If that's what you're after,
clj::clojure.core/doseq is the tool you want.
