(ns linear.row-operations
  (:require [incanter.core :refer :all]
            [clojure.pprint :refer [pprint]]))

(defn swap-rows [mx r1 r2]
  (matrix (assoc (vec mx)
                 r1 (nth mx r2)
                 r2 (nth mx r1))))

(defmulti update-row (fn [_ rows _ & _] (coll? rows)))

(defmethod update-row false
  [mx row f & r]
  (matrix (assoc (vec mx)
                 row (apply f (nth mx row) r)))) 

(defmethod update-row true
  [mx rows f & r]
  (matrix
    (assoc (vec mx)
     (first rows) (apply f (concat
                             (map #(nth mx %) rows)
                             r)))))
