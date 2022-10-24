package uz.uzmbapps.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)


        val getMessage = intent.getStringExtra("mesKey")
        findViewById<TextView>(R.id.textView).text = getMessage.toString()
    }
}