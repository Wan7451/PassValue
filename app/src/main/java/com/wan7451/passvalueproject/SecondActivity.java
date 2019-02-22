package com.wan7451.passvalueproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wan7451.passvalueproject.fun.FunctionManager;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Description:
 * Blog: www.jianshu.com/u/1f69adf1da84
 *
 * @Data: 2019/2/22
 * @Author: wan7451
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa = FunctionManager.init().invokeParamsResult("aaaa", "params");
                Toast.makeText(getBaseContext(), aa, Toast.LENGTH_SHORT).show();
            }
        });

//        FunctionManager.init().remove("方法名");
    }
}
