(ns sicp-clj.pascal-triangle-test
  (:require
   [clojure.test :refer [deftest is]]
   [sicp-clj.pascal-triangle :as subject]))

(deftest calc-row-test
  (is (= [1 4 6 4 1]
         (subject/calc-row [1 3 3 1]))))