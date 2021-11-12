package com.example.th3_sagittarian.gatewayrail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Login extends AppCompatActivity {
    Button submit;
    EditText username, password;
    String u, p;
    ConnectionClass connectionClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        submit = (Button) findViewById(R.id.submit);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);




    }

    public void fun(View view)
        {
                /*Intent inn =  new Intent(Login.this, Selection.class);
                startActivity(inn);*/
            String uu, pp;
            uu = username.getText().toString();
            pp = password.getText().toString();

            if (uu == null && pp == null) {
                Toast.makeText(Login.this, "INCORRECT PASSSWORD OR USERNAME", Toast.LENGTH_SHORT).show();

            } else {

                try {
                    Connection con = connectionClass.CONN();
                    if (con == null) {
                        Toast.makeText(Login.this, "check conection", Toast.LENGTH_SHORT).show();
                    } else {
                        String query = " select * from login where id='" + uu + "'" +
                                " and password = '" + pp + "'";

                        Statement stmt = con.createStatement();
                        // stmt.executeUpdate(query);


                        ResultSet rs = stmt.executeQuery(query);

                        while (rs.next())

                        {
                            u = rs.getString(1);
                            p = rs.getString(2);
                            if (u.equals(uu) && p.equals(pp)) {

                                Intent ino = new Intent(Login.this, Selection.class);
                                startActivity(ino);

                            } else {
                                Toast.makeText(Login.this, "Something Wrong Happened", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                } catch (Exception e) {

                }


            }

    }
}