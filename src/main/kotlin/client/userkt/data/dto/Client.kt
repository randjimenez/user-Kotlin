package client.userkt.data.dto

import client.userkt.data.enums.DniType

data class Client(
    val dni: Long,
    val name: String,
    val lastName: String,
    val dniType: DniType,
    val cellPhones: List<CellPhones>,
    val address: List<Address>
)
