# Caso de uso: Eliminar alarma

## Nombre
Eliminar alarma

## Objetivo
Eliminar una alarma existente del sistema.

## Actor principal
Usuario

## Precondiciones
- Existe al menos una alarma

## Flujo principal
1. El usuario selecciona una alarma.
2. Solicita eliminación.
3. El sistema elimina la alarma.
4. Se actualiza la lista de alarmas.

## Flujos alternativos
- A1: ID inexistente
  - El sistema muestra error.

## Postcondiciones
- La alarma ya no existe en el sistema.

## Reglas de negocio
- La eliminación es permanente.