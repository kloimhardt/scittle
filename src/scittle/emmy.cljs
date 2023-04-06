(ns scittle.emmy
  (:require [emmy.env]
            [goog.string]
            [clojure.string :as st]))

(.log js/console (st/upper-case "hello emmy"))
(.log js/console (emmy.env/cos 'pi))
(.log js/console (str (emmy.env/cos 'pi)))
