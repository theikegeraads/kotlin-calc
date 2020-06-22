package com.zeehond.multiplicationtables

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amountLabel: TextView = findViewById(R.id.amountLabel)
        val amountSlide: SeekBar = findViewById(R.id.amountSlide)
        val calcButton: Button = findViewById(R.id.calcButton)
        val label1: TextView = findViewById(R.id.label1)
        val label2: TextView = findViewById(R.id.label2)
        val label3: TextView = findViewById(R.id.label3)
        val label4: TextView = findViewById(R.id.label4)
        val label5: TextView = findViewById(R.id.label5)
        val label6: TextView = findViewById(R.id.label6)
        val label7: TextView = findViewById(R.id.label7)
        val label8: TextView = findViewById(R.id.label8)
        val label9: TextView = findViewById(R.id.label9)
        val label10: TextView = findViewById(R.id.label10)

        amountSlide.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val displayValue: String = "${progress + 1}"
                amountLabel.text = "$displayValue"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }
        })

        calcButton.setOnClickListener {
            var realValue = amountSlide.progress.toInt()
            val displayValue = "${realValue + 1}"
            var l1t = "1 x $displayValue = ${1 * displayValue.toInt()}"
            label1.text = l1t
            var l2t = "2 x $displayValue = ${2 * displayValue.toInt()}"
            label2.text = l2t
            var l3t = "3 x $displayValue = ${3 * displayValue.toInt()}"
            label3.text = l3t
            var l4t = "4 x $displayValue = ${4 * displayValue.toInt()}"
            label4.text = l4t
            var l5t = "5 x $displayValue = ${5 * displayValue.toInt()}"
            label5.text = l5t

            var l6t = "6 x $displayValue = ${6 * displayValue.toInt()}"
            label6.text = l6t
            var l7t = "7 x $displayValue = ${7 * displayValue.toInt()}"
            label7.text = l7t
            var l8t = "8 x $displayValue = ${8 * displayValue.toInt()}"
            label8.text = l8t
            var l9t = "9 x $displayValue = ${9 * displayValue.toInt()}"
            label9.text = l9t
            var l10t = "10 x $displayValue = ${10 * displayValue.toInt()}"
            label10.text = l10t
        }

    }
}

