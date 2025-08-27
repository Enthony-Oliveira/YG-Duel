package com.example.appaula

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CartaActivity : AppCompatActivity() {

    private lateinit var imagemCarta: ImageView
    private lateinit var botaoJogar: Button

    private val cartas = listOf(
        R.drawable.bebe_dragao,
        R.drawable.dragao_branco_de_olhos_azuis,
        R.drawable.dragao_negro_de_olhos_vermelhos,
        R.drawable.dragao_caveira_negro,
        R.drawable.gaia_o_matador_de_dragoes,
        R.drawable.mago_do_tempo,
        R.drawable.mundacao_de_opiniao,
        R.drawable.o_dragao_alado_de_ra,
        R.drawable.obelisco_o_atormentador,
        R.drawable.mago_negro,
        R.drawable.senhor_dos_dragoes,
        R.drawable.slifer_o_dragao_celeste
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carta)

        imagemCarta = findViewById(R.id.imagemCarta)
        botaoJogar = findViewById(R.id.botaoJogar)

        botaoJogar.setOnClickListener {
            val cartaSorteada = cartas.random()
            imagemCarta.setImageResource(cartaSorteada)
        }
    }
}
