package com.cheney.databindingsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.Toast;

import com.cheney.databindingsample.beans.User;
import com.cheney.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private final String TAG = getClass().getSimpleName();
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("李四", "123456");
        binding.setUser(user);
        binding.setUserHandler(new UserHandler());
    }

    public class UserHandler {
        public void login(User user) {
            Toast.makeText(MainActivity.this, user.getUsername().get() + "登录成功", Toast.LENGTH_SHORT).show();
        }

        public void afterUsernameTextChanged(Editable s) {
            Log.d(TAG, "当前输入用户名" + s.toString());
        }
    }
}
