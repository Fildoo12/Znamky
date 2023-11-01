package com.spsmb.picek.znamky;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ChoiceBox<String> studentInput;

    @FXML
    private ChoiceBox<String> text1;

    @FXML
    private TextField inputNumber;

    @FXML
    private TextField text2;

    @FXML
    private Button submit;

    @FXML
    protected void onSubmitButtonClick() {
        List<Integer> list = new ArrayList<>();
        String[] marks = inputNumber.getText().split(",");
        for (int i = 0; i < marks.length; i++) {
            int value = Integer.parseInt(marks[i]);
            list.add(value);
        }
        System.out.println(list);
        double diameter = Subject.diameter(list);

        text2.setText("Průměr" + diameter);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (studentInput.getItems().isEmpty()) {
            studentInput.getItems().add("Adam Brázda");
            studentInput.getItems().add("Štěpan Tomsa");
            studentInput.getItems().add("Oyui Chen");
            studentInput.getItems().add("Alex Novák");
            studentInput.getItems().add("Igor Hnízdo");
        }
        if (text1.getItems().isEmpty()) {
            text1.getItems().add("Matematika");
            text1.getItems().add("Angličtina");
            text1.getItems().add("Čeština");
            text1.getItems().add("Fyzika");
            text1.getItems().add("Přírodopis");
            text1.getItems().add("Dějepis");
        }

    }


}