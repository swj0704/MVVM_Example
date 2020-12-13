package com.example.datebindingwithlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import com.example.datebindingwithlivedata.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val liveText = MutableLiveData<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            lifecycleOwner = this@MainActivity  // **중요** binding에 LifeCycleOwner을 지정해줘야 LiveData가 실시간으로 변화
            activity = this@MainActivity        // xml 파일에 선언한 activity

            btnChange.setOnClickListener {
                liveText.value = "Hello LiveData!"
            }

        }

        liveText.value = "Hello DataBinding!"
    }
}