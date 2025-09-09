package edu.temple.classactivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var name = findViewById<editTextText>(R.id.editTextText).text

        val myEditText: EditText = findViewById(R.id.editTextText)




        findViewById<Button>(R.id.button).setOnClickListener{
            val enteredText = myEditText.text.toString()
            if(enteredText.isEmpty()){
                findViewById<TextView>(R.id.textView).text = "Enter a name!!!!!!"
                myEditText.text.clear()
            }
            else {
                findViewById<TextView>(R.id.textView).text = "hello $enteredText !!!"
                myEditText.text.clear()
            }

        }
    }

}