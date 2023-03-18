package com.application.switchbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ToggleButton btn_open;
    private Switch swh_status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_open=findViewById(R.id.open);
        swh_status=findViewById(R.id.switch_status);
        btn_open.setOnCheckedChangeListener(this);
        swh_status.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            switch (compoundButton.getId()){
                case R.id.open:
                    if (compoundButton.isChecked()){
                        Toast.makeText(this,
                                "打开声音",
                                Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(this,
                                "打开声音",
                                Toast.LENGTH_SHORT
                        ).show();
                        break;
                    }
                case R.id.switch_status:
                    if (compoundButton.isChecked()){
                        Toast.makeText(this,
                                "打开:ON",
                                Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(this,
                                "关闭：OFF",
                                Toast.LENGTH_SHORT).show();
                    }
            }
    }
}