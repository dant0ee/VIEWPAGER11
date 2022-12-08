package com.example.myapplication.adapeters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.MeoreFragmenti
import com.example.myapplication.fragments.mesamefragmenti
import com.example.myapplication.fragments.PirveliFragmenti

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if(position==0){
            return PirveliFragmenti
        }else if (position==1){
            return MeoreFragmenti
        }else if (position==2){
            return mesamefragmenti
        }else{
            return Fragment()
        }
    }
}