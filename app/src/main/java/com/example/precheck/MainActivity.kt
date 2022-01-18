package com.example.precheck

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.precheck.databinding.ActivityMainBinding
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.*
import java.util.*
import java.util.stream.DoubleStream.builder


class MainActivity : AppCompatActivity(){
    lateinit var data:DatabaseReference;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater);
        setFragment();
        setContentView(binding.root);

        //안되노..
        binding.noteButton.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mainFragment, loginFragment()).commit();
        }
    }



    public fun getUserToken(id:String, password:String){
        //여기서 받아와서 DB에서 정보 찾기
        data = FirebaseDatabase.getInstance().getReference("user")

        data.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                for(user in snapshot.children)
                    //여기서 유저 정보 하나씩 로깅
                    Log.e("loginData",user.toString())
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })
        val query = data.limitToLast(50)
        val option = FirebaseRecyclerOptions.Builder<userData>().setQuery(query,userData::class.java).build();


    }

    fun setFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.mainFragment, mainFragment())
            .commit();
    }

}