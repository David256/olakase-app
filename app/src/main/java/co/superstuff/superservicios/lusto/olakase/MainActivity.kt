package co.superstuff.superservicios.lusto.olakase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var buttonUp: Button
    lateinit var buttonDown: Button
    lateinit var textViewInfo: TextView
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonUp = findViewById<Button>(R.id.button_up)
        buttonDown = findViewById<Button>(R.id.button_down)

        textViewInfo = findViewById<TextView>(R.id.textViewInfo)

        // Set listeners
        buttonUp.setOnClickListener(this)
        buttonDown.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.button_up -> {
                println("Button Up")
                count++
            }

            R.id.button_down -> {
                println("Button down")
                count--
            }
        }

        // Update info
        textViewInfo.text = "Count: " + count.toString()

    }

}
