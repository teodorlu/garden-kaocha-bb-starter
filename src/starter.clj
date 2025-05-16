(ns starter
  (:require
   [org.httpkit.server :as server]))

(defn app [req]
  {:status 200})

(def wrapped-app
  (-> app))

(defonce !server (atom nil))

(defn start! [opts]
  (when @!server (server/server-stop! @!server) (reset! !server nil))
  (let [server (server/run-server #'wrapped-app
                                  (merge {:legacy-return-value? false
                                          :host "0.0.0.0"
                                          :port 7777}
                                         opts))]
    (reset! !server server)
    (println (format "server started on port %s"
                     (server/server-port server)))))


(comment
  (set! *print-namespace-maps* false)

  ;; Run tests without a restart
  (require 'kaocha.repl)
  (kaocha.repl/run-all)
  ;; (I prefer having a keybinding for this!)

  )
