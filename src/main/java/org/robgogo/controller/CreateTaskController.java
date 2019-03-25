package org.robgogo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.robgogo.model.ToDo;
import org.robgogo.project.StageManager;
import org.robgogo.service.ToDoService;
import org.robgogo.view.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.Date;


@Controller
public class CreateTaskController {

    @FXML
    private TextField task;

    @FXML
    private DatePicker timeOfTask;

    @FXML
    private Button cancel;

    @FXML
    private Button saveTask;

    @Lazy
    @Autowired
    private StageManager stageManager;

    @Autowired
    private ToDoService toDoService;

    @FXML
    private void cancel(ActionEvent event){
        stageManager.switchScene(FxmlView.USER);
    }

    @FXML
    private void saveTask(ActionEvent event){
        ToDo toDo=new ToDo();
        toDo.setTask(getTask());
        toDo.setTimeOfTask(getTimeOfTask());
        toDoService.save(toDo);

        stageManager.switchScene(FxmlView.USER);
    }

    public String getTask() {
        return task.getText();
    }

    public LocalDate getTimeOfTask() {
        return timeOfTask.getValue();
    }

}
