package com.nsbm.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var etUsernameM : EditText? = null
    private var etPasswordM : EditText? = null
    private var btnButtonM : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsernameM = findViewById(R.id.etUsername)
        etPasswordM = findViewById(R.id.etPassword)
        btnButtonM = findViewById(R.id.btnLogin)

        btnButtonM?.setOnClickListener {

            if(etUsernameM?.text.toString().isEmpty() || etPasswordM?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter username and password", Toast.LENGTH_SHORT).show()
            }else{
                var username = etUsernameM?.text.toString()
                var password = etPasswordM?.text.toString()
                Toast.makeText(applicationContext, "UN: "+username+" PW: "+password, Toast.LENGTH_SHORT).show()

                val intent = Intent(this, MovieListActivity::class.java).apply {}
                startActivity(intent)
            }

        }

    }

}
