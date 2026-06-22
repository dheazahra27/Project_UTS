package com.example.project_uts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(
    private val recipeList: List<Recipe>
) : RecyclerView.Adapter<RecipeViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe, parent, false)

        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: RecipeViewHolder,
        position: Int
    ) {

        val recipe = recipeList[position]

        holder.txtName.text = recipe.name
        holder.txtIngredients.text = recipe.ingredients
        holder.txtSteps.text = recipe.steps
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }
}