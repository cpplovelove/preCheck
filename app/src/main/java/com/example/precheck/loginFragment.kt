package com.example.precheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.precheck.databinding.ActivityMainBinding
import com.example.precheck.databinding.FragmentLoginBinding
import kotlin.math.sign
import android.content.Intent

import android.R
import android.widget.Button


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

public class loginFragment : Fragment(),View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(com.example.precheck.R.layout.fragment_login, container, false)
        val btn: Button = view.findViewById(com.example.precheck.R.id.signIn);
        btn.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        var binding= FragmentLoginBinding.inflate(layoutInflater);
        var id=binding.id.text;
        var password =binding.password.text;
        var mainActivity = activity as MainActivity;

        when (v?.id) {
            com.example.precheck.R.id.signIn-> {
                Toast.makeText(context,"제발",Toast.LENGTH_SHORT).show();
                mainActivity.getUserToken(id.toString(),password.toString());

            }
        }
    }

    companion object {
        fun newInstance(): loginFragment {
            return loginFragment()
        }
    }
}