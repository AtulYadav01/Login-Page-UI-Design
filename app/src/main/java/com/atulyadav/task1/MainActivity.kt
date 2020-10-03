package com.atulyadav.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.atulyadav.task1.R

import com.google.firebase.auth.FirebaseAuth

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signup.setOnClickListener {
            val email =et_email.text.toString()
            val password = et_password.text.toString()

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
            startActivity(Intent(this,ChatActivity::class.java))
        }

    }
}
