package com.example.testlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var liveText: MutableLiveData<String> = MutableLiveData()
    private var count = 0 // button을 누르면 증가 될 숫자

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // LiveData의 value의 변경을 감지하고 호출
        liveText.observe(this, Observer {
            // it로 넘어오는 param은 LiveData의 value
            text_test.text = it
        })

        btn_change.setOnClickListener {
            // liveText의 value를 변경
            // liveText 자체를 변경시키면 안됨
            liveText.value = "Hello World! ${++count}"
        }
    }
}