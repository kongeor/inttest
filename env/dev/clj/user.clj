(ns user
  (:require [mount.core :as mount]
            inttest.core))

(defn start []
  (mount/start-without #'inttest.core/repl-server))

(defn stop []
  (mount/stop-except #'inttest.core/repl-server))

(defn restart []
  (stop)
  (start))


