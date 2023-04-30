package kz.bitlab.techorda.db;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Tasks> tasks = new ArrayList<>();

    private static long id = 6;



    static {
        tasks.add(
                new Tasks(1,
                        "Create Web application in Java EE",
                        "Create Web very good tasks for yourself",
                        "23.10.2021")
        );
        tasks.add(
                new Tasks(2,
                        "Clean house and buy groceries",
                        "Vacuum clean, mop the floors, go to Magnum - take bags",
                        "25.10.2021")
        );
        tasks.add(
                new Tasks(3,
                        "Do all homeworks",
                        "all homeworks po fizike i po bitlab",
                        "28.10.2021")
        );
        tasks.add(
                new Tasks(4,
                        "Go To Gum",
                        "5 podxodov po 12 raz Pushups",
                        "12.12.2021")
        );
        tasks.add(
                new Tasks(5,
                        "Uchit Italy yazyk",
                        "Verify the tasks, upload link to portal, inform the tutor",
                        "01.05.21")
        );
    }


    public static ArrayList<Tasks> getTasks() {
        return tasks;
    }

    public static void addTask(Tasks newTask){
        newTask.setId(id);
        tasks.add(newTask);
        id++;
    }

    public static Tasks getTask (long id) {
        return tasks
                .stream()
                .filter(item -> item.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public static void uodateTask(Tasks item) {
        for(int i=0;i<tasks.size();i++) {
            if (tasks.get(i).getId() == item.getId()) {
                tasks.set(i, item);
                break;
            }
        }
    }

    public static void deleteTask(long id){
        for(int i=0;i< tasks.size();i++){
            if(tasks.get(i).getId()==id){
                tasks.remove(i);
                break;
            }
        }
    }
}
