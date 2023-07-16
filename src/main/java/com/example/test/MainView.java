package com.example.test;

import com.example.test.entity.Value;
import com.example.test.repo.ValueRepo;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.List;
import java.util.Objects;


@Route("main")

public class MainView extends VerticalLayout {
    public ValueRepo valueRepo;

    public Value value;

    public MainView(ValueRepo repo) {
        this.valueRepo = repo;
        List<Value> valueList = this.valueRepo.findAll();
        if(valueList.isEmpty()){
            value = new Value();
            value.setValue(0);
        }
        else{
            value = valueList.get(0);
        }
        valueRepo.save(value);
        TextField textField = new TextField();
        textField.setRequired(true);
        Button button = new Button("PLUS ONE");
        add(button);
        add(textField);
        textField.setValue(String.valueOf(value.getValue()));
        button.addClickListener(buttonClickEvent -> {
            try {
                if(Objects.equals(textField.getValue(), "")){
                    value.setValue(0);
                }
                else if(!Integer.valueOf(textField.getValue()).equals(value.getValue())){
                    value.setValue(Integer.valueOf(textField.getValue()));
                }
                else{
                    value.setValue(value.getValue() + 1);
                }
                textField.setValue(String.valueOf(value.getValue()));
                repo.save(value);
            }
            catch (Exception e){
                textField.setValue("");
                textField.setPlaceholder("Error!");
                textField.setErrorMessage("You need to write digits only");
            }
        });
    }
}