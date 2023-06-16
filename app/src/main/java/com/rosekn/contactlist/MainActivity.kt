package com.rosekn.contactlist

import android.content.Intent
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
        binding.floating.setOnClickListener {
            var intent=Intent(this,AddContact::class.java)
            startActivity(intent)
        }
        displayName()
    }
    fun displayName(){
        val contact1=ContactData("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Rose Kivuva","071565232", "@rosekivuvagmail.com")
        val contact2=ContactData("https://media.istockphoto.com/id/639468584/photo/head-and-shoulders-portrait-of-young-white-businesswoman.webp?s=170667a&w=0&k=20&c=irpHZawakrQ0Y8wULGm4JzsvksFpurm6EwLGdHrRnRE=","Mary Mumo","0732521722", "@maryyyshegmail.com")
        val contact3=ContactData("https://media.istockphoto.com/id/1226202062/photo/caucasian-woman-looking-at-camera.webp?s=170667a&w=0&k=20&c=h9qtrahq7sLa_UYpLtFAN1gsHHOQgt8dJM-F-2NNwnk=","Rebecca Nangila","0743521722", "@rebaccashgmail.com")
        val contact4=ContactData("https://media.istockphoto.com/id/1154903724/photo/beautiful-woman-with-red-lipstick-and-wearing-red-dress-holding-mobile-phone-outside.webp?s=170667a&w=0&k=20&c=7mO37AEsaUVYVOYflKzv_Pd1jsAI5Wj8UJ9N-QhgeqE=","Mjera Eunice","0732521563", "@kongoogamail.com")
        val contact5=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Pauline Ochieng","0767521722", "@ochienggmail.com")
        val contact6=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Kazungu Grace","0732662722", "@kazugushgmail.com")
        val contact7=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Idaya Mzee","0798621722", "@idayamzeegmail.com")
        val contact8=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Faith Gisemba","0712421722", "@gisembafaithgmail.com")
        val contact9=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Lilian Kanywa","07982172256", "@liliyygmail.com")
        val contact10=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Kanini Kaseo","0732722172", "@kaninikaseogmail.com")
        val contact11=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Nkatha Milka","0792167220", "@kongoogmail.com")
        val contact12=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Mercy Cheptoo","07332561989", "@mmgmail.com")
        val contact13=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Henriete Oloo","07872521421", "@henoloogmail.com")
        val contact14=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Rachael Rwanda","0732326511", "@krachaeellgmail.com")
        val contact15=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Aniso Kilas","0799991255", "@kilasanisogmail.com")
        val contact16=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Zeray Rediet","0732541234", "@redietgmail.com")
        val contact17=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Janet Museo","07862555571", "@janetmusembigmail.com")
        val contact18=ContactData("https://media.istockphoto.com/id/1226202036/photo/caucasian-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=HJoPusHSS27XkqJlueK4z4LDyDbSMzIsnG8V-9bE2MY=","Amos Musau","0732521722", "@kongoo.apple.com")


        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14,contact15,contact16,contact17,contact18)
        val cntAdapter = ContactAdapter(contactList)
        binding.rvContact.layoutManager= LinearLayoutManager(this)
        binding.rvContact.adapter =cntAdapter
    }
}


