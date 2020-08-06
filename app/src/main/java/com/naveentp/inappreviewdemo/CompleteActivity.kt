package com.naveentp.inappreviewdemo

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_complete.*

/**
 * @author Naveen T P
 * @since 05/08/20
 */
class CompleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete)

        btnGoBack.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}