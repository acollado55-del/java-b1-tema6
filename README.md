# Tema 6. Colecciones

En esta sección encontrarás una serie de ejercicios diseñados para reforzar los conceptos fundamentales del framework de colecciones de Java (interfaces Collection, List, Set, Queue y Map), así como su sintaxis de uso. Practicarás operaciones básicas (add, remove, contains, get, put, peek, poll) y compararás implementaciones como ArrayList, LinkedList, HashSet,TreeSet, LinkedHashSet, PriorityQueue, ArrayDeque, HashMap, LinkedHashMap y TreeMap

## Objetivos

- Comprender los principios básicos de las colecciones en Java y qué problemas resuelven.
- Familiarizarse con la sintaxis esencial para declarar y usar colecciones genéricas, recorrerlas con Iterator y for-each, y aplicar sus métodos más comunes.
- Practicar la escritura y completado de fragmentos de código con las implementaciones estándar (ArrayList, LinkedList, HashSet, TreeSet, LinkedHashSet, PriorityQueue, ArrayDeque, HashMap/LinkedHashMap/TreeMap).

## Cómo trabajar en estos ejercicios

Cada ejercicio presenta un fragmento de código incompleto o con partes faltantes que deberás completar para que el programa funcione correctamente. Estos ejercicios te ayudarán a:

- Reconocer la estructura general de un programa Java que usa colecciones genéricas.
- Identificar y utilizar correctamente iteradores y el bucle for-each, junto con métodos esenciales de colecciones y mapas.
- Aplicar reglas básicas de sintaxis para crear, recorrer y manipular listas, conjuntos, colas y mapas de forma segura.

Recuerda que puedes probar tu código compilándolo y ejecutándolo para verificar que las soluciones sean correctas.


## 📝 Enunciados

Los ejercicios los encontrarás organizados por carpetas. Cada ejercicio se presentará como un proyecto maven, que incluirá un comentario con el enunciado del ejercicio. 

Además, cada ejercicio irá acompañado de uno o varios tests para comprobar que tu solución es correcta. 

Cuando hayas propuesto una implementación para la función, ejecuta los tests para ver si tu solución es correcta. Si no pasa los tests, vuelve a intentarlo revisando los errores que te comentan los tests.

Una vez termines el ejercicio, deberás enviar tus cambios para que se registren en la plataforma y que puedan ser corregidos por tu profesor. 

Si tienes alguna duda sobre cómo ejecutar los tests o cómo enviar los cambios a GitHub, consulta el Tema 0.

## 💻 Comandos
En la siguiente sección se presentan algunos comandos útiles para el desarrollo de la actividad. 

### Git

Con el fin de actualizar los repositorios locales con la última versión de código fuente, ejecute:

```bash
git pull
```

Para agregar los cambios realizados en los archivos, ejecute:

```bash
git add .
```

Para añadir un mensaje a los cambios realizados localmente, ejecute:

```bash
git commit -m "Mensaje"
```

Para sincronizar nuestras modificaciones con el repositorio remoto, ejecute:
```bash
git push
```

### Pruevas unitarias

Para ejecutar las pruebas unitarias:
```bash
mvn test 
```
