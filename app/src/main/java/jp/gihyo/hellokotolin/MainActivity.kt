package jp.gihyo.hellokotolin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val title by lazy { findViewById(R.id.title) as TextView }
    val button by lazy { findViewById(R.id.button) as Button }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title.text = "Hello Kotlin"

        button.setOnClickListener { view ->
            val text = title.text.let { it.toString() + "!" }?: "Hello Kotolin orz"
            title.text = text
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
