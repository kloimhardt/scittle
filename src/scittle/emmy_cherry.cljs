(ns scittle.emmy-cherry
  (:require
   [emmy.env]
   [cherry.embed]))

(cherry.embed/preserve-ns 'cljs.core)
(cherry.embed/preserve-ns 'emmy.env)
