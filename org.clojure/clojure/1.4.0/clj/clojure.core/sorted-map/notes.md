## Arities

`[& keyvals] -> Map`

## Docs

Constructs a sorted map. Sorted maps maintain their keys in sorted
order, using clj::clojure.core/compare to determine sorting order.
Use clj::clojure.core/sorted-map-by to get a different key order.

Sorted maps are in most ways similar to unsorted maps.
Differences include:

* clj::clojure.core/seq returns a sequence of the key/value pairs in
  order, sorted by their keys.  This affects all other sequence-based
  operations upon sorted maps, e.g. first, rest, map, for, doseq, and
  many others.
* clj::clojure.core/rseq returns this same sequence but in reverse
  order.  It does so lazily, unlike `(reverse (seq coll))`, which must
  generate the entire sequence before it can reverse it.
* You can use clj::clojure.core/subseq or clj::clojure.core/rsubseq on
  a sorted map to get a sorted sequence of all key/value pairs with
  keys in a specified range.
* Unsorted maps use clj::clojure.core/= to compare keys, but sorted
  maps use compare or a caller-supplied comparator.  A sorted map's
  comparator can throw exceptions if you put incomparable keys in the
  same map.
* There is no transient version of sorted maps.

## See also

 - clj::clojure.core/hash-map
