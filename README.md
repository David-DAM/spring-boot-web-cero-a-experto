## 📋 Información General

**Nombre del Proyecto:** spring-boot-web-cero-a-experto
**Grupo:** com.davinchicoder
**Versión:** 0.0.1-SNAPSHOT
**Descripción:** Spring Boot Web cero a experto
**Java Version:** 21
**Spring Boot Version:** 3.5.3

## 🏗️ Estructura del Proyecto

``` 
spring-boot-web-cero-a-experto/
├── .idea/                          # Configuración de IntelliJ IDEA
├── .mvn/                           # Wrapper de Maven
├── src/                            # Código fuente
│   ├── main/
│   │   ├── java/                   # Código Java principal
│   │   └── resources/              # Recursos de la aplicación
│   └── test/                       # Pruebas unitarias
├── target/                         # Archivos compilados (generados)
├── uploads/                        # Directorio para archivos subidos
├── .dockerignore                   # Archivos ignorados por Docker
├── .gitattributes                  # Configuración de Git
├── .gitignore                      # Archivos ignorados por Git
├── compose.yml                     # Docker Compose
├── Dockerfile                      # Configuración de Docker
├── HELP.md                         # Documentación de ayuda
├── mvnw                           # Maven Wrapper (Linux/Mac)
├── mvnw.cmd                       # Maven Wrapper (Windows)
├── pom.xml                        # Configuración de Maven
├── postman_collection.json       # Colección de Postman para API testing
└── README.md                      # Documentación principal
```

## 🛠️ Tecnologías y Dependencias

### Tecnologías Principales

- **Spring Boot 3.5.3** - Framework principal
- **Java 21** - Lenguaje de programación
- **Maven** - Gestión de dependencias y construcción
- **Docker** - Containerización

### Dependencias del Proyecto

#### Dependencias Core de Spring Boot

- `spring-boot-starter-web` - Para crear aplicaciones web RESTful
- `spring-boot-starter-validation` - Validación de datos
- `spring-boot-starter-actuator` - Monitoreo y métricas de la aplicación
- `spring-boot-devtools` - Herramientas de desarrollo (hot reload)
- `spring-boot-starter-test` - Testing framework

#### Herramientas de Desarrollo

- **Lombok** - Reducción de código boilerplate mediante anotaciones
- **MapStruct 1.6.2** - Mapeo automático entre DTOs y entidades
- **lombok-mapstruct-binding 0.2.0** - Integración entre Lombok y MapStruct

#### Documentación API

- **SpringDoc OpenAPI 2.8.6** - Generación automática de documentación Swagger/OpenAPI

## 🚀 Características del Proyecto

### 1. **Arquitectura RESTful**

- Aplicación web basada en Spring MVC
- Endpoints REST para operaciones CRUD
- Validación automática de datos de entrada

### 2. **Documentación Automática**

- Swagger UI integrado para documentación interactiva de APIs
- Generación automática de especificaciones OpenAPI

### 3. **Monitoreo y Salud**

- Spring Boot Actuator para métricas y health checks
- Endpoints de monitoreo disponibles en `/actuator`

### 4. **Containerización**

- Dockerfile para crear imágenes Docker
- Docker Compose para orquestación de servicios

### 5. **Testing**

- Configuración completa para pruebas unitarias
- Colección de Postman incluida para testing de APIs

## 🔧 Configuración y Ejecución

### Requisitos Previos

- Java 21 JDK
- Maven 3.6+ (o usar el wrapper incluido)
- Docker (opcional)

### Ejecución Local

``` bash
# Usando Maven Wrapper
./mvnw spring-boot:run

# O usando Maven instalado
mvn spring-boot:run
```

### Ejecución con Docker

``` bash
# Construir imagen
docker build -t spring-boot-web-app .

# Ejecutar contenedor
docker run -p 8080:8080 spring-boot-web-app

# O usando Docker Compose
docker-compose up
```

## 📚 Endpoints y Documentación

### Documentación Swagger

- **URL:** `http://localhost:8080/swagger-ui.html`
- **Especificación OpenAPI:** `http://localhost:8080/v3/api-docs`

### Actuator Endpoints

- **Health Check:** `http://localhost:8080/actuator/health`
- **Métricas:** `http://localhost:8080/actuator/metrics`
- **Info:** `http://localhost:8080/actuator/info`

## 🧪 Testing

### Postman Collection

El proyecto incluye una colección de Postman () con todas las pruebas de API preconfiguradas. `postman_collection.json`

### Pruebas Unitarias

``` bash
# Ejecutar todas las pruebas
./mvnw test

# Ejecutar con cobertura
./mvnw test jacoco:report
```

## 📁 Gestión de Archivos

El directorio `uploads/` está configurado para manejar archivos subidos a través de la aplicación, lo que sugiere
funcionalidad de carga de archivos.

## 🔄 Desarrollo Continuo

### Hot Reload

Spring Boot DevTools está configurado para permitir:

- Reinicio automático de la aplicación al detectar cambios
- Recarga automática de recursos estáticos
- Configuración de Live Reload

### Git Integration

- Configuración completa de Git con y `.gitignore``.gitattributes`
- Preparado para control de versiones colaborativo

## 📈 Escalabilidad y Producción

El proyecto está preparado para:

- **Containerización** con Docker
- **Orquestación** con Docker Compose
- **Monitoreo** con Spring Boot Actuator
- **Documentación automática** para equipos de desarrollo

## 🎯 Casos de Uso Típicos

Este proyecto es ideal para:

- APIs RESTful empresariales
- Aplicaciones web con Spring Boot
- Microservicios
- Aplicaciones que requieren validación robusta
- Proyectos que necesiten documentación automática de API
- Aplicaciones containerizadas

**Nota:** Esta es una aplicación de demostración educativa "Cero a Experto" que implementa las mejores prácticas de
desarrollo con Spring Boot, incluyendo todas las herramientas modernas para desarrollo, testing, documentación y
despliegue.
