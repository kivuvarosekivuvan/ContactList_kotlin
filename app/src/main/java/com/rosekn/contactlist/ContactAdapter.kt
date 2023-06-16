package com.rosekn.contactlist


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rosekn.contactlist.databinding.ActivityMainBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rosekn.contactlist.databinding.ContactListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {

        val binding=
            ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }


//    Binding current item to the view
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
        binding.tvName.text=currentContact.name
        binding.tvPhoneNumber.text = currentContact.number
        binding.tvEmail.text=currentContact.email
        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(300,300)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivAvatar)



    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(var binding: ContactListBinding):RecyclerView.ViewHolder(binding.root)

