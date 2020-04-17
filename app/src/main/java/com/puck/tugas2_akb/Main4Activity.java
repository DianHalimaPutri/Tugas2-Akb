package com.puck.tugas2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView view = (TextView)findViewById(R.id.Resend);
        String formattedText = "don't get a code ? <b>Resend</b>";
        // or getString(R.string.htmlFormattedText);
        view.setText(Html.fromHtml(formattedText));
    }
    public void send(View view) {
        Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(intent);
    }
}
