package client.userkt.data.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "cellphone")
data class CellPhoneEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    @Column(name = "cellphone")
    var cellPhone: String,

    @Column(name = "enabled")
    var enabled: Boolean,

    @Column(name = "principal")
    var principal: Boolean,

    @Column(name = "createdat")
    var createAt: Date,

    @Column(name = "updateat")
    var updateAt: Date,

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "dniClient", referencedColumnName = "dni_client")
    var clientDni: ClientEntity

){
}


