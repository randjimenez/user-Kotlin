package client.userkt.data.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "client")
data class ClientEntity(

    @Id
    var dniClient: Long,

    var name: String,

    var lastName: String,

    var dniType: String,

    var updateAt: Date,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "dniClient")
    val cellPhones: List<CellPhoneEntity>? = null,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "dniClient")
    val address: List<AddressEntity>? = null
)