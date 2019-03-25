package org.robgogo.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Todo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false)
    private int id;
    private String task;
    private LocalDate timeOfTask;

    public ToDo(){}
    public ToDo(String task, LocalDate timeOfTask) {
        this.task = task;
        this.timeOfTask = timeOfTask;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getTimeOfTask() {
        return timeOfTask;
    }

    public void setTimeOfTask(LocalDate timeOfTask) {
        this.timeOfTask = timeOfTask;
    }
}
