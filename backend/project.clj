(defproject hello-patient "0.1.0-SNAPSHOT"
  :description "hello-patient"
  :url "http://example.com/FIXME"

  ;; NA. NOTE: Just check next.jdbc build dependencies for latest.
  ;; - https://github.com/seancorfield/next-jdbc/blob/develop/deps.edn
  ;; - https://cljdoc.org/d/com.github.seancorfield/next.jdbc/1.2.772/doc/getting-started
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.github.seancorfield/next.jdbc "1.2.772"]
                 [org.postgresql/postgresql "42.3.1"]]
  :main ^:skip-aot hello-patient.core
  :repl-options {:init-ns hello-patint.core})
