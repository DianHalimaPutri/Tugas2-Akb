package com.puck.tugas2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    EditText nama,email,phone,password,retype,home,local;
    RadioButton rbmale, rbfemale;
    Spinner blood,res,jb;
    CheckBox agr;
    Button rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.password1);
        retype = (EditText) findViewById(R.id.password2);
        home = (EditText) findViewById(R.id.addres);
        local = (EditText) findViewById(R.id.location);
        rbmale = (RadioButton) findViewById(R.id.male);
        rbfemale = (RadioButton) findViewById(R.id.female);
        blood = (Spinner) findViewById(R.id.spinner1);
        res = (Spinner) findViewById(R.id.spinner2);
        jb = (Spinner) findViewById(R.id.spinner3);
        agr = (CheckBox) findViewById(R.id.agree);
        rg = (Button) findViewById(R.id.regs);
    }
    public void Regs(View view){
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }

}