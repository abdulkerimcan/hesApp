package com.hesapp.hesapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.airbnb.lottie.LottieAnimationView
import com.hesapp.hesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bottomNavigationView.background = null



        val navController = findNavController(R.id.main_fragment)
        val bottomNavView = binding.bottomNavigationView
        bottomNavView.setupWithNavController(navController)

        binding.fab.setOnClickListener {
            val intent = Intent(this,CodeScanActivity::class.java)
            startActivity(intent)
        }
    }
}