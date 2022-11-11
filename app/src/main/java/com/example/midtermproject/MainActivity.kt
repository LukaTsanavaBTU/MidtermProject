package com.example.midtermproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etSurname: EditText
    private lateinit var etNumber: EditText
    private lateinit var etId: EditText
    private lateinit var btRegister: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etSurname = findViewById(R.id.etSurname)
        etNumber = findViewById(R.id.etNumber)
        etId = findViewById(R.id.etId)
        btRegister = findViewById(R.id.btRegister)

        btRegister.setOnClickListener {
            if (etName.text.toString().length < 3 || etSurname.text.toString().length < 5) {
                Toast.makeText(applicationContext, "გთხოვთ, სწორად შეიყვანოთ თქვენი სახელი და გვარი.", Toast.LENGTH_LONG).show()
            }
            else if (etNumber.text.toString().length != 9 || etNumber.text.toString()[0].toString() != "5" || !etNumber.text.toString().isDigitsOnly()) {
                Toast.makeText(applicationContext, "გთხოვთ, სწორად შეიყვანოთ თქვენი ტელეფონის ნომერი.", Toast.LENGTH_LONG).show()
            }
            else if (etId.text.toString().length != 11 || !etId.text.toString().isDigitsOnly()) {
                Toast.makeText(applicationContext, "გთხოვთ, სწორად შეიყვანოთ თქვენი პირადი ნომერი.", Toast.LENGTH_LONG).show()
            }
            else { Toast.makeText(applicationContext, "რეგისტრაცია წარმატებით გავლილია!", Toast.LENGTH_LONG).show() }
        }
    }
}