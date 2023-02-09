package client.userkt.data.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.Date

@Entity(name = "address")
data class AddressEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    var longitude: String = "",

    var latitude: String = "",

    var address: String,

    var enabled: Boolean,

    var deleted: Boolean,

    @Column(name = "createdat")
    var createAt: Date,

    @Column(name = "updateat")
    var updateAt: Date,

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "dniClient", referencedColumnName = "dni_client")
    var clientDni: ClientEntity


) {
}