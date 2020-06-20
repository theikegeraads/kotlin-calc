package com.zeehond.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      assigning buttons

        val oneButton: Button = findViewById(R.id.oneButton)
        val twoButton: Button = findViewById(R.id.twoButton)
        val threeButton: Button = findViewById(R.id.threeButton)
        val fourButton: Button = findViewById(R.id.fourButton)
        val fiveButton: Button = findViewById(R.id.fiveButton)
        val sixButton: Button = findViewById(R.id.sixButton)
        val sevenButton: Button = findViewById(R.id.sevenButton)
        val eightButton: Button = findViewById(R.id.eightButton)
        val nineButton: Button = findViewById(R.id.nineButton)
        val zeroButton: Button = findViewById(R.id.zeroButton)

        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusButton)
        val mulitplyButton: Button = findViewById(R.id.multiplyButton)
        val divideButton: Button = findViewById(R.id.divideButton)
        val dotButton: Button = findViewById(R.id.dotButton)

        val isButton: Button = findViewById(R.id.isButton)
        val clearButton: Button = findViewById(R.id.clearButton)

        val answerField: TextView = findViewById(R.id.answerField)

        var allowOp: Boolean = false


//      onclicks

        oneButton.setOnClickListener {
            addInt("1")
            allowOp = true
        }
        twoButton.setOnClickListener {
            addInt("2")
            allowOp = true
        }
        threeButton.setOnClickListener {
            addInt("3")
            allowOp = true
        }
        fourButton.setOnClickListener {
            addInt("4")
            allowOp = true
        }
        fiveButton.setOnClickListener {
            addInt("5")
            allowOp = true

        }
        sixButton.setOnClickListener {
            addInt("6")
            allowOp = true

        }
        sevenButton.setOnClickListener {
            addInt("7")
            allowOp = true
        }
        eightButton.setOnClickListener {
            addInt("8")
            allowOp = true
        }
        nineButton.setOnClickListener {
            addInt("9")
            allowOp = true
        }
        zeroButton.setOnClickListener {
            addInt("0")
            allowOp = true
        }

        plusButton.setOnClickListener {
            if (allowOp == false) {
                val pass = "pass"
            } else {
                addOp("+")
                allowOp = false
            }
        }
        minusButton.setOnClickListener {
            if (allowOp == false) {
                val pass = "pass"
            } else {
                addOp("-")
                allowOp = false
            }
        }
        multiplyButton.setOnClickListener {
            if (allowOp == false) {
                val pass = "pass"
            } else {
                addOp("*")
                allowOp = false
            }
        }
        divideButton.setOnClickListener {
            if (allowOp == false) {
                val pass = "pass"
            } else {
                addOp("/")
                allowOp = false
            }
        }

        dotButton.setOnClickListener {
            if(allowOp == false) {
                val pass = "pass"
            }
            else{
                val currentText = answerField.text.toString()
                answerField.text = "$currentText."
                allowOp = false
            }
        }

        isButton.setOnClickListener {
            if (allowOp == false) {
                val pass = "pass"
            } else {
                calculate()

            }

        }

        clearButton.setOnClickListener {
            clear()
        }


    }

    private fun addInt(number: String) {
        val currentText = answerField.text.toString()
        answerField.text = "$currentText$number"


    }

    private fun addOp(operator: String) {
        val currentText = answerField.text.toString()
        answerField.text = "$currentText $operator "
    }

    private fun clear() {
        answerField.text = ""
    }

    private fun calculate() {
        var rawText: String = answerField.text.toString()
        var fullArray: List<String> = rawText.split(" ")
        val n1s: String = fullArray[0]
        val op: String = fullArray[1]
        val n2s: String = fullArray[2]
        val n1 = n1s.toFloat()
        val n2 = n2s.toFloat()
        if (op == "+") {
            answerField.text = "${n1 + n2}"
        } else if (op == "-") {
            answerField.text = "${n1 - n2}"
        } else if (op == "*") {
            answerField.text = "${n1 * n2}"
        } else if (op == "/") {
            answerField.text = "${n1 / n2}"
        }
    }


}
