## Arities

    [bindings & body] -> nil

## Docs

Repeatedly executes the body form(s) (presumably for side-effects)
with the bindings and filters. Does not retain the head of the
sequence. Returns nil no matter what the result of the body is.

As with clj::clojure.core/for, doseq supports modifiers in the
bindings vector. Supported modifiers are:

- `:let [binding-form expr ...]` establishes normal non-iterated bindings
- `:while form` aborts the entire computation when `form` is truthy
- `:when form` continues at the previous level unless `form` is truthy
