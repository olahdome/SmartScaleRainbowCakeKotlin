package com.example.blank.ui.manualfoodsearch

import androidx.recyclerview.widget.DiffUtil

object FoodComparator : DiffUtil.ItemCallback<Food>() {

    override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem == newItem
    }

}
