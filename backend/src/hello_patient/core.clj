(ns hello-patient.core
  (:require
   [next.jdbc :as jdbc]
   [next.jdbc.sql :as sql]))
   ;[next.jdbc.result-set :as rs]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; NA. NOTE
;; - does not work? FIX. not function definition, needed to be local def
;; (defn ds [] (jdbc/get-datasource
;;              {:dbtype "postgresql"
;;               :dbname "hellopatientdb"
;;               :user "patient_role"
;;               :password "patient123"}))

;; NA. NOTE
;; - does not work? FIX. not function definition, needed to be local def
;; (defn ds [] (jdbc/get-datasource
;;               {:subprotocol "postgresql"
;;                :subname "//localhost/hellopatientdb"
;;                :user "patient_role"
;;                :password "patient123"}))

;; NA. NOTE
;; - https://cljdoc.org/d/com.github.seancorfield/next.jdbc/1.2.772/api/next.jdbc#get-datasource
(def db {:dbtype "postgres"
         :dbname "hellopatientdb"
         :user "patient_role"
         :password "patient123"})

(def ds
  (jdbc/get-datasource db))

(defn get-first-user [ds]
  (first (sql/query ds ["select * from patient"])))

(defn get-users [ds]
  (sql/query ds ["select * from patient"]))

(defn -main
  []
  (foo 123)
  (print ds)
  (get-users ds))
