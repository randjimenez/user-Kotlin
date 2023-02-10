package client.userkt.data.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.Date

@Entity(name = "address")
data class AddressEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    val address: String,

    val city: String,

    val longitude: String,

    val latitude: String,

    val dniClient: Long,

    val updateAt: Date = Date(),

    ) {
}