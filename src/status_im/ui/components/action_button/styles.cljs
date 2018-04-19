(ns status-im.ui.components.action-button.styles
  (:require-macros [status-im.utils.styles :refer [defstyle defnstyle]])
  (:require [status-im.ui.components.styles :as styles]
            [status-im.ui.components.colors :as colors]))

(defstyle action-button
  {:padding-left   16
   :flex-direction :row
   :align-items    :center
   :ios            {:height 63}
   :android        {:height 56}})

(defnstyle action-button-icon-container [circle-color]
  {:border-radius    50
   :width            40
   :height           40
   :align-items      :center
   :justify-content  :center
   :background-color (or circle-color styles/color-light-blue-transparent)})

(def action-button-label-container
  {:padding-left 16})

(def action-button-label
  {:color          colors/blue
   :letter-spacing -0.2
   :font-size      16})

(defstyle actions-list
  {:background-color styles/color-white
   :android          {:padding-top    8
                      :padding-bottom 8}})

(def action-button-label-disabled
  (merge action-button-label
         {:color styles/color-gray4}))

(defstyle action-button-icon-container-disabled
  {:border-radius    50
   :width            40
   :height           40
   :align-items      :center
   :justify-content  :center
   :background-color styles/color-light-gray})

