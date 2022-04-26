package com.hesapp.hesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.hesapp.hesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.menu.getItem(2).isEnabled = false


        val Navhost = supportFragmentManager.findFragmentById(R.id.main_fragment) as NavHostFragment
        val navController = Navhost.navController


        setupWithNavController(binding.bottomNavigationView,navController)

        val cart = CartFragment()
        val payment = PaymentFragment()
        val profile = ProfileFragment()
        val menu = MenuFragment()






    }
}