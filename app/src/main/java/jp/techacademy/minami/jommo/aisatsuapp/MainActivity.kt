package jp.techacademy.minami.jommo.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.app.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    if (2 <= hour && hour <= 9) {
                        textView.text = "おはよう"
                    }else if (10 <= hour && hour <=17){
                        textView.text = "こんにちは"
                    }else {
                        textView.text = "こんばんは"
                    }

                    Log.d("UI_PARTS", "$hour:$minute")
                },
                13, 0, true)
        timePickerDialog.show()
    }
}
