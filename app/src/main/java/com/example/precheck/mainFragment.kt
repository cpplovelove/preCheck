package com.example.precheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.precheck.databinding.ActivityMainBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class mainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setFragment(); //화면 세팅
        return inflater.inflate(R.layout.fragment_main, container, false)
    }



    fun setFragment(){
        childFragmentManager.beginTransaction().replace(R.id.community,communityFragment()).commit();
        childFragmentManager.beginTransaction().replace(R.id.cardNews,newsFragment()).commit();
        Toast.makeText(this.context,"replace Fragment",Toast.LENGTH_SHORT).show();
    }
}