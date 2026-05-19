# Diagrama de casos de uso

```mermaid
flowchart LR

User --> CreateAlarm
User --> DeleteAlarm
User --> ActivateAlarm
User --> DeactivateAlarm
User --> SnoozeAlarm
User --> StopAlarm
User --> ConfigureSound
User --> EnableVacationMode
User --> ViewUpcomingAlarms
User --> EnableCircadianMode

SnoozeAlarm --> SleepStatistics
```