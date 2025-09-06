# Proyecto: La Bienvenida
### ESCUELA COLOMBIANA DE INGENIERÍA - CICLOS DE VIDA DE DESARROLLO DE SOFTWARE

---

## Integrantes

- Anderson Fabián García Nieto       
- Christian Alfonso Romero Martínez     

---

## Descripción

Este proyecto implementa un sistema de bienvenida para estudiantes
El sistema demuestra el uso de estructuras de datos `List` y las operaciones de **Stream** (`stream()`, `map()`, `collect()`) para procesar y formatear información de estudiantes.

---

## Ejecución

<div align="center">
  <img src="Pictures/reto1.1.png" alt="reto1.1" width="400"/>
</div>

### Salida esperada:
```
¡Hola Bienvenidos! Nosotros somos la pareja conformada por Anderson Fabian Garcia Nieto estudiante de la escuela de 6 semestre de 19 años y Christian Alfonso Romero Martinez estudiante de la escuela de 6 semestre de 20 años, nuestros correos institucionales son anderson.garcia-n@mail.escuelaing.edu.co y christian.romero-m@mail.escuelaing.edu.co
```

---

## Conceptos Técnicos Implementados

### Estructura de Datos List
```java
List<Estudiante> estudiantes = Arrays.asList(
    new Estudiante("Anderson Fabian Garcia Nieto", 19, "anderson.garcia-n@mail.escuelaing.edu.co", 6),
    new Estudiante("Christian Alfonso Romero Martinez", 20, "christian.romero-m@mail.escuelaing.edu.co", 6)
);
```

### Stream

**Implementación de Stream:**
1. **Primera transformación:** Combina información personal
   ```java
   estudiantes.stream()
       .map(estudiante -> estudiante.getNombre() + " estudiante de la escuela de " 
           + estudiante.getSemestre() + " semestre de " + estudiante.getEdad() + " años")
       .collect(Collectors.joining(" y "))
   ```

2. **Segunda transformación:** Extrae correos electrónicos
   ```java
   estudiantes.stream()
       .map(Estudiante::getCorreo)
       .collect(Collectors.joining(" y "))
   ```

### Métodos Stream

**1. `stream()`:** Convierte la colección en un flujo de datos
```java
estudiantes.stream()
```

**2. `map()`:** Transforma cada elemento del stream
```java
.map(estudiante -> estudiante.getNombre() + "...")
.map(Estudiante::getCorreo)  // Method reference
```

**3. `collect()`:** Recopila los resultados en una estructura final
```java
.collect(Collectors.joining(" y "))
```

---





<div align="center">
  <sub>Escuela Colombiana de Ingeniería Julio Garavito - 2025</sub>
</div>
