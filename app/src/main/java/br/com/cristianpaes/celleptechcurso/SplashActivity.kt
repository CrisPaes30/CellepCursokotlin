package br.com.cristianpaes.celleptechcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Abrir a tela de LoginActivty após esperar 2.5 segundos
        Handler(Looper.getMainLooper()).postDelayed({

            //Criando uma intent e guardando ela numa variável
            val mIntent = Intent(this, LoginActivity::class.java )

            //Iniciar a Intent
            startActivity(mIntent)

            //Finalizando a SplashActivity
            finish()
        }, 2500)
    }
}