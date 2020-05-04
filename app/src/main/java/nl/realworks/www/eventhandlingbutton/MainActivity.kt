package nl.realworks.www.eventhandlingbutton

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            relativeLayout.setBackgroundColor(Color.GREEN)
        }

        button2.setOnClickListener {
            relativeLayout.setBackgroundColor(Color.BLUE)
        }
    }
}
