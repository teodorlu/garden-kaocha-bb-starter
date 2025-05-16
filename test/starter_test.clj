(ns starter-test
  (:require [clojure.test :refer [deftest is]]
            [starter :as starter]))

(deftest t
  (is (= (+ 1 1)
         2)))
