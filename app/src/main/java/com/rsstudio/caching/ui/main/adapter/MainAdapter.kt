package com.rsstudio.caching.ui.main.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.makeramen.roundedimageview.RoundedImageView
import com.rsstudio.caching.R
import com.rsstudio.networkcalling.model.Data

class MainAdapter(
    private var context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var list: MutableList<Data> = mutableListOf()


    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var tvBeerName: TextView = view.findViewById(R.id.tvBeerName)
        var tvBeerTagline: TextView = view.findViewById(R.id.tvBeerTagline)
        private var tvBearDescription: TextView = view.findViewById(R.id.tvBeerDescription)
        var tvBearAbv: TextView = view.findViewById(R.id.tvBeerAbv)
        var rivBeerImage: RoundedImageView = view.findViewById(R.id.rivBeerImage)

        @SuppressLint("SetTextI18n")
        fun onBind(item: Data) {

            tvBeerName.text = item.title_japanese
            tvBeerTagline.text = item.source
            tvBearDescription.text = item.rating
            tvBearAbv.text = item.score.toString()

            // setting image
            Glide
                .with(context)
                .load(item.images.jpg.large_image_url)
                .thumbnail(0.7f)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .dontAnimate()
                .into(rivBeerImage)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.view_anime_item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        if (holder is MainAdapter.ItemViewHolder) {
            holder.onBind(item)
        }
    }

    fun submitList(newList: List<Data>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}