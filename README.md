# sbt bug 4125

See [sbt/sbt#4125](https://github.com/sbt/sbt/issues/4125) for context.

## Instructions

Open a shell and 

``` bash
git checkout "x=1"
```

Now run `sbt` on a different shell and do `~test`. Once it runs for the first time,

``` bash
git checkout "x=2"
```

Take a look at the test passing, and the definitions of `x` and `y`.
