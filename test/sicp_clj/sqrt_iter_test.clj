(ns sicp-clj.sqrt-iter-test
  (:require
   [clojure.test :refer [deftest is]]
   [sicp-clj.sqrt-iter :as subject]))

(deftest abs-test
  (is (= 2 (subject/abs -2)))
  (is (= 2 (subject/abs 2)))
  (is (= 0 (subject/abs 0))))

(deftest good-enough?-test
  (is (= true (subject/good-enough? 2 4)))
  (is (= true (subject/good-enough? -2 4))))

(deftest sqrt-iter-test
  (is (= 2.0 (subject/sqrt-iter 4)))
  (is (thrown? java.lang.AssertionError (subject/sqrt-iter -2))))