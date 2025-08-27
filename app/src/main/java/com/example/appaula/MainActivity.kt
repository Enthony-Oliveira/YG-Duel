package com.example.appaula

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var botaoIniciar: Button
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoIniciar = findViewById(R.id.botaoIniciar)

        botaoIniciar.setOnClickListener {
            tocarAudio()
            abrirTelaCartas()
        }
    }

    private fun tocarAudio() {
        mediaPlayer = MediaPlayer.create(this, R.raw.e_hora_do_duelo)
        mediaPlayer.start()

        android.os.Handler().postDelayed({
            if (mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.release()
            }
        },3000)
    }

    private fun abrirTelaCartas() {
        val intent = Intent(this, CartaActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::mediaPlayer.isInitialized) {
            mediaPlayer.release()
        }
    }
}
