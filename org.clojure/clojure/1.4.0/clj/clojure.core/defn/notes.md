## Arities
```
[name docstring? attr-map? [params*] prepost-map? body]
[name docstring? attr-map? ([params*] prepost-map? body)+]
```

## Docs

Same as `(def name (fn [params* ] exprs*))` or `(def name (fn ([params* ] exprs*)+))` with any
docstring or attrs added to the Var metadata. Function parameter bindings support
[destructuring](http://clojure.org/reference/special_forms#binding-forms).

### Pre/Post conditions

`prepost-map` is a map with the optional keys `:pre` and `:post`. Other keys are ignored. Each
should be a vector of forms respectively to be run as preconditions or postconditions. Each form is
treated as an assertion statement, and if any form evaluates `false` (see clj::clojure.core/boolean)
then an `AssertionError` is thrown. Preconditions may refer to argument bindings. Postconditions may
refer to argument bindings, and to the return value of the fn as `%`.

## Notes

- It is poor style to parenthesize a single arity. Eg, `(defn foo [x] x)` rather than `(defn foo ([x] x))`.
- It is poor style to use reader metadata on the name rather than to use the attr map.
- It is poor style to put a `:doc` entry in the attr map rather than use the docstring.
