package br.com.agama.placapic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.agama.placapic.databinding.ActivityMyVehicleInquiriesBinding
import br.com.agama.placapic.databinding.ActivityNewVehicleEnquiryByImageBinding

class NewVehicleEnquiryByImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewVehicleEnquiryByImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewVehicleEnquiryByImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}