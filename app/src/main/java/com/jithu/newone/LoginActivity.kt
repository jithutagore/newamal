package com.jithu.newone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var naming:TextView
    lateinit var login:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        naming=findViewById(R.id.name)
        login=findViewById(R.id.login)

        naming.setOnClickListener{
            Toast.makeText(this@LoginActivity,
                "Rahul is Legand in coding",
                   Toast.LENGTH_LONG).show()
            var intent= Intent(this@LoginActivity,MainActivity2::class.java)
            startActivity(intent)
        }


        Toast.makeText(
            this@LoginActivity,"gsdjkhafg",Toast.LENGTH_LONG
        )
    }
}