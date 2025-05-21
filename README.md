# Proyecto Biblioteca UPTC

Este proyecto es una API REST construida con **Spring Boot**, que permite la **gestión de usuarios, recursos bibliográficos y préstamos** dentro del sistema de biblioteca de la UPTC.

---

## Autor

- **Nombre:** Nicolas Alejandro Chaparro Verdugo
- **Código:** 202021532
- **Programa:** Ingeniería de Sistemas y Computación
- **Fecha:** 20 Mayo de 2025

---

### Tecnologías usadas
- Java 17

- Spring Boot

- Spring Data JPA

- PostgreSQL (via Supabase)

- Swagger / OpenAPI

- Maven

## Puesta en marcha del proyecto

### Requisitos:

- Java 17 o superior
- Maven
- Conexión a una base de datos (este proyecto usa **PostgreSQL en Supabase**)
- 
- IntelliJ IDEA o cualquier IDE compatible

## Link de Ejecución:
http://localhost:8080/docs

## Ejemplos de Json para la correcta ejecución en Swagger:
```json
###Para crear un Usuario

{
  "nombre": "Juan Pérez",
  "identificacion": "12345",
  "correo": "juan@example.com",
  "prestamos": null
}
### Para crear un libro:

{
  "titulo": "Cien años de soledad",
  "autor": "Gabriel García Márquez",
  "anioPublicacion": 1967
}

### Para crear un prestamo:

{
  "fechaPrestamo": "2025-05-20",
  "fechaDevolucion": "2025-06-28",
  "usuario": {
    "id": 1
  },
  "recurso": {
    "id": 1
  }
}



