# 🏥 API de Servicios Médicos

Este proyecto es una **API RESTful** desarrollada con **Spring Boot**, diseñada para gestionar médicos, pacientes y usuarios de un sistema de servicios médicos.  
La aplicación implementa autenticación, validaciones, migraciones de base de datos con Flyway y una arquitectura modular.

---

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **Flyway** (para control de versiones de la base de datos)
- **MySQL** como base de datos relacional
- **Maven** como gestor de dependencias
- **Insomnia** para verificar cada endpoint

---

## 📂 Estructura del proyecto
```
api-servicios-medicos/
│── .mvn/
│── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── med/voll/api/
│ │ │ ├── controller/ # Controladores REST
│ │ │ ├── domain/ # Entidades y records DTO
│ │ │ └── infra/ # Configuración, seguridad y excepciones
│ │ └── resources/
│ │ ├── db/migration/ # Scripts de Flyway para versionado de BD
│ │ ├── static/
│ │ ├── templates/
│ │ └── application.properties
│ └── test/ # Pruebas unitarias
└── target/
```

### 📌 Paquetes principales

- **controller** → Contiene los controladores REST (`MedicoController`, `PacienteController`, `AutenticacionController`, etc.).
- **domain** → Define las entidades y DTOs organizadas en subpaquetes: `medico`, `paciente`, `usuario`, `direccion`.
- **infra** → Configuración de seguridad, manejo de excepciones y otras utilidades.
- **resources/db/migration** → Migraciones de base de datos con Flyway.

---

## 📜 Migraciones de Base de Datos

El proyecto utiliza **Flyway** para manejar los cambios en la base de datos.

Scripts disponibles en `src/main/resources/db/migration`:

1. **V1** → Crear tabla `medicos`  
2. **V2** → Crear tabla `pacientes`  
3. **V3** → Alterar `medicos` para agregar columna `telefono`  
4. **V4** → Alterar `medicos` para agregar columna `activo`  
5. **V5** → Alterar `pacientes` para agregar columna `activo`  
6. **V6** → Crear tabla `usuarios`  

---

## 🔑 Seguridad

- Implementación con **Spring Security**
- Sistema de autenticación basado en usuarios registrados en la base de datos.
- Restricción de accesos a rutas sensibles según roles/permisos.

---

## 📌 Endpoints principales

### 👨‍⚕️ Médicos
- `POST /medicos` → Registrar un nuevo médico  
- `GET /medicos` → Listar médicos  
- `PUT /medicos/{id}` → Actualizar datos de un médico  
- `DELETE /medicos/{id}` → Inactivar médico  

### 🧑‍🤝‍🧑 Pacientes
- `POST /pacientes` → Registrar un nuevo paciente  
- `GET /pacientes` → Listar pacientes  
- `PUT /pacientes/{id}` → Actualizar datos de un paciente  
- `DELETE /pacientes/{id}` → Inactivar paciente  

### 🔐 Autenticación
- `POST /login` → Iniciar sesión y obtener token  

### 👋 Test de conexión
- `GET /hello` → Mensaje de prueba para verificar que la API está activa  

---


## 📝 Conclusiones

La construcción de esta API de servicios médicos me permitió profundizar en el uso de **Spring Boot** aplicando buenas prácticas de arquitectura y organización de código.  
Durante el desarrollo logré:

- Implementar un sistema modular con separación clara entre controladores, dominio y capa de infraestructura.  
- Aplicar **Spring Data JPA** para gestionar de forma eficiente la persistencia de datos.  
- Usar **Flyway** para mantener un control de versiones en la base de datos, facilitando su evolución.  
- Configurar **Spring Security** para proteger los endpoints mediante autenticación.  
- Probar la aplicación de manera práctica utilizando **Insomnia**, lo que me permitió validar el correcto funcionamiento de cada endpoint y garantizar la integridad de las respuestas de la API.  

En conclusión, el proyecto cumple con los objetivos planteados: ofrecer una API robusta, escalable y segura para la gestión de médicos, pacientes y usuarios dentro de un sistema de servicios médicos.

✍️ Autor
Desarrollado por Jorge Cuervo para alura en el curso de spring boot de la especialización en backend.
