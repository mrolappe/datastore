## Arities

    [] -> Any
    [stream] -> Any
    [opts stream] -> Any

## Docs

Reads the next object from stream, which must be an instance of
`java.io.PushbackReader` or some derivee. Stream defaults to the
current value of clj::clojure.core/*in*

Reads data in the [edn format](http://edn-format.org).

opts is a map that can include the following keys:

- `:eof` - value to return on end-of-file. When not supplied, an exception will be thrown when end of file is encountered.
- `:readers`  - a map of tag symbols to data-reader functions to be considered before clj::clojure.core/default-data-readers . When not supplied, only the default-data-readers will be used.
- `:default` - A function of two args, that will, if present and no reader is found for a tag, be called with the tag and the value.
