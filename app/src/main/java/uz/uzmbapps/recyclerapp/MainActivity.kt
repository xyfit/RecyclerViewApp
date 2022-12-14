package uz.uzmbapps.recyclerapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.uzmbapps.recyclerapp.adapters.AdapterCallback
import uz.uzmbapps.recyclerapp.adapters.HomeAdapter
import uz.uzmbapps.recyclerapp.models.ItemModel

class MainActivity : AppCompatActivity() {
    val myList = arrayListOf<ItemModel>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_id)

        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = GridLayoutManager(this, 3)
//        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        myList.add(ItemModel("text1 ", "mes1"))
        myList.add(ItemModel("text2 ", "mes2"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))
        myList.add(ItemModel("text3 ", "mes3"))
        myList.add(ItemModel("text4 ", "mes4"))
        myList.add(ItemModel("text5 ", "mes5"))

        recyclerView.adapter = HomeAdapter(myList, object : AdapterCallback{
            override fun itemClick(a: Int) {
                myList.removeAt(a)
                recyclerView.adapter?.notifyDataSetChanged()
            }
        })

    }

    override fun onStart() {
        super.onStart()

    }

}

/**
 * item layout
 * model
 * adapter
 * */


/**
 * ItemModel(): Serializable
 * get -> intent.getSerializableExtra("key") as ItemModel
 * */