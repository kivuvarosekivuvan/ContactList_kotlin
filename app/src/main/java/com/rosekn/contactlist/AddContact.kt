package com.rosekn.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rosekn.contactlist.databinding.ActivityAddContactBinding
import android.widget.Toast
import android.text.TextWatcher
import android.text.Editable
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class AddContact : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clearErrors()

        binding.back.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnSave.setOnClickListener {
            clearErrors()
            if(validatePage()){
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
                Toast.makeText(this, "Hello new contact has been added to your contact list", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_LONG).show()

            }
        }
        binding.etFirstName.addTextChangedListener(createTextWatcher(binding.tvFirstName))
        binding.etLastName.addTextChangedListener(createTextWatcher(binding.tvLastName))
        binding.etMail.addTextChangedListener(createTextWatcher(binding.tvMail))
        binding.etPhone.addTextChangedListener(createTextWatcher(binding.tvPhone))
    }
    private fun createTextWatcher(view:TextInputLayout):TextWatcher {
        return object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validatePage()
            }

            override fun afterTextChanged(s: Editable?) {
                val text = view.editText?.text.toString()
                if(text.isNotEmpty() && !text[0].isUpperCase()){
                    val correct= text.replaceFirstChar{ it.uppercase()}
                    view.editText?.setText(correct)
                    view.editText?.setSelection(correct.length)
                }
            }
        }
    }

    fun validatePage():Boolean {
        val first= binding.tvFirstName.editText?.text.toString().capitalize()
        val last=binding.tvLastName.editText?.text.toString().capitalize()
        val phone=binding.tvPhone.editText?.text.toString()
        val email=binding.tvMail.editText?.text.toString()
        var error=false
        clearErrors()


        if (first.isBlank()) {
            binding.tvFirstName.error = "First name is required"
         error = true
       }


        if (last.isBlank()) {
            binding.tvLastName.error = "Last name is required"
            error = true
        }

        if (phone.isBlank()) {
            binding.tvPhone.error = "Contact is required"
            error = true
        }

        if (email.isBlank()) {
            binding.tvMail.error = "Email is required"
            error = true
        }


        return first.isNotBlank() && last.isNotBlank() && phone.isNotBlank() && email.isNotBlank()
    }



    fun clearErrors() {
        binding.tvFirstName.error = null
        binding.tvLastName.error = null
        binding.tvPhone.error = null
        binding.tvMail.error = null
    }

}

