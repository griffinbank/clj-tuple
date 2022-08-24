(ns clj-tuple)

;; clj-tuple's original implementation accessed private members of
;; clojure.lang.PersistetentHashMap (_hash). This has been disallowed
;; in recent JVM versions, and breaks if clj-tuple and clojure.jar are
;; in separate classloaders (like rules_clojure)

;; Separately, clojure.core PHM and PHV performance has improved, and
;; this implementation is no longer necessary

(def hash-map clojure.core/hash-map)

(def vector clojure.core/vector)

(def tuple vector)
