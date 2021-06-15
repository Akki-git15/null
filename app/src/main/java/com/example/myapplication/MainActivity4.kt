package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var btn=findViewById<Button>(R.id.btn_4)
        var fnum=findViewById<EditText>(R.id.et1_4)
        var snum=findViewById<EditText>(R.id.et2_4)
        var result=findViewById<TextView>(R.id.txtV_4)
        var spnr=findViewById<Spinner>(R.id.spinner2)

        btn.setOnClickListener(View.OnClickListener {
             var a:Float=fnum.text.toString().toFloat()
             var b:Float=snum.text.toString().toFloat()
             var s=spnr.selectedItem.toString()
             when(s){
                 "+"-> result.setText("result: "+ add(a,b))
                 "-"-> result.setText("result: "+ sub(a,b))
                 "*"-> result.setText("result: "+ mul(a,b))
                 "/"-> result.setText("result: "+ divd(a,b))
                 "%"-> result.setText("result: "+ mod(a,b))
             }
        })
    }
    fun add(a:Float,b:Float):Float = a+b
    fun sub(a:Float,b:Float):Float = a-b
    fun mul(a:Float,b:Float):Float = a*b
    fun divd(a:Float,b:Float):Float = a/b
    fun mod(a:Float,b:Float):Float = a%b
}
