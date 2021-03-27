package br.com.gilbercs.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Gilber C Souza
 */
class MainActivity : AppCompatActivity() {
    //função princiapl
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //criar variavel receber o modelo
        val listaArray =ArrayList<ModelRecyclearView>()
        val recyclear = findViewById<RecyclerView>(R.id.idRecyclearView)
        //adionar itens
        listaArray.add(ModelRecyclearView(R.drawable.icon_flutter_01, "Flutter"))
        listaArray.add(ModelRecyclearView(R.drawable.icon_github_02, "Github"))
        listaArray.add(ModelRecyclearView(R.drawable.icon_java_03, "java"))
        listaArray.add(ModelRecyclearView(R.drawable.icon_php_04, "php"))
        listaArray.add(ModelRecyclearView(R.drawable.icon_kotlin_05, "Kotlin"))
        val  adapeterItens = AdapterRecyclearView(listaArray, this)
            recyclear.layoutManager = LinearLayoutManager(this)
        recyclear.adapter = adapeterItens
    }

}