package com.example.a299ecom.fragment.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a299ecom.R
import com.example.a299ecom.addapters.HomeViewPagerAddapter
import com.example.a299ecom.databinding.FragmentHomeBinding
import com.example.a299ecom.fragment.categories.KidsFragment
import com.example.a299ecom.fragment.categories.MainCategory
import com.example.a299ecom.fragment.categories.MenFragment
import com.example.a299ecom.fragment.categories.WomenFragment
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf<Fragment>(
            MainCategory(),
            MenFragment(),
            WomenFragment(),
            KidsFragment()
        )

        val viewPager2Adapter = HomeViewPagerAddapter(categoriesFragments,childFragmentManager,lifecycle)
        binding.viewpagerhome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerhome) { tab, position ->
            when (position) {
                0 -> tab.text = "Main"
                1 -> tab.text = "Men"
                2 -> tab.text = "Women"
                3 -> tab.text = "Kids"
            }

        }.attach()

    }

}