package br.com.agama.placapic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.agama.placapic.R
import br.com.agama.placapic.model.VehicleEnquiryItem
import java.time.format.DateTimeFormatter.ofPattern

class VehicleEnquiriesListAdapter(
    private val context: Context,
    vehicleEnquiryList: List<VehicleEnquiryItem>
): RecyclerView.Adapter<VehicleEnquiriesListAdapter.VehicleEnquiryItemViewHolder>() {

    private val enquiryList = vehicleEnquiryList.toMutableList()

    class VehicleEnquiryItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun attachEnquiryObjectToViewFields(item: VehicleEnquiryItem) {
            itemView.findViewById<TextView>(R.id.vehicle_inquiry_item_model).text = item.model
            itemView.findViewById<TextView>(R.id.vehicle_inquiry_item_color).text = item.colour
            itemView.findViewById<TextView>(R.id.vehicle_inquiry_item_date).text = item.enquiryDate.format(ofPattern("dd/MM/yyyy"))
            itemView.findViewById<TextView>(R.id.vehicle_inquiry_item_license_plate).text = item.licensePlate
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VehicleEnquiryItemViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val listView = layoutInflater.inflate(R.layout.vehicle_inquiry_item, parent, false)
        return VehicleEnquiryItemViewHolder(listView)
    }

    override fun onBindViewHolder(holder: VehicleEnquiryItemViewHolder, position: Int) {
        val vehicleEnquiry = enquiryList[position]
        holder.attachEnquiryObjectToViewFields(vehicleEnquiry)
    }

    override fun getItemCount(): Int = enquiryList.size

}