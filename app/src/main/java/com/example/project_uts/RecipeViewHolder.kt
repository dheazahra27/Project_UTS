package com.example.project_uts

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeViewHolder(itemView: View)
    : RecyclerView.ViewHolder(itemView) {

    val txtName: TextView =
        itemView.findViewById(R.id.txtName)

    val txtIngredients: TextView =
        itemView.findViewById(R.id.txtIngredients)

    val txtSteps: TextView =
        itemView.findViewById(R.id.txtSteps)
}