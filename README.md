
# 💻 Práctica Git: Comandos Básicos

## 👥 Integrantes

- **Christian Alfonso Romero Martínez**  
- **Anderson Fabián García Nieto**

---

## 📌 Respuestas

### 🧠 Pregunta 3:  
**¿Para qué sirven y cómo se usan los comandos `git add` y `git commit -m "mensaje"`?**

Los comandos `git add` y `git commit -m "mensaje"` son fundamentales en Git. Se utilizan para guardar los cambios realizados en el repositorio local. A continuación se explica su propósito y uso.

---

### 🟢 `git add`

**¿Para qué sirve?**

- Prepara los cambios (archivos nuevos, modificados o eliminados) para ser incluidos en el próximo commit.
- Puedes agregar archivos individuales o todos los cambios a la vez.

**Modos de uso:**

- Agregar un archivo específico:  
  ```bash
  git add nombre_archivo.txt
````

* Agregar todos los cambios en el directorio actual:

  ```bash
  git add .
  ```

* Agregar solo archivos modificados (no nuevos):

  ```bash
  git add -u
  ```

* Agregar interactivamente (te permite elegir qué cambios incluir):

  ```bash
  git add -p
  ```

---

### 🔵 `git commit -m "mensaje"`

**¿Para qué sirve?**

* Guarda los cambios preparados con `git add` en el historial del repositorio.
* El mensaje (`-m`) debe ser claro y descriptivo, explicando los cambios realizados.

**Cómo se usa:**

```bash
git commit -m "Añade función de login básico"
```

> 💡 Si no usas la opción `-m`, Git abrirá un editor (como Vim o Nano) para que escribas un mensaje más largo.

---

### 🧩 Ejemplo de flujo completo

1. Modificas un archivo (`archivo.txt`).
2. Preparas el cambio con `git add`:

   ```bash
   git add archivo.txt
   ```
3. Confirmas el cambio con `git commit`:

   ```bash
   git commit -m "Corrige error en archivo.txt"
   ```


