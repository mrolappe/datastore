## Arities

    [bindings then]
    [bindings then else & oldform]

## Docstring

    bindings => binding-form test

If test is truthy, evaluates the then expression with binding-form
bound to the result of the test, if not, yields the result of the else
expression.
