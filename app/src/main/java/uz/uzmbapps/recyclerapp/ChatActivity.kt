package uz.uzmbapps.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import uz.uzmbapps.recyclerapp.models.ItemModel

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)


//        val getMessage = intent.getStringExtra("mesKey")
//        val getMessage = intent.getSerializableExtra("key") as ItemModel
//        findViewById<TextView>(R.id.textView).text = getMessage.name
    }
}