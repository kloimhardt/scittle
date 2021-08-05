(ns scittle.reagent
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [sci.core :as sci]
            [scittle.core :as scittle]))

(def rns (sci/create-ns 'reagent.core nil))

(def reagent-namespace
  {'argv (sci/copy-var r/argv rns)
   'as-element (sci/copy-var r/as-element rns)
   'atom (sci/copy-var r/atom rns)
   'create-class (sci/copy-var r/create-class rns)})

(def rdns (sci/create-ns 'reagent.dom nil))

(def reagent-dom-namespace
  {'dom-node (sci/copy-var rdom/dom-node rdns)
   'render (sci/copy-var rdom/render rdns)})

(scittle/register-plugin!
 ::reagent
 {:namespaces {'reagent.core reagent-namespace
               'reagent.dom reagent-dom-namespace}})
