package com.example.physics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Formula(n: String, image: Int) {
    var name = n
    var img = image
}
class  FormulaAdapter() : RecyclerView.Adapter<FormulaAdapter.Companion.FormulaHolder>(){
    var formuls : MutableList<Formula> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):FormulaHolder {
        var phi = LayoutInflater.from(parent.context).inflate(R.layout.exercise_view, parent, false)
        return FormulaHolder(phi)
    }
    override fun getItemCount(): Int = formuls.size
    override fun onBindViewHolder(holder:FormulaHolder, position: Int) {
        holder.bind(formuls[position])
    }
    companion object{
        class FormulaHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var n : TextView = itemView.findViewById(R.id.name_ex)
            var i : ImageView = itemView.findViewById(R.id.img_ex)
            fun bind(f : Formula){
                n.setText(f.name)
                i.setImageResource(f.img)
            }
        }
    }
}