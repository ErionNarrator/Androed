package com.example.myapplication

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var buttonD = findViewById<ImageView>(R.id.dialog_button)
        buttonD.setOnClickListener{
            val dialogBlid=layoutInflater.inflate(R.layout.dialog_box,null)
            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBlid)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val buttonNext = dialogBlid.findViewById<Button>(R.id.next)
            buttonNext.setOnClickListener{
                myDialog.dismiss()
            }




            val buttonRed = dialogBlid.findViewById<RadioButton>(R.id.radioButton5)
            val buttonGreen = dialogBlid.findViewById<RadioButton>(R.id.radioButton6)
            val buttonBlue = dialogBlid.findViewById<RadioButton>(R.id.radioButton7)

            val buttonContB = dialogBlid.findViewById<CheckBox>(R.id.checkBox)
            val buttonContT = dialogBlid.findViewById<CheckBox>(R.id.checkBox3)
            val buttonContM = dialogBlid.findViewById<CheckBox>(R.id.checkBox4)

            val mainSec = findViewById<LinearLayout>(R.id.linearLayout3)
            val topSec = findViewById<LinearLayout>(R.id.linearLayout)
            val downSec = findViewById<LinearLayout>(R.id.linearLayout2)


            buttonRed.setOnClickListener {
                if (buttonRed.isChecked && buttonContB.isChecked){
                    downSec.setBackgroundColor(Color.RED)
                }
                if (buttonRed.isChecked && buttonContT.isChecked){
                    topSec.setBackgroundColor(Color.RED)
                }
                if (buttonRed.isChecked && buttonContM.isChecked){
                    topSec.setBackgroundColor(Color.RED)
                    downSec.setBackgroundColor(Color.RED)
                    mainSec.setBackgroundColor(Color.RED)

                }
            }
            buttonGreen.setOnClickListener {
                if (buttonGreen.isChecked && buttonContB.isChecked){
                    downSec.setBackgroundColor(Color.GREEN)
                }
                if (buttonGreen.isChecked && buttonContT.isChecked){
                    topSec.setBackgroundColor(Color.GREEN)
                }
                if (buttonGreen.isChecked && buttonContM.isChecked){
                    topSec.setBackgroundColor(Color.GREEN)
                    downSec.setBackgroundColor(Color.GREEN)
                    mainSec.setBackgroundColor(Color.GREEN)

                }
            }

            buttonBlue.setOnClickListener {
                if (buttonBlue.isChecked && buttonContB.isChecked){
                    downSec.setBackgroundColor(Color.BLUE)
                }
                if (buttonBlue.isChecked && buttonContT.isChecked){
                    topSec.setBackgroundColor(Color.BLUE)
                }
                if (buttonBlue.isChecked && buttonContM.isChecked){
                    topSec.setBackgroundColor(Color.BLUE)
                    downSec.setBackgroundColor(Color.BLUE)
                    mainSec.setBackgroundColor(Color.BLUE)

                }
            }

            val buttonSet = findViewById<ImageView>(R.id.set_button)
            buttonSet.setOnClickListener{
                topSec.setBackgroundColor(Color.WHITE)
                downSec.setBackgroundColor(Color.WHITE)
                mainSec.setBackgroundColor(Color.WHITE)
            }


        }

    }
}