package client.userkt.data.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.sql.Date

@Entity
@Table(name = "client")
data class ClientEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    var name: String,

    @Column(name = "lastname")
    var lastName: String,

    @Column(name="dni_client")
    var dniClient: Long,

    @Column(name = "dnitype")
    var dniType: String,

    @Column(name = "createdat")
    var createdAt: Date,

    @Column(name = "updateat")
    var updatedAt: Date,

    @JsonManagedReference
    @OneToOne(mappedBy = "clientDni", cascade = [CascadeType.ALL])
    val cellPhones: CellPhoneEntity
)