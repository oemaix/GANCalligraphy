package com.barackbao.aicalligraphy.activity.guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.barackbao.aicalligraphy.R;
import com.barackbao.aicalligraphy.network.RequestCenter;
import com.barackbao.baselib.okhttp.listener.DisposeDataListener;
import com.barackbao.baselib.okhttp.request.RequestParams;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private TextView mToolbarTitleTv;
    private EditText usernameEdt;
    private EditText passwordEdt;
    private EditText passwordAgainEdt;
    private Button registeredBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mToolbar = findViewById(R.id.toolbar);
        mToolbarTitleTv = findViewById(R.id.toolbar_title_tv);

        if (null != mToolbar) {
            setSupportActionBar(mToolbar);
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (null != mToolbarTitleTv) {
            getActionBar().setDisplayShowTitleEnabled(false);
        }

        initView();
    }

    private void initView() {
        usernameEdt = findViewById(R.id.username_edt);
        passwordEdt = findViewById(R.id.password_edt);
        passwordAgainEdt = findViewById(R.id.password_again_edt);
        registeredBtn = findViewById(R.id.registered_btn);
//        registeredBtn.setOnClickListener(this);
    }
/*
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.registered_btn:
                String username = usernameEdt.getText().toString().trim();
                String password = passwordEdt.getText().toString().trim();
                String password_again = passwordAgainEdt.getText().toString().trim();
                //判空
                if (!TextUtils.isEmpty(username) & !TextUtils.isEmpty(password)
                        & !TextUtils.isEmpty(password_again) ) {
                    //判断两次输入的密码是否一致
                    if (!password.equals(password_again)) {
                        Toast.makeText(this, "两次输入的密码不一致，请重新输入", Toast.LENGTH_SHORT).show();
                        passwordEdt.setText("");
                        passwordAgainEdt.setText("");
                    } else {

                        Map<String, String> map = new HashMap<>();
                        map.put("account",username );
                        map.put("password", password);
                        map.put("age", )
                        RequestParams params = new RequestParams()
                        RequestCenter.register(new DisposeDataListener() {
                            @Override
                            public void onSuccess(Object responseObj) {

                            }

                            @Override
                            public void onFailure(Object responseObj) {

                            }
                        }, );
                        BmobUser user = new BmobUser();
                        user.setUsername(username);
                        user.setPassword(password);
                        user.setEmail(email);
                        user.signUp(new SaveListener<BmobUser>() {
                            @Override
                            public void done(BmobUser bmobUser, BmobException e) {
                                if (e == null) {
                                    Toast.makeText(RegisteredActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                                    finish();
                                } else {
                                    Toast.makeText(RegisteredActivity.this, "注册失败" + e.toString(),
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

                    }
                } else {
                    Toast.makeText(this, "输入框不能为空", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}*/
}
