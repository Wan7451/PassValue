package com.wan7451.passvalueproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wan7451.passvalueproject.fun.FunctionManager;
import com.wan7451.passvalueproject.fun.FunctionParamsResult;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Description:
 * Blog: www.jianshu.com/u/1f69adf1da84
 *
 * @Data: 2019/2/22
 * @Author: wan7451
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FunctionManager.init().addFunction(this, new FunctionParamsResult<String, String>("aaaa") {
            @Override
            public String invoke(String s) {
                return s;
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), SecondActivity.class));
            }
        });

    }
}
