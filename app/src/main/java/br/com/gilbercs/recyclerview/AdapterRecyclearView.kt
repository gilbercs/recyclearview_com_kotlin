package br.com.gilbercs.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AdapterRecyclearView(val lista: ArrayList<ModelRecyclearView>, val context: Context):
RecyclerView.Adapter<AdapterRecyclearView.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imagen = itemView.findViewById<ImageView>(R.id.idAdpImagem)
        val texto = itemView.findViewById<TextView>(R.id.idAdpTexto)
        fun itens(modelItens: ModelRecyclearView){
            imagen.setImageResource(modelItens.idModelImagen)
            texto.text = modelItens.idTextoModelo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listaLayout = LayoutInflater.from(parent.context).inflate(R.layout.lista_adapter,parent, false)
        return ViewHolder(listaLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itens(lista[position])
        if (position==0){
            Toast.makeText(context,"Item selecionado!!",Toast.LENGTH_SHORT).show()
        }
        if (position==1){
            Toast.makeText(context,"Item selecionado!!",Toast.LENGTH_SHORT).show()
        }
        if (position==2){
            Toast.makeText(context,"Item selecionado!!",Toast.LENGTH_SHORT).show()
        }
        if (position==3){
            Toast.makeText(context,"Item selecionado!!",Toast.LENGTH_SHORT).show()
        }
        if (position==4){
            Toast.makeText(context,"Item selecionado!!",Toast.LENGTH_SHORT).show()
        }
    }
    override fun getItemCount(): Int {
        return lista.size
    }
}