package com.oop.mahadi.demo6midexam;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;



    @FXML
    private CheckBox cha1;

    @FXML
    private CheckBox cha2;

    @FXML
    private CheckBox cha3;

    @FXML
    private CheckBox cha4;

    @FXML
    private ComboBox<Integer> com1;

    @FXML
    private ComboBox<String> com2;

    @FXML
    private ComboBox<String> com3;

    @FXML
    private Label name;

    @FXML
    private Label payment;

    @FXML
    private TableColumn<Demotable, String> c1;

    @FXML
    private TableColumn<Demotable, String> c10;

    @FXML
    private TableColumn<Demotable, String> c11;

    @FXML
    private TableColumn<Demotable, String> c2;

    @FXML
    private TableColumn<Demotable, String> c3;

    @FXML
    private TableColumn<Demotable, String> c4;

    @FXML
    private TableColumn<Demotable, String> c5;

    @FXML
    private TableColumn<Demotable, String> c6;

    @FXML
    private TableColumn<Demotable, String> c7;

    @FXML
    private TableColumn<Demotable, String> c8;

    @FXML
    private TableColumn<Demotable, String> c9;
    @FXML
    private TableView<Demotable> tableView;

    @FXML
    private TextArea textarea;

    @FXML
    private Label uniName;

    @FXML
    void Add(ActionEvent event) {

        ArrayList<String> ar=new ArrayList<>();

        if(cha1.isSelected()){
            ar.add("t1");


        }
        if(cha2.isSelected()){
            ar.add("t2");


        }
        if(cha3.isSelected()){
            ar.add("t3");


        }
        if(cha4.isSelected()){
            ar.add("t4");


        }
        if (traineearr1.isEmpty()){
            traineearr1.add(new Trainee(com1.getValue(),ar));
            return;
        }
        for(Trainee t:traineearr1){
            if (t.getId()==com1.getValue()){
                showAlert("alredy exist os ","add in the existing tainee taining list");
                for(String a:ar){
                    t.getTrainingTaitels().add(a);


                }



            }
        }
    }

    @FXML
    void Ser(ActionEvent event) {
        Integer c=0;
        for (Trainee t:traineearr1){

            if ((com2.getValue().equals(hs.get(t.getId()).getUniname()))&&(
                    (com3.getValue().equals(hs.get(t.getId()).getPaymentstatus()))

                    )){
                c+=1;




            }

        }
        textarea.setText("Nuimber of "+com1.getValue()+"interm"+com2.getValue()+"selected for training is "+c);

    }

    @FXML
    void Show(ActionEvent event) {
        tableView.getItems().clear();

        String x="";
        for(Trainee t:traineearr1){

            tableView.getItems().add(new Demotable(
                    t.getId()+ "",hs.get(t.getId()).getUniname()+"",hs.get(t.getId()).getInternName()+"",hs.get(t.getId()).getPaymentstatus()+"",
                    t.getTrainingTaitels()+ "",t.getTrainingTaitels().size()+"",x+"",
                    x+ "",x+"",x+"",
                    x+ ""


            ));


        }


    }

    @FXML
    void com1(ActionEvent event) {

        for(Intern i:inarr1){
            name.setText(i.getInternName());
            uniName.setText(i.getUniname());
            payment.setText(i.getPaymentstatus());



        }
    }
    private void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();

    }

    ArrayList<Intern> inarr1=new ArrayList<>();
    ArrayList<Intern> inarr2=new ArrayList<>();
    ArrayList<Intern> inarr3=new ArrayList<>();
    ArrayList<Trainee> traineearr1=new ArrayList<>();
    ArrayList<Trainee> traineearr2=new ArrayList<>();
    ArrayList<Trainee> traineearr3=new ArrayList<>();
    HashMap<Integer,Intern> hs=new HashMap<>();
    @FXML
    void initialize() {
inarr1.add(new Intern(1212,"rtghret","IUB","paid"));
        inarr1.add(new Intern(1212,"rtgrbhrhret","IUB1","notpaid"));
        inarr1.add(new Intern(121452,"rtghrrwtet","IUB","paid"));
        inarr1.add(new Intern(14545212,"rtgrthhret","IUB2","paid"));
        inarr1.add(new Intern(124545412,"rtrthrghret","IUB","notpaid"));
        inarr1.add(new Intern(12343412,"rtghrthret","IUB2","paid"));
        inarr1.add(new Intern(12133442,"rtgthhret","IUB","paid"));
        inarr1.add(new Intern(12454512,"rtgthhret","IUB2","notpaid"));
        inarr1.add(new Intern(1265712,"rtghrhet","IUB1","paid"));
        inarr1.add(new Intern(12674512,"rtghrthet","IUB","paid"));
        inarr1.add(new Intern(1346534612,"rtghrhret","IUB1","notpaid"));
for(Intern i:inarr1){
    com1.getItems().add(i.getId());
    hs.put(i.getId(),i);
    com2.getItems().add(i.getUniname());
    com3.getItems().add(i.getPaymentstatus());

}
        c1.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C1"));
        c2.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C2"));
        c3.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C3"));
        c4.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C4"));
        c5.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C5"));
        c6.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C6"));
        c7.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C7"));
        c8.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C8"));
        c9.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C9"));
        c10.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C10"));
        c11.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C11"));

    }




}
