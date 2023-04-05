(ns scittle.emmy-sci
  (:require
   [emmy.env]
   [sci.core :as sci]
   [scittle.core :as scittle]))

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
