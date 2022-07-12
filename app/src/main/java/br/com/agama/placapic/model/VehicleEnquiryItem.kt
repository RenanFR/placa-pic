package br.com.agama.placapic.model

import java.time.LocalDate

data class VehicleEnquiryItem(
    val enquiryDate: LocalDate,
    var licensePlate: String,
    var model: String,
    var colour: String
)
