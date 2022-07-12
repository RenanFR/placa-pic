package br.com.agama.placapic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.agama.placapic.adapter.VehicleEnquiriesListAdapter
import br.com.agama.placapic.databinding.ActivityMyVehicleInquiriesBinding
import br.com.agama.placapic.model.VehicleEnquiryItem
import java.time.LocalDate

class MyVehicleInquiriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyVehicleInquiriesBinding

    private val vehicleEnquiriesListAdapter = VehicleEnquiriesListAdapter(context = this, vehicleEnquiryList = listOf(
        VehicleEnquiryItem(LocalDate.of(2022, 2, 4), "RTN8G99", "Argo 1.0", "Prata"),
        VehicleEnquiryItem(LocalDate.of(1995, 1, 6), "DXX-6994", "A4 1.8 Turbo", "Azul"),
        VehicleEnquiryItem(LocalDate.of(2014, 12, 10), "BUH-5681", "Wraith 6.6 V12 Aut.", "Vermelho")
    ))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyVehicleInquiriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = findViewById<RecyclerView>(R.id.vehicle_enquiries_recyclerview)
        recyclerView.adapter = vehicleEnquiriesListAdapter
    }
}