package edu.wpi.teamname.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {

  @FXML private Button btnadd;
  @FXML private Button btnsubtract;
  @FXML private Button btnmultiply;
  @FXML private Button btndivide;
  @FXML private Button btnexp;
  @FXML private Button btnmod;
  @FXML private Button btnclear;
  @FXML private TextField txtnum1;
  @FXML private TextField txtnum2;
  @FXML private Label lblanswer;

  @Override
  public void initialize(URL location, ResourceBundle resources) {}

  public void handleButtonAction(ActionEvent e) {
    if (e.getSource() == btnclear) {
      txtnum1.setText("");
      txtnum2.setText("");
      lblanswer.setText("?");
      txtnum1.requestFocus();
      return;
    }
    double num1 = Double.parseDouble(txtnum1.getText());
    double num2 = Double.parseDouble(txtnum2.getText());
    char symbol;
    double answer;
    if (e.getSource() == btnadd) {
      symbol = '+';
      answer = num1 + num2;
    } else if (e.getSource() == btnsubtract) {
      symbol = '-';
      answer = num1 - num2;
    } else if (e.getSource() == btnmultiply) {
      symbol = 'x';
      answer = num1 * num2;
    } else if (e.getSource() == btndivide) {
      symbol = '/';
      answer = num1 / num2;
    } else if (e.getSource() == btnexp) {
      symbol = '^';
      answer = Math.pow(num1, num2);
    } else {
      symbol = '%';
      answer = num1 % num2;
    }
    lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
  }
}
