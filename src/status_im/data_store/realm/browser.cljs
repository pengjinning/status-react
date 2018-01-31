(ns status-im.data-store.realm.browser
  (:require [status-im.data-store.realm.core :as realm]
    [status-im.utils.random :refer [timestamp]])
  (:refer-clojure :exclude [exists?]))

(defn get-all
  []
  (-> @realm/account-realm
      (realm/get-all :browser)
      (realm/sorted :timestamp :desc)
      (realm/js-object->clj)))

(defn save
  [browser update?]
  (realm/save @realm/account-realm :browser browser update?))

(defn exists?
  [browser-id]
  (realm/exists? @realm/account-realm :browser {:browser-id browser-id}))

(defn get-by-id
  [browser-id]
  (-> @realm/account-realm
      (realm/get-one-by-field-clj :browser :browser-id browser-id)))