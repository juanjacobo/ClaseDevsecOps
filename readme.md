# Documentación Microservicio Cliente

## Variables de ambiente usadas:
- **CLIENT_ID**(*Obligatoria*): Representa al app registration de azure
- **APP_SECRET**(*Obligatorio*): Secreto de acceso de Azure
- **TENANT_ID**(*Obligatorio*): Id del directorio de identidades de azure. 
- **KEYVAULT_URI**(*Obligatorio*): URL del servicio de key vault donde se encuentran nuestros secretos. 
- **DB_IP**(*Obligatorio*): IP del servidor mysql
- **DB_NAME**(*Obligatorio*): Nombre de la base de datos mysql.

## Métodos HTTP

- **GET (select all)**: retorna todos los clientes.
    - **request**
     ```bash
     curl --request GET \
  --url http://localhost:8082/client
     ```
    - **response**
     ```json
        [
        {
  "id": 2,
  "name": "carla",
  "address": "su casa otra casa",
  "email": "carla@gmail.com"
        },
        {
  "id": 3,
  "name": "zaira",
  "address": "su casa otra casa",
  "email": "zaira@gmail.com"
        }
        ]
     ```