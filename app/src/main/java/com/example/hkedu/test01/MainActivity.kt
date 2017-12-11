package com.example.hkedu.test01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView3.text="defalut"

        button3.setOnClickListener {

            var res = ""
            for(x in 2..9){
                res += "${x}단\n"
                for(y in 1..9){
                    res += "${x} * ${y} = ${x*y}\n"
                }
            }

            textView3.text = res
            titleText.text = "gugudan"
        }
    }

}
