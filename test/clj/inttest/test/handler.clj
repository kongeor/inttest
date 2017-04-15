(ns inttest.test.handler
  (:require [clojure.test :refer :all]
            [ring.mock.request :refer :all]
            [inttest.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (is (= "7" (slurp "http://localhost:3000/api/plus?x=5&y=2")))))
