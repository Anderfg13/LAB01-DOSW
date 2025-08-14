Los comandos `git add` y `git commit -m "mensaje"` son fundamentales en Git y se usan para guardar cambios en tu repositorio. Aquí te explico para qué sirven y cómo se usan:
 
---
 
1. `git add`
¿Para qué sirve?
- Prepara los cambios (archivos nuevos, modificados o eliminados) para ser guardados en el próximo commit.
- Puedes agregar archivos específicos o todos los cambios a la vez.
 
 Modos de uso:
- Agregar un archivo específico:  
  ```bash
  git add nombre_archivo.txt
  ```
- Agregar todos los cambios en el directorio actual:  
  ```bash
  git add .
  ```
- Agregar solo archivos modificados (no nuevos):  
  ```bash
  git add -u
  ```
- Agregar interactivamente (elige qué cambios incluir):**  
  ```bash
  git add -p
  ```
 
---
 
2. `git commit -m "mensaje"`
¿Para qué sirve?
- Guarda los cambios preparados con `git add` en el historial del repositorio.
- El mensaje (`-m`) debe ser descriptivo para documentar qué cambios se hicieron.
 
Cómo usarlo:
```bash
git commit -m "Añade función de login básico"
```
- Si no usas `-m`, Git abrirá un editor (como Vim o Nano) para que escribas un mensaje más largo.
 
Ejemplo de flujo completo:
1. Modificas un archivo (`archivo.txt`).
2. Preparas el cambio con `git add`:
   ```bash
   git add archivo.txt
   ```
3. Confirmas el cambio con `git commit`:
   ```bash
   git commit -m "Corrige error en archivo.txt"
   ```
 

Parte 2 : Manejo conflictos
 Commit 2
 Christian Alfonso Romero Martinez
 Anderson Fabian Garcia Nieto