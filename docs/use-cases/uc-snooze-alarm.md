# Caso de uso: Snooze de alarma

## Nombre
Snooze de alarma

## Objetivo
Posponer temporalmente una alarma activa.

## Actor principal
Usuario

## Precondiciones
- Existe una alarma sonando
- La alarma está activa

## Flujo principal
1. La alarma suena.
2. El usuario selecciona "snooze".
3. El sistema detiene temporalmente la alarma.
4. Se reprograma la alarma 5 minutos después.

## Flujos alternativos
- A1: Alarma ya detenida
  - El sistema no permite snooze.

## Postcondiciones
- La alarma queda reprogramada.

## Reglas de negocio
- El snooze añade exactamente 5 minutos.
- Se registran estadísticas de snooze.