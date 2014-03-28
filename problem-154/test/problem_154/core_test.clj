(ns problem-154.core-test
  (:require [problem-154.core :refer :all])
  (:use [midje.sweet]))

(fact "failing test"
  (+ 1 1) => 2)
