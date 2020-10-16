package com.example.soptproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //회원가입창으로 넘어가기
        register_btn.setOnClickListener{
            val intent= Intent(this,secondActivity::class.java)
            startActivity(intent)
            //startActivityForResult(intent,3000)
        }
        /*
        var intent3 =getIntent()
        id_input.setText(intent3.getStringExtra("id").toString())
        pw_input.setText(intent3.getStringExtra("pw").toString())
        */
    }


/*
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode== RESULT_OK){
            when(requestCode){
                3000->{
                    id_input.visibility= View.VISIBLE
                    pw_input.visibility= View.VISIBLE
                    id_input.text=data.getStringExtra("id").toString()
                    pw_input.text=data.getStringExtra("pw").toString()
                }

            }

        }
    }*/

}