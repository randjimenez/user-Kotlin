package client.userkt.data.entity

import jakarta.persistence.*
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
    var dni: Long,

    @Column(name = "dnitype")
    var dniType: String,

    @Column(name = "createdat")
    var createdAt: Date,

    @Column(name = "updateat")
    var updatedAt: Date
)