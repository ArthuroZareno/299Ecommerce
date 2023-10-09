package com.example.a299ecom

import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.a299ecom.databinding.ActivityShoppingBinding

class ShoppingActivity: Fragment(R.layout.activity_shopping) {

    val binding by lazy {
        ActivityShoppingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = findNavController()
        binding.bottomNavigation.setupWithNavController(navController)
        
    }

    private fun setContentView(root: ConstraintLayout) {
        TODO("Not yet implemented")
    }

}