package com.utilita.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.utilita.R
import com.utilita.model.StatusDetailsModel
import com.utilita.model.StatusModel
import com.utilita.utils.Utils
import kotlinx.android.synthetic.main.status_item_view.view.*


class StatusAdapter (var listener:StatusListener) : RecyclerView.Adapter<StatusAdapter.StatusViewHolder>(){

    private var data : ArrayList<StatusDetailsModel>?=null

    interface StatusListener{
        fun onItemClicked(statusDetailsModel: StatusDetailsModel, position: Int)
    }

    fun setData(statusData:ArrayList<StatusDetailsModel>?){
        data = statusData
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
        holder.itemView.setOnClickListener {
            item?.let { it1 ->
                listener.onItemClicked(it1, position)
            }
        }
    }

    class StatusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(item: StatusDetailsModel?) {
            itemView.status_item.text = item?.status
            if (item?.details?.responseCode == 200)
                itemView.status_class.setImageResource(R.drawable.ic_check)
            else{
                itemView.status_class.setImageResource(R.drawable.ic_close)
            }
        }

    }

}