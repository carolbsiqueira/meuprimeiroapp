 package com.carolinasiqueira.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         var numeroDeCliques = 0

         principalTXT.setOnClickListener {
             numeroDeCliques++
             principalTXT.text = getString(R.string.pamonha_e_muito_bom, numeroDeCliques)
         }
     }
 }