package com.example.blank.ui.manualfoodsearch

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.blank.R
import com.example.blank.ui.manualfoodsearch.FoodAdapter.FoodViewHolder
import kotlinx.android.synthetic.main.row_food.*
import kotlinx.android.synthetic.main.row_food.view.*

class FoodAdapter : ListAdapter<Food, FoodViewHolder>(FoodComparator) {

    var listener: Listener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = getItem(position)

        holder.apply {
            tvFoodName.text = food.foodName
            cbChecked.isChecked = food.isChecked
        }



        // TODO set View data from food
    }

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvFoodName = itemView.tvFoodRow!!
        var cbChecked = itemView.cbFoodRow!!

        // TODO create View properties

        var food: Food? = null

        init {
            itemView.setOnClickListener {
                food?.let { listener?.onFoodClicked(it) }
            }
        }
    }

    interface Listener {
        fun onFoodClicked(food: Food)
    }

}
