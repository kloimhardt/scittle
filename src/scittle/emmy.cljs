(ns scittle.emmy
  (:require [emmy.env]
            [goog.string]
            [cherry.embed]
            [clojure.string :as st]))

(.log js/console (st/upper-case "hello emmy"))
(.log js/console (str (emmy.env/cos 'pi)))

(cherry.embed/preserve-ns 'emmy.env)
