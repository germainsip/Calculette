package org.afpa.gui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class CalcuController implements Initializable {
    public Button huit;
    public Button neuf;
    public Button quatre;
    public Button cinq;
    public Button un;
    public Button deux;
    public Button trois;
    public Button zero;
    public Button egal;
    public Button sept;
    public Button raz;
    public TextArea affichage;
    public Button six;

    int res = 0;

    public void addHandle(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        if (affichage.getText().equals("")) {
            affichage.appendText("     " + btn.getText());
        } else {
            affichage.appendText("\n + " + btn.getText());
        }
        res += Integer.parseInt(btn.getText());
        System.out.println(res);
    }

    public void razHandle(ActionEvent actionEvent) {
        res = 0;
        affichage.clear();

    }

    public void resultHandle(ActionEvent actionEvent) {
        affichage.appendText("\n ______ \n     " + res);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       affichage.textProperty().addListener((observable, oldValue, newValue) -> affichage.setScrollTop(Double.MAX_VALUE));
    }


}
