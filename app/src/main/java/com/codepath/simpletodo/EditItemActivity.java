package com.codepath.simpletodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String todo = getIntent().getStringExtra("todo");
        EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
        etNewItem.setText(todo);
    }

    public void save(View v) {
        this.finish();
    }
}
