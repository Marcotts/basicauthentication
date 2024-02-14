Projet Phare

Ajouter un Docker Compose


Quelques commandes à retenir
docker images

Regarder la colonne TAG ceci permet de voir a quelle version mon image est à jour.

docker pull ccdsergio/sergioapp:master-d13005c

Créer le Containers

docker run -d --name BasicAuthentication -p 8095:8095 cb8bc90f35a50f329c94979ec1d371e83c3904eedcd3a8fa00b3fda5bca5acf0

