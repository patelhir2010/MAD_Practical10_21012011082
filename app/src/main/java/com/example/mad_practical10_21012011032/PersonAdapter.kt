package com.example.mad_practical10_21012011032

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class PersonAdapter (context: Context,val personArray: ArrayList<Person>):ArrayAdapter<Person>(context,0,personArray) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.person_item, parent, false)


        view.findViewById<TextView>(R.id.textName1)
        view.findViewById<TextView>(R.id.text_no)
        view.findViewById<TextView>(R.id.textemail)
        view.findViewById<TextView>(R.id.textaddress)
        view.findViewById<MaterialButton>(R.id.person_image).setOnClickListener {
            Intent(context, MapsActivity::class.java).putExtra("object", personArray[position])
                .apply { context.startActivity(this) }

        }
        return view
    }
}