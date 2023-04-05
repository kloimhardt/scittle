(ns scittle.cherry-embed
  (:require
   [cherry.embed]))

(cherry.embed/preserve-ns 'cljs.core)
(.log js/console (cherry.embed/eval-string "(+ 1 1)"))
