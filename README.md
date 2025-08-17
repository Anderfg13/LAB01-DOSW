<div align="center">
  <img src="https://img.shields.io/badge/Universidad-Nacional%20de%20Colombia-green" alt="UNAL" />
</div>

# 💻 Práctica Git: Comandos Básicos

---

## 👥 Integrantes

| Nombre                                 |
|-----------------------------------------|
| Christian Alfonso Romero Martínez       |
| Anderson Fabián García Nieto            |

---

## 📖 Descripción

Este repositorio contiene la práctica de comandos básicos de Git, incluyendo ejemplos, flujo de trabajo y evidencia fotográfica del proceso realizado tanto en terminal como en GitHub Desktop.

---

## 📌 Respuestas

### 🧠 Pregunta 3
**¿Para qué sirven y cómo se usan los comandos `git add` y `git commit -m "mensaje"`?**

Los comandos `git add` y `git commit -m "mensaje"` son fundamentales en Git. Se utilizan para guardar los cambios realizados en el repositorio local. A continuación se explica su propósito y uso:

---

### 🟢 `git add`

**¿Para qué sirve?**

- Prepara los cambios (archivos nuevos, modificados o eliminados) para ser incluidos en el próximo commit.
- Puedes agregar archivos individuales o todos los cambios a la vez.

**Modos de uso:**

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
- Agregar interactivamente (te permite elegir qué cambios incluir):
  ```bash
  git add -p
  ```

---

### 🔵 `git commit -m "mensaje"`

**¿Para qué sirve?**

- Guarda los cambios preparados con `git add` en el historial del repositorio.
- El mensaje (`-m`) debe ser claro y descriptivo, explicando los cambios realizados.

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

---

## 🛠️ Resolución de Errores

Durante la colaboración, se presentó el siguiente mensaje de error al intentar hacer push:

```text
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 16 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 393 bytes | 196.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Anderfg13/LAB01-DOSW.git
 ! [remote rejected] main -> main (cannot lock ref 'refs/heads/main': is at 0ad956f98beb9d5bf3325278c898a566087e5f11 but expected 6edba0e8542aa7cfaaa224e32e4f128765ef0572)
error: failed to push some refs to 'https://github.com/Anderfg13/LAB01-DOSW.git'
```

**Solución aplicada:**

Se resolvió deshaciendo el commit que no fue admitido y repitiendo el proceso correctamente.

---

## 🚩 Creación de Ramas y Pull Request

Se creó la rama `feature/ChristianRomero` para la gestión de cambios y la posterior realización de un Pull Request.

---

## 🖼️ Evidencia Fotográfica del Proceso

A continuación se presenta una galería de imágenes que evidencian el uso de comandos en Git Bash y GitHub Desktop durante la práctica:

<div align="center">

| Evidencia | Imagen |
|-----------|--------|
| 1 | ![](pictures/image.png) |
| 2 | ![](pictures/image%20(1).png) |
| 3 | ![](pictures/image%20(2).png) |
| 4 | ![](pictures/image%20(3).png) |
| 5 | ![](pictures/image%20(4).png) |
| 6 | ![](pictures/image%20(5).png) |
| 7 | ![](pictures/image%20(6).png) |
| 8 | ![](pictures/image%20(7).png) |
| 9 | ![](pictures/image%20(8).png) |
| 10 | ![](pictures/image%20(9).png) |
| 11 | ![](pictures/image%20(10).png) |
| 12 | ![](pictures/image%20(11).png) |
| 13 | ![](pictures/imagen%20(2).png) |
| 14 | ![](pictures/imagen%20(3).png) |
| 15 | ![](pictures/imagen%20(4).png) |
| 16 | ![](pictures/imagen%20(5).png) |
| 17 | ![](pictures/imagen%20(6).png) |

</div>

---

<div align="center">
  <sub>Universidad Nacional de Colombia - Facultad de Ingeniería - 2025</sub>
</div>
