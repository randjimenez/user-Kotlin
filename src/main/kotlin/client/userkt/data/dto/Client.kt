package client.userkt.data.dto

import client.userkt.annotations.CellphoneSize
import client.userkt.data.enums.DniType

data class Client(
    val dni: Long,
    val name: String,
    val middleName: String? = null,
    val lastName: String,
    val secondLastName: String? = null,
    val dniType: DniType,

    @CellphoneSize
    val cellPhones: List<CellPhones>?,
    val address: List<Address>?
)
