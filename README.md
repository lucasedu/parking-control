# parking-control

docker run -p 5432:5432  --name container-postgresdb -e POSTGRES_PASSWORD=admin -d postgres

docker run -p 5050:80  -e "PGADMIN_DEFAULT_EMAIL=name@example.com" -e "PGADMIN_DEFAULT_PASSWORD=admin"  -d dpage/pgadmin4

host: host.docker.internal
database: postgres
user: postgres
password: admin
