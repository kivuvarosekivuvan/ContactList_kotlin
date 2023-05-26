package com.rosekn.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rosekn.contactlist.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        displayName()
    }
    fun displayName(){
        val contact1=ContactData("","Rose Kivuva","071565232", "@rosekivuvagmail.com")
        val contact2=ContactData("","Mary Mumo","0732521722", "@maryyyshegmail.com")
        val contact3=ContactData("","Rebecca Nangila","0743521722", "@rebaccashgmail.com")
        val contact4=ContactData("","Mjera Eunice","0732521563", "@kongoogamail.com")
        val contact5=ContactData("","Pauline Ochieng","0767521722", "@ochienggmail.com")
        val contact6=ContactData("","Kazungu Grace","0732662722", "@kazugushgmail.com")
        val contact7=ContactData("","Idaya Mzee","0798621722", "@idayamzeegmail.com")
        val contact8=ContactData("","Faith Gisemba","0712421722", "@gisembafaithgmail.com")
        val contact9=ContactData("","Lilian Kanywa","07982172256", "@liliyygmail.com")
        val contact10=ContactData("","Kanini Kaseo","0732722172", "@kaninikaseogmail.com")
        val contact11=ContactData("","Nkatha Milka","0792167220", "@kongoogmail.com")
        val contact12=ContactData("","Mercy Cheptoo","07332561989", "@mmgmail.com")
        val contact13=ContactData("","Henriete Oloo","07872521421", "@henoloogmail.com")
        val contact14=ContactData("","Rachael Rwanda","0732326511", "@krachaeellgmail.com")
        val contact15=ContactData("","Aniso Kilas","0799991255", "@kilasanisogmail.com")
        val contact16=ContactData("","Zeray Rediet","0732541234", "@redietgmail.com")
        val contact17=ContactData("","Janet Museo","07862555571", "@janetmusembigmail.com")
        val contact18=ContactData("","Amos Musau","0732521722", "@kongoo.apple.com")


        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14,contact15,contact16,contact17,contact18)
        val cntAdapter = ContactAdapter(contactList)
        binding.rvContact.layoutManager= LinearLayoutManager(this)
        binding.rvContact.adapter =cntAdapter
    }
}


