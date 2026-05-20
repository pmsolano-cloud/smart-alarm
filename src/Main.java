import model.*;
import service.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final Scanner scanner =
            new Scanner(System.in);

    public static void main(String[] args) {

        AlarmManager manager =
                new AlarmManager();

        boolean running = true;

        while (running){

            System.out.println("\n===== SMART ALARM =====");
            System.out.println("1. Crear alarma");
            System.out.println("2. Mostrar alarmas");
            System.out.println("3. Eliminar alarma");
            System.out.println("4. Activar modo vacaciones");
            System.out.println("5. Ver próximas alarmas");
            System.out.println("6. Salir");

            System.out.print("Seleccione opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){

                case 1 -> createAlarm(manager);

                case 2 -> showAlarms(manager);

                case 3 -> deleteAlarm(manager);

                case 4 -> activateVacationMode(manager);

                case 5 -> showUpcoming(manager);

                case 6 -> {
                    running = false;
                    System.out.println("Saliendo...");
                }

                default ->
                        System.out.println("Opción inválida");
            }
        }
    }

    private static void createAlarm(
            AlarmManager manager
    ){

        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.print("Hora: ");
        int hour = scanner.nextInt();

        System.out.print("Minuto: ");
        int minute = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Etiqueta: ");
        String label = scanner.nextLine();

        Alarm alarm = new Alarm(
                id,
                LocalTime.of(hour, minute),
                label,
                RepeatPattern.everyDay(),
                new SoundProfile("Default", 70),
                AlarmCategory.PERSONAL
        );

        manager.addAlarm(alarm);

        System.out.println("Alarma creada correctamente");
    }

    private static void showAlarms(
            AlarmManager manager
    ){

        manager.getAlarms()
                .forEach(System.out::println);
    }

    private static void deleteAlarm(
            AlarmManager manager
    ){

        System.out.print("ID alarma a eliminar: ");

        int id = scanner.nextInt();

        manager.removeAlarm(id);

        System.out.println("Alarma eliminada");
    }

    private static void activateVacationMode(
            AlarmManager manager
    ){

        VacationMode vacationMode =
                new VacationMode();

        vacationMode.activate(manager);

        System.out.println(
                "Modo vacaciones activado"
        );
    }

    private static void showUpcoming(
            AlarmManager manager
    ){

        Scheduler scheduler =
                new Scheduler();

        scheduler.getUpcomingAlarms(
                manager.getAlarms()
        ).forEach(System.out::println);
    }
}