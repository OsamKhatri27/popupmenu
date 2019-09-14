package com.example.innu.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,button, Gravity.BOTTOM);
                Menu menu = popupMenu.getMenu();
                menu.add("Option 1");
                menu.add("Option 2");
                menu.add("Option 3");

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch(item.getTitle().toString())
                        {
                            case "Option 1":
                                Toast.makeText(MainActivity.this,"Option 1",Toast.LENGTH_LONG).show();
                                break;
                            case "Option 2":
                                Toast.makeText(MainActivity.this,"Option 2",Toast.LENGTH_LONG).show();
                                break;
                            case "Option 3":
                                Toast.makeText(MainActivity.this,"Option 3",Toast.LENGTH_LONG).show();
                                break;
                        }
                        return true;
                    }
                });

                popupMenu.show();
            }
        });

    }
}
