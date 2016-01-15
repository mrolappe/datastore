## Arities

    [s match replacement]

## Docs

Replaces all instance of match with replacement in s.

`match, replacement` must be one of the following pairs of types,
- String, String
- Char, Char
- Pattern, String
- Pattern, function of match

The replacement is literal (i.e. none of its characters are treated
specially) for all cases above except `Pattern, String`.

For `Pattern, String`, `"$1"`, `"$2"`, etc. in the replacement string
are substituted with the string that matched the corresponding
parenthesized group in the pattern. If you wish your replacement
string r to be used literally, use `(re-quote-replacement r)` as the
replacement argument. See [java.util.regex.Matcher/appendReplacement](http://docs.oracle.com/javase/7/docs/api/java/util/regex/Matcher.html#appendReplacement(java.lang.StringBuffer,%20java.lang.String)).
   
## See Also
- clj::clojure.string/re-quote-replacement
- clj::clojure.string/replace-first
