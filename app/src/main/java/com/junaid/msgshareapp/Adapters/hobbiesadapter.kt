package com.junaid.msgshareapp.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.junaid.msgshareapp.R
import com.junaid.msgshareapp.model.cardview
import kotlinx.android.synthetic.main.list_item.view.*


  class hobbiesadapter(val context: Context,private val hobbies: List<cardview> ):RecyclerView.Adapter<hobbiesadapter.Myviewholder>(){

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
                val view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
                return Myviewholder(view)
    }
      override fun getItemCount(): Int {
                return cardview.supplier.hobbies.size
    }
      override fun onBindViewHolder(holder: Myviewholder, position: Int) {
                val hobby= hobbies[position]
                holder.setdata(hobby,position)
    }

      inner class Myviewholder(itemView:View): RecyclerView.ViewHolder(itemView){
                private  var currenthobby: cardview?=null
                var currentposition :Int=0

          init{
            itemView.setOnClickListener{
                val mass=currenthobby!!.title+"  clicked !"
                Toast.makeText(context,mass,Toast.LENGTH_SHORT).show()

            }
            itemView.imageView2.setOnClickListener {
                val mass="my hobby is:"+currenthobby!!.title
                val intent= Intent()
                intent.action= Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,mass)
                intent.type="test/plain"
                context. startActivity(Intent.createChooser(intent,"Share To"))
            }
        }
          fun  setdata(cardview: cardview?, pos: Int) {
            itemView.txvTitle.text=cardview!!.title
               this.currenthobby=cardview
               this.currentposition=pos
        }
     }
  }