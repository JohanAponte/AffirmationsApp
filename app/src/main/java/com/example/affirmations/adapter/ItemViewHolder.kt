package com.example.affirmations.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.databinding.ListItemBinding
import com.example.affirmations.model.Affirmation

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ListItemBinding.bind(view)

    fun render(itemModel: Affirmation, context: Context) {
        with(binding) {
            itemTitle.text = context.resources.getString(itemModel.stringResourceId)
            itemImage.setImageResource(itemModel.imageResourceId)
        }
    }
}