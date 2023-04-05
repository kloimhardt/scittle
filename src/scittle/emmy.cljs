(ns scittle.emmy
  (:require
   [emmy.env]
   [sci.core :as sci]
   [cherry.embed :as cherry]
   [scittle.core :as scittle]))

(cherry/preserve-ns 'emmy.env)

(def emmy-env-ns (sci/create-ns 'emmy.env nil))

(def emmy-namespace
  (sci/copy-ns emmy.env emmy-env-ns))

(def namespaces
  {'emmy.env emmy-namespace})

(def config
  {:namespaces namespaces})

(scittle/register-plugin!
 ::emmy
 config)
