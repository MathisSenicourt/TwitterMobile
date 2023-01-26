package com.example.twitterv1

import android.view.*
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data: List<MyData>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //holder.view.textView.text = data[position].name
    }

    override fun getItemCount() = data.size
}

class MyData {

}
