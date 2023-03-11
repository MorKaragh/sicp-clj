(ns sicp-clj.factorial-test
  (:require
   [clojure.test :refer [deftest is]]
   [sicp-clj.factorial :as subject]))

(deftest factorial-test
  (is (== 6
         (subject/factorial 3))))