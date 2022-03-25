package com.swkim.mysololife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.swkim.mysololife.auth.IntroActivity
import com.swkim.mysololife.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var backPressedTime : Long = 0
    private lateinit var binding : ActivityMainBinding
    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {


        auth = Firebase.auth
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.logoutBtn.setOnClickListener { 로그아웃 부분
//            auth.signOut()
//            startActivity(Intent(this, IntroActivity::class.java))
//            finish()
//        }
    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - backPressedTime < 2000) {
            finish()
            return
        }
        Toast.makeText(this, "'뒤로' 버튼을 한번 더 누르시면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
        backPressedTime = System.currentTimeMillis()
    }
}