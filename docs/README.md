# Smart Alarm System

## Descripción del proyecto

Smart Alarm System es una aplicación desarrollada en Java que implementa la lógica interna de un despertador inteligente inspirado en aplicaciones modernas de smartphones.

El sistema permite gestionar alarmas múltiples, repeticiones semanales, perfiles de sonido y funcionalidades avanzadas como modo vacaciones, snooze y despertar circadiano.

El proyecto ha sido desarrollado sin interfaz gráfica, centrando el trabajo en el diseño orientado a objetos, la lógica de negocio y la documentación técnica.

---

# Objetivos

El proyecto busca:

- Aplicar programación orientada a objetos.
- Diseñar software modular y mantenible.
- Implementar lógica desacoplada de la interfaz.
- Utilizar Git y GitHub profesionalmente.
- Documentar técnicamente mediante UML y Markdown.
- Utilizar IA generativa de forma responsable.

---

# Tecnologías utilizadas

- Java
- Git
- GitHub
- Mermaid UML
- Markdown
- Visual Studio Code

---

# Instalación y ejecución

## Clonar repositorio

```bash
git clone https://github.com/pmsolano-cloud/smart-alarm.git
```

## Ejecutar proyecto

1. Abrir proyecto en IntelliJ o VS Code.
2. Ejecutar `Main.java`.

---

# Estructura del proyecto

```text
smart-alarm/
│
├── src/
│   ├── model/
│   ├── service/
│   ├── utils/
│   └── Main.java
│
├── docs/
│   ├── uml/
│   ├── use-cases/
│   ├── screenshots/
│   ├── ai-reflection.md
│   ├── technical-reflection.md
│   └── functional-analysis.md
│
├── tests/
│
├── README.md
└── .gitignore
```

---

# Funcionalidades implementadas

## Funcionalidades básicas

- Crear alarmas
- Eliminar alarmas
- Activar/desactivar alarmas
- Configuración de hora y etiqueta
- Repetición semanal
- Sonido personalizado
- Control de volumen
- Snooze
- Consulta de próximas alarmas

## Funcionalidades avanzadas

- Modo vacaciones
- Detección de conflictos entre alarmas
- Despertar circadiano progresivo
- Estadísticas de sueño
- Categorías de alarmas

---

# Diseño orientado a objetos

El sistema se ha dividido en modelos y servicios para desacoplar responsabilidades.

## Clases principales

### Alarm
Representa una alarma individual del sistema.

Responsabilidades:
- almacenar hora y configuración,
- activar/desactivar,
- controlar estado de reproducción.

### AlarmManager
Gestiona todas las alarmas del sistema.

Responsabilidades:
- añadir alarmas,
- eliminar alarmas,
- validar duplicados,
- consultar alarmas activas.

### RepeatPattern
Modela la repetición semanal usando `DayOfWeek`.

### SoundProfile
Encapsula sonido y volumen.

### SnoozeManager
Implementa la lógica de posposición de alarmas.

### Scheduler
Obtiene próximas alarmas activas ordenadas.

### ConflictDetector
Detecta alarmas demasiado cercanas temporalmente.

### VacationMode
Desactiva temporalmente todas las alarmas.

### SleepStatistics
Registra estadísticas de uso del sistema.

---

# Encapsulación y responsabilidades

Todos los atributos críticos se han declarado `private` para garantizar coherencia interna y evitar modificaciones externas no controladas.

Las operaciones públicas exponen únicamente el comportamiento necesario del sistema.

El proyecto intenta seguir principios SOLID básicos:
- responsabilidad única,
- bajo acoplamiento,
- modularidad.

---

# UML

## Diagrama de clases

El diagrama UML se encuentra en:

```text
/docs/uml/class-diagram.md
```

El diseño UML refleja:
- relaciones entre clases,
- encapsulación,
- composición,
- separación de responsabilidades.

## Diagrama de casos de uso

Disponible en:

```text
/docs/uml/use-case-diagram.md
```

Incluye:
- actores,
- relaciones,
- funcionalidades principales.

---

# Casos de uso

Las especificaciones completas se encuentran en:

```text
/docs/use-cases/
```

Cada caso de uso incluye:
- objetivo,
- actor principal,
- flujo principal,
- flujos alternativos,
- reglas de negocio,
- postcondiciones.

---

# Tests

El proyecto incluye pruebas básicas en:

```text
/tests/
```

Las pruebas validan:
- creación de alarmas,
- alarmas activas,
- repetición semanal,
- funcionamiento del sistema.

---

# Reflexión técnica

Durante el desarrollo surgieron problemas relacionados con:
- validación de duplicados,
- diseño de repetición semanal,
- separación de responsabilidades.

Se priorizó un diseño modular y mantenible frente a una implementación monolítica.

Mejoras futuras:
- persistencia en base de datos,
- interfaz gráfica,
- notificaciones reales.

---

# Uso de IA

Se utilizó IA generativa como apoyo para:
- generación inicial de clases,
- ayuda en UML,
- documentación,
- detección de errores.

Todo el código generado fue revisado y validado manualmente.

La reflexión completa sobre IA se encuentra en:

```text
/docs/ai-reflection.md
```

---

# Capturas

Las capturas del proyecto están disponibles en:

```text
/docs/screenshots/
```

Incluyen:
- ejecución del sistema,
- historial Git,
- ramas,
- diagramas UML,
- terminal funcionando.

---

# Autor

Pablo Manuel Solano Salinas