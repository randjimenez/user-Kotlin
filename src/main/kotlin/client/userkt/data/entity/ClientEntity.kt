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
    val dniClient: Long,

    val name: String,

    val middleName: String? = null,

    val lastName: String,

    val secondLastName: String? = null,

    val dniType: String,

    val updateAt: Date,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "dniClient")
    val cellPhones: List<CellPhoneEntity>? = null,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "dniClient")
    val address: List<AddressEntity>? = null
)