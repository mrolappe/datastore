## Usage
```
[bindings & body]
```

## Docs

Takes a vector of bindings or
[destructuring](http://clojure.org/reference/special_forms#binding-forms) forms, followed by
arbitrarily many forms which will be executed with the given bindings. Bindings are evaluated and
established sequentially, and may refer to prevous bindings in the vector. The result of the last
body form is retuned.
