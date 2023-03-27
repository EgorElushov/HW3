package main;

import java.time.LocalDateTime;
import java.util.List;

public class FoodAgent {
    public int proc_id;
    public int ord_dish;
    public LocalDateTime proc_started;
    public LocalDateTime proc_ended;
    public boolean proc_active;
    public List<Operation> proc_operations;

    public void action() {

    }
}