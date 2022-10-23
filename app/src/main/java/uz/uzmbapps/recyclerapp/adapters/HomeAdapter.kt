package uz.uzmbapps.recyclerapp.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import uz.uzmbapps.recyclerapp.ChatActivity
import uz.uzmbapps.recyclerapp.R
import uz.uzmbapps.recyclerapp.models.ItemModel

class HomeAdapter(val lists: List<ItemModel>):RecyclerView.Adapter<HomeAdapter.ItemHolder>(){
    inner class ItemHolder(view: View): RecyclerView.ViewHolder(view)

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
      val holder = ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ly, parent, false))
        return holder
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val itemData = lists[position]
        holder.itemView.findViewById<TextView>(R.id.name_id).text = itemData.name
        holder.itemView.findViewById<TextView>(R.id.message_id).text = itemData.message

//        holder.itemView.findViewById<ConstraintLayout>(R.id.item_id).setOnClickListener {
//            Toast.makeText(holder.itemView.context, "itemView", Toast.LENGTH_SHORT).show()
//        }
        holder.itemView.setOnClickListener {
            val i = Intent(holder.itemView.context, ChatActivity::class.java)
            holder.itemView.context.startActivity(i)
        }


    }

    override fun getItemCount(): Int = lists.size
}