package client.userkt.data.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "cellphone")
data class CellPhoneEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    val cellPhone: String,

    val principal: Boolean,

    val dniClient: Long,

    val updateAt: Date = Date(),
){
}