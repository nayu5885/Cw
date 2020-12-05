package app.asahi.nayu.cw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count:Int=0
    var count2:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button =findViewById(R.id.button)
        val button2:Button=findViewById(R.id.button2)
        textView.text="0"

        button.setOnClickListener {
            count++
            textView.text=count.toString()
            when{

            }
        }

        button2.setOnClickListener {
            count+= 10
            textView.text=count.toString()
        }

        button3.setOnClickListener {
            count--
            textView.text=count.toString()
        }

        button4.setOnClickListener {
            count-=10
            textView.text=count.toString()
        }



    }
}
