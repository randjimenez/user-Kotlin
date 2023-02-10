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

    var longitude: String = "",

    var latitude: String = "",

    var address: String,

    var dniClient: Long,

    var updateAt: Date = Date(),

    ) {
}