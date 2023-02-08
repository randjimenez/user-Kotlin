package client.userkt.data.dto

import client.userkt.data.entity.CellPhoneEntity
import client.userkt.data.enums.DniType

data class Client(
    val dni: Long,
    val name: String,
    val lastName: String,
    val dniType: DniType,
    val cellPhone: CellPhoneEntity?
)
