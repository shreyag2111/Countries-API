package com.example.allworldcountries.Adapter

import android.content.Context
import android.view.View
import android.widget.Adapter
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.allworldcountries.CountrieClick
import com.example.allworldcountries.Model.countrieModel
import com.example.allworldcountries.R



class countrieAdapter(countrieModel: List<countrieModel>, clickItem : CountrieClick) : Adapter<countrieAdapter.CounyrieHolder>() {

    lateinit var context: Context
    var clickItem = clickItem
    var countrieList = countrieModel

    class  CountrieHolder(itemView: View) : ViewHolder(itemView){

        var imgcountrie = itemView.findViewById<ImageView>(R.id.imgcount)
        var textcount = itemView.findViewById<ImageView>(R.id.txtcount)
        var txtcapital = itemView.findViewById<ImageView>(R.id.txtcapit)

    }
}