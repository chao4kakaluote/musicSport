package com.example.chao4kakaluote.musicsport.Activity;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.chao4kakaluote.musicsport.R;


public class MainActivity extends AppCompatActivity
{
    RadioGroup radioGroup;
    RadioButton localButton;
    RadioButton onLineButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRadioGroup();
    }
    public void initView()
    {
        radioGroup=(RadioGroup)findViewById(R.id.group);
        localButton=(RadioButton)findViewById(R.id.groupBtn1);
        onLineButton=(RadioButton)findViewById(R.id.groupBtn2);
    }
    public void initRadioGroup()
    {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkId)
            {
                int radioButton=radioGroup.getCheckedRadioButtonId();
                RadioButton btn=(RadioButton)findViewById(radioButton);
                String text=btn.getText().toString();
                if(text.equals("本地音乐"))
                {
                    setLocalList();
                    btn.setBackgroundResource(R.drawable.button_bg);

                }
                else
                {
                    RequestDownloadList();
                    btn.setBackgroundResource(R.drawable.button_bg);
                }
            }
        });
        radioGroup.check(radioGroup.getChildAt(0).getId());
    }
    public void setLocalList()
    {

    }
    public void RequestDownloadList()
    {

    }
}
