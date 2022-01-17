package com.example.precheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.precheck.databinding.ActivityMainBinding
import com.example.precheck.databinding.FragmentLoginBinding
import kotlin.math.sign

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

public class loginFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //로그인 버튼이 눌렸을 떄
        var binding= FragmentLoginBinding.inflate(layoutInflater)
        binding.signIn.setOnClickListener{
            var id=binding.id.text;
            var password =binding.password.text;
            var mainActivity = activity as MainActivity;
            mainActivity.getUserToken(id.toString(),password.toString());
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }


}