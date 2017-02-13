(ns linear.ch1-2-reduction-echelon
  (:require [linear.row-operations :refer [swap-rows update-row add-multiple]]
    [incanter.core :refer :all]
            [clojure.pprint :refer [pprint]]))

(def example-4
  "Find the general solution for the linear system whose augmented mx has been reduce to:"
  (-> (matrix [[1 6 2 -5 -2 -4]
               [0 0 2 -8 -1  3]
               [0 0 0  0  1  7]])
      (update-row [1 2] add-multiple 1)
      (update-row [0 2] add-multiple 2)
      (update-row [0 1] add-multiple -1)
      (update-row 1 mult 0.5)))

; (println example-4)

; x2 and x4 are free.

(def practice-1
  "Find the general solution of this matrix's linear system:"
  (-> (matrix [[1 -3 -5  0]
               [0  1 -1 -1]])
      (update-row [0 1] add-multiple 3)
      ))

;; x1 = -3 - 8 x3
;; x2 = -1 - x3
;; x3 is free.

; (println practice-1)

;; practice-3

;; Consistent. If the non-pivot columns are nonzero, there are infinitely many solutions, otherwise 1. The problem didn't state whether those are nonzero.


