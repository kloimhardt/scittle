# Scittle
## Try out emmy with this forked branch
In the ususal way, clean and build Scittle, now containing the [Cherry](https://github.com/squint-cljs/cherry/blob/main/doc/embed.md) compiler:

```
/scittle$ bb clean
/scittle$ bb prod
```

Then build an extra library containing the [Emmy Algebra System](https://github.com/mentat-collective/emmy). Note that the compiler option `:output-wrapper true` is used.

```
/scittle$ bb sciweb
```

Call Emmy from Cherry by opening `emmy-extra.html` in the browser.

## License

Copyright © 2021 - 2022 Michiel Borkent

Distributed under the EPL License. See LICENSE.
