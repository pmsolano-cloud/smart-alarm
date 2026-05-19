# Caso de uso: Crear alarma

## Nombre
Crear alarma

## Objetivo
Permitir al usuario crear una nueva alarma con hora, etiqueta, repetición, sonido y categoría.

## Actor principal
Usuario

## Precondiciones
- El sistema está iniciado
- El usuario tiene acceso al gestor de alarmas

## Flujo principal
1. El usuario solicita crear una alarma.
2. Introduce la hora y minutos.
3. Introduce una etiqueta.
4. Selecciona repetición semanal.
5. Selecciona sonido y volumen.
6. Selecciona categoría.
7. El sistema valida que no exista duplicidad.
8. La alarma se guarda correctamente.

## Flujos alternativos
- A1: Alarma duplicada
  - El sistema rechaza la creación.
  - Muestra mensaje de error.

## Postcondiciones
- La alarma queda almacenada y activa.

## Reglas de negocio
- No pueden existir alarmas duplicadas (misma hora + etiqueta).
- El volumen debe estar entre 0 y 100.
- Toda alarma debe tener categoría obligatoria.