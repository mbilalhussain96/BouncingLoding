package com.android.bouncingloding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.dots_loadinglibrary.linear.LoadingBiggy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val LoadingWavy: LoadingBiggy = findViewById(R.id.loadingWavy)


    }
}