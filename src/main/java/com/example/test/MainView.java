package com.example.test;

import com.example.test.entity.Value;
import com.example.test.repo.ValueRepo;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.List;


@Route("main")

public class MainView extends VerticalLayout {
    public ValueRepo valueRepo;

    public Value value;

    public MainView(ValueRepo repo) {
        this.valueRepo = repo;
        List<Value> valueList = valueRepo.findAll();
        value = valueList.get(0);
        TextField textField = new TextField();
        Button button = new Button("Hi");
        add(button);
        add(textField);
        button.addClickListener(buttonClickEvent -> value.setValue(value.getValue() + 1));
        button.addClickListener(buttonClickEvent -> textField.setValue(String.valueOf(value.getValue())));
        button.addClickListener(buttonClickEvent -> repo.save(value));
    }



}
