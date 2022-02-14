#!/usr/bin/env bash

docker exec -ti --user postgres hellopatient_db_1 psql -Upatient_role hellopatientdb
