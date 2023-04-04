(ns scittle.emmy
  (:require
   [sicmutils.env]
   [sci.core :as sci]
   #_[cherry.embed :as cherry]
   [scittle.core :as scittle]))

#_(cherry/preserve-ns 'sicmutils.env)

(def emmy-env-ns (sci/create-ns 'sicmutils.env nil))

(def emmy-namespace
  (sci/copy-ns sicmutils.env emmy-env-ns))

(def namespaces
  {'emmy.env emmy-namespace})

(def config
  {:namespaces namespaces})

(scittle/register-plugin!
 ::emmy
 config)
