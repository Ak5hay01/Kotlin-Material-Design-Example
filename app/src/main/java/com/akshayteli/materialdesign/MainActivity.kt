package com.akshayteli.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.core.widget.doOnTextChanged
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = findViewById<TextInputLayout>(R.id.txt_input_layout_number)
        val error = findViewById<TextInputEditText>(R.id.text_input_edit_txt_error)
        val errorLayout = findViewById<TextInputLayout>(R.id.txt_input_layout_error)


        number.setEndIconOnClickListener{
            Toast.makeText(this,"Number validated",Toast.LENGTH_SHORT).show()

//            if want ot change the icon use following
//            number.setEndIconDrawable(R.drawable.ic_baseline_check_24)
        }

        error.doOnTextChanged { text, _, _, _ ->
            if (text!!.length>11){
                errorLayout.error = "Greater than 10!"
            }
            else if(text!!.length < 11)
            {
                errorLayout.error = null
            }
        }



    }

}


