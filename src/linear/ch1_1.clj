(ns linear.ch1-1
  (:require [linear.row-operations :refer [swap-rows update-row]]
    [incanter.core :refer :all]
            [clojure.pprint :refer [pprint]]))

;; Example 3:
;; Determine if the following system is consistent:
;;          x2 -  4 x3 = 8
;; 2 x1 - 3 x2 +  2 x3 = 1
;; 4 x1 - 8 x2 + 12 x3 = 1

(def mx1
  (-> (matrix [[0 1 -4 8]
               [2 -3 2 1]
               [4 -8 12 1]])
      (update-row [1 2] #(plus %1 (mult -0.5 %2)))
      (update-row [0 1] minus)))

; (println mx1)

;; The system is inconsistent.


