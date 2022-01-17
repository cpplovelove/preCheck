package com.example.precheck

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.precheck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater);
        setFragment();
        setContentView(binding.root);

    }

    inner class ButtonListener:View.OnClickListener{
        override fun onClick(view: View?) {
            when(view?.id){
                R.id.noteButton->{
                    //부작용 작성페이지로 이동
                    supportFragmentManager.beginTransaction().replace(R.id.mainFragment, loginFragment())
                        .commit();
                    //로그인 fragment에서 정상적으로 로그인이 됐을때 다음으로 진입

                }
            }
        }
    }


    public fun getUserToken(id:String, password:String){
        //여기서 받아와서 DB에서 정보 찾기

    }

    fun setFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.mainFragment, mainFragment())
            .commit();
    }

}