# Curso Desarrollo de Aplicaciones Móviles Android 2024
Evaluación Final del Modulo 4 - Desarrollo de la Interfaz de Usuario Android

## Requerimientos
1. Crear o utilizar algún proyecto existente con Android Studio, para luego crear repositorio en GitHub.

2. Inicializar el sistema de control de versiones con Git, para después agregar y confirmar los cambios.

3. Configurar el remoto y empujar los cambios si IDE ya tiene la configuración de GitHub, en caso contrario, agregar el token necesario.

4. Crear la rama feature1, para luego hacer un cambio en un archivo de la rama feature1, guardar los cambios (commit), y empujar la rama feature1 al remoto.

5. Crear PR para mezclar los cambios de feature1 a master (desde Android Studio o desde consola).

6. Aceptar el PR y hacer el merge. (opcional)

### Lista de comandos utilizados
Revisar por primera vez las ramas creadas que tiene el proyecto.
````
git branch
````

Crear una nueva rama que se llamara feature1.
````
git branch feature1
````

Volver a revisar si aparece tanto la rama main como la nueva rama recién creada.
````
git branch
````

Moverse hacia la rama feature1.
````
git checkout feature1
````

Crear un mensaje utilizando un Toast, cambiar los colores de fondos en los títulos, y centrar los textos de las etiquetas TextView.

Agregar los cambios realizados al historial de git.
````
git add .
````

Agregar un commit que describa los cambios que se hicieron.
````
git commit -m "Se agrega un Toast de bienvenida y se cambia el color de fondo de los titulos"
````

Subir los cambios a GitHub junto con la nueva rama creada.
````
git push --set-upstream origin feature1
````

Ya que el repositorio es mío y el desafío es individual, no se podrán ejecutar Pull Request por lo que solo se hará un Pull para fusionar ambas ramas.

Volver a la rama main
````
git checkout main
````

Utilizar un pull seguido del nombre de la nueva rama, para fusionar los cambios.
````
git pull origin feature1
````

Subir los nuevos cambios al repositorio en GitHub
````
git push
````
