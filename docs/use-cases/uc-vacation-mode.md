# Caso de uso: Modo vacaciones

## Nombre
Modo vacaciones

## Objetivo
Desactivar temporalmente todas las alarmas.

## Actor principal
Usuario

## Precondiciones
- Existen alarmas creadas

## Flujo principal
1. El usuario activa modo vacaciones.
2. El sistema recorre todas las alarmas.
3. Se desactivan todas las alarmas.
4. El sistema confirma activación del modo.

## Flujos alternativos
- A1: No hay alarmas
  - El sistema activa el modo sin cambios.

## Postcondiciones
- Todas las alarmas quedan desactivadas.

## Reglas de negocio
- El modo vacaciones no elimina alarmas, solo las desactiva.