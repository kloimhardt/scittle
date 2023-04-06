(ns scittle.cherry-embed
  (:require [goog.string]
            [clojure.string :as st]))

(.log js/console (st/upper-case "hello world"))
