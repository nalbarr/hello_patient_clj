help:
	@echo make shell
	@echo ""
	@echo make docker-up
	@echo make db-init
	@echo make db-shell
	@echo make docker-down
	@echo ""
	@echo make tests

# NA. NOTE: will default to clojure profile in dev-resources/user.clj
shell:
	lein repl

docker-up:
	. ./bin/docker-up.sh

db-init:
	. ./bin/db-init.sh

db-shell:
	. ./bin/db-shell.sh

docker-down:
	. ./bin/docker-down.sh

# NA.
# NOTE. make test conflicts with Clojure default test/ directory structure
tests:
	lein test

run:
	lein run
