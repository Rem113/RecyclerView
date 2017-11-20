package com.rem113.recyclerview

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_row.view.*

class ItemAdapter(private var items : Array<String> = arrayOf()) : RecyclerView.Adapter<ItemAdapter.ItemHolder>() {

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.text.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(parent.inflate(R.layout.item_row))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ItemHolder(row: View) : RecyclerView.ViewHolder(row), View.OnClickListener {
        private var view : View = row
        var text : TextView = row.text

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            Log.d("Clicked", v.text.text.toString())
        }
    }

}