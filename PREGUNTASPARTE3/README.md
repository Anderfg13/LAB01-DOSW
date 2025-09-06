# PREGUNTAS-PARTE3
# Preguntas y Respuestas

## ¿Cuál es la diferencia entre git merge y git rebase?

Git merge y git rebase son dos formas de integrar cambios entre ramas, pero funcionan diferente.  
**Merge** crea un nuevo commit que junta las dos ramas, manteniendo el historial completo con todas las ramas.  
**Rebase**, en cambio, recoloca los commits encima de la rama destino, como si se hubieran hecho desde el último punto de esa rama.  

- **Merge** es mejor para ramas públicas o cuando se quiere preservar todo el historial.  
- **Rebase** es útil para limpiar el historial antes de integrar cambios, pero no se recomienda para ramas compartidas porque reescribe la historia.  

---

## Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?

Cuando dos ramas modifican exactamente la misma línea de un archivo, Git no puede decidir automáticamente qué cambio conservar.  
Esto genera un **conflicto de merge**.  

- Git avisa que hay un conflicto y marca el archivo con ambos cambios.  
- Se debe resolver manualmente editando el archivo, decidiendo qué cambio mantener o combinando ambos.  
- Después de resolverlo, se ejecuta:  

---

## ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

Se puede usar `git log` con parámetros útiles:

- `git log --oneline --graph --all` → muestra el historial en forma gráfica con líneas y ramas.  
- `git log --oneline --graph --decorate` → además muestra los nombres de las ramas y tags.  
- Para ver solo los últimos cambios:  
  `git log --oneline --graph -10`

---

## Explica la diferencia entre un commit y un push

Un commit y un push son operaciones diferentes:

- **Commit**: guarda los cambios en el repositorio local, creando un punto en el historial del proyecto (como guardar en la computadora).  
- **Push**: sube los commits locales al repositorio remoto (GitHub, GitLab, etc.), compartiendo el trabajo con el equipo.  

---

## ¿Para qué sirve git stash y git pop?

- **git stash**: guarda temporalmente cambios que no se quieren commitear todavía, como un cajón de trabajo en progreso.  
  Útil si se necesita cambiar de rama rápidamente sin perder avances.  

- **git pop**: recupera lo guardado en el stash y lo aplica de nuevo en el directorio de trabajo.  
  Permite retomar el trabajo pendiente sin perderlo.

---

## ¿Qué diferencia hay entre HashMap y HashTable?

Ambas estructuras almacenan pares clave-valor, pero con diferencias:

### HashMap
- No es *synchronized* → no es seguro para hilos múltiples, pero es más rápido.  
- Permite claves y valores `null`.  
- Se prefiere en proyectos nuevos.  

### HashTable
- Es *synchronized* → seguro para múltiples hilos, pero más lento.  
- No permite claves ni valores `null`.  
- Es una clase más antigua; en lugar de usarla, se recomienda **ConcurrentHashMap** si se necesita seguridad para hilos múltiples.

## Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
`Collectors.toMap()` permite ahorrar código y deja más claro que se quiere transformar una colección en un `Map`.  
Es más legible porque expresa la intención en una sola operación y se integra directamente con el resto del pipeline de streams.  
Además, facilita el manejo de claves duplicadas (ya sea lanzando excepción o combinando valores) sin necesidad de escribir lógica adicional en un bucle.  
Al ser parte de la API de streams, también se adapta bien a operaciones en paralelo si es necesario.

---

## Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?
Se realiza una operación de transformación.  
`map()` toma cada elemento del stream, aplica la función definida y produce otro stream con los resultados.  
La lista original no se modifica; se genera un nuevo stream con los valores transformados.

---

## Que hace el método stream().filter() y que retorna?
`filter()` se utiliza para conservar únicamente los elementos que cumplen una condición.  
Se le pasa un `Predicate`, se evalúa cada elemento y se descartan los que no cumplan.  
El resultado es un nuevo stream con los elementos filtrados.

---

## Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
Primero se traen los últimos cambios del remoto.  
Luego se cambia a la rama `develop` y se actualiza.  
Después se crea la rama de la nueva funcionalidad y, si es necesario publicarla, se sube al remoto.

```bash
git fetch
git checkout develop
git pull
git checkout -b feature/nombre-de-tu-funcionalidad
git push -u origin feature/nombre-de-tu-funcionalidad
```

## ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?

- `git branch nombre-rama` únicamente crea la rama y mantiene la rama actual activa.  
- `git checkout -b nombre-rama` crea la nueva rama y cambia directamente a ella.  
- Con los comandos más recientes, `git switch -c nombre-rama` cumple la misma función que `checkout -b`.

## ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?

- Porque se mantiene la rama `main` estable y sin código incompleto.  
- Trabajar en una rama `feature/` permite aislar el desarrollo, evita interrumpir lo que ya funciona, facilita la revisión del código y simplifica revertir cambios si surge algún problema.  
- Además, encaja mejor con flujos de trabajo basados en *pull requests* e integración continua.