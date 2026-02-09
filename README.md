- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- ITERADORES
Ordenación de Objetos Estudiante
Programa que demuestra el uso de comparadores avanzados para organizar listas de objetos personalizados en Java.

🚀 Funcionalidades
- Carga Masiva de Datos: Inicializa una lista de objetos Estudiante con múltiples atributos (nombre, apellido y edad).
- Ordenamiento Alfabético: Clasifica a los alumnos por su apellido de forma ascendente.
- Ordenamiento Inverso: Organiza la lista por edad de mayor a menor.
- Criterios Multi-nivel: Implementa ordenamiento compuesto (primero por edad y, en caso de empate, por apellido) aplicando lógica inversa.

🛠️ Estructura técnica
- Hace uso intensivo de la API de Streams y Comparators de Java:
- Comparator.comparing(): Para definir la clave de ordenación principal.
- .reversed(): Para invertir el orden natural.
- .thenComparing(): Para encadenar criterios de ordenación secundarios.
