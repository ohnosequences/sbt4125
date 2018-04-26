# sbt bug 4125

See [sbt/sbt#4125](https://github.com/sbt/sbt/issues/4125) for context.

## steps

Open a shell and 

``` bash
git checkout "x=1"
```

Now run `sbt` on a different shell and do `~test`. Once it runs for the first time,

``` bash
git checkout "x=2"
```

Take a look at the test passing, and the definitions of `x` and `y`.

## Problem

Incremental compilation when used together with the optimizer generates incorrect bytecode: modifications in methods/vals are not propagated to wherever they are being inlined.

## Expectation

The incremental compiler should not *ever* generate incorrect bytecode.

## Version

sbt `1.1.0` most likely previous ones too.
