package client.userkt.data.dto

data class Address(
    val id: Long = 0,
    val address: String,
    val city: String,
    val longitude: String,
    val latitude: String
)