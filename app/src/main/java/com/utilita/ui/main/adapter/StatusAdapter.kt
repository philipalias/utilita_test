package com.utilita.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.utilita.R
import com.utilita.model.StatusModel
import kotlinx.android.synthetic.main.status_item_view.view.*


class StatusAdapter (var listener:StatusListener) : RecyclerView.Adapter<StatusAdapter.StatusViewHolder>(){

    private var data : ArrayList<StatusModel>?=null

    interface StatusListener{
        fun onItemDeleted(postModel: StatusModel, position: Int)
    }

    fun setData(list: ArrayList<StatusModel>){
        data = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusViewHolder {
        return StatusViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.status_item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

    override fun onBindViewHolder(holder: StatusViewHolder, position: Int) {
        val item = data?.get(position)
        holder.bindView(item)
        /*holder.itemView.img_delete.setOnClickListener {
            item?.let { it1 ->
                listener.onItemDeleted(it1, position)
            }
        }*/
    }



    class StatusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(item: StatusModel?) {
            //itemView.status_item.text = item?.aPIsDBs.
        }

    }

}