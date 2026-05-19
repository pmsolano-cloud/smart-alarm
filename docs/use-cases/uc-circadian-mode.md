# Caso de uso: Despertar circadiano

## Nombre
Despertar circadiano progresivo

## Objetivo
Aumentar progresivamente el volumen antes de despertar.

## Actor principal
Usuario

## Precondiciones
- La alarma está activa
- El modo circadiano está habilitado

## Flujo principal
1. Se activa la alarma.
2. El sistema inicia volumen bajo.
3. El volumen aumenta progresivamente.
4. Se alcanza el volumen objetivo.
5. La alarma se reproduce completamente.

## Flujos alternativos
- A1: Usuario desactiva modo
  - Se usa volumen normal.

## Postcondiciones
- El usuario es despertado gradualmente.

## Reglas de negocio
- El volumen no puede superar 100.
- El incremento debe ser progresivo.