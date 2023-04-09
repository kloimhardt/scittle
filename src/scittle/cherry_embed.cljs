(ns scittle.cherry-embed
  (:require [goog.string]
            [cherry.embed]
            [clojure.string :as st]))

(cherry.embed/preserve-ns 'cljs.core)
(.log js/console (st/upper-case "Cherry enabled"))
