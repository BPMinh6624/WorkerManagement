/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import Model.History;
import Model.Worker;
import Repository.WorkerRepository;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author tuanh
 */
public class WorkerManagement extends Menu<String> {

    ArrayList<Worker> lw = new ArrayList<>();
    ArrayList<History> lh = new ArrayList<>();

    static String[] mc = {"Add a worker", "Increase salary for workers",
        "Decrease salary for workers", "Show adjusted salary worker information", "Exit"};

    protected Library library;
    WorkerRepository program;

    public WorkerManagement() {
        super("MANAGE WORKER", mc);
        library = new Library();
        program = new WorkerRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.addWorker(lw);
                break;
            case 2:
                program.changeSalary(lw, lh, 1);
                break;
            case 3:
                program.changeSalary(lw, lh, 2);
                break;
            case 4:
                program.printListHistory(lh);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
