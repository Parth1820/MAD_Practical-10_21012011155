package com.example.mad_practical_10_21012011155

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.mad_practical_10_21012011156.R

class ContactAdapter (val context:Context, val array:ArrayList<Contact> ):ArrayAdapter<Contact>(context,0,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout,parent)
        return view
        return super.getView(position, convertView, parent)
    }
}