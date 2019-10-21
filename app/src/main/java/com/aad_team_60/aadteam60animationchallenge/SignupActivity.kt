package com.aad_team_60.aadteam60animationchallenge

import android.animation.ValueAnimator
import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.aad_team_60.aadteam60animationchallenge.databinding.ActivitySignupBinding
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {
    private var binding:ActivitySignupBinding? = null
    private var GENDER = arrayOf("Male", "Female")
    private var DEPARTMENT = arrayOf("Android", "Mobile Web", "Cloud")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_signup)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)

        var isChecked = true

        val genderAdapter  = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, GENDER)
        val deptAdapter  = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, DEPARTMENT)

        binding?.genderDropdown?.setAdapter(genderAdapter)
        binding?.departmentDropdown?.setAdapter(deptAdapter)

    }



    fun load(view: View) {

    }

    fun animatedButton(){


    }

    fun getFinalWidth(): Int{

        return resources.getDimension(R.dimen.get_width).toInt()
    }
}
