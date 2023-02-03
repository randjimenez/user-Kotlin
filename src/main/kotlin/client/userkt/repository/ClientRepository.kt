package client.userkt.repository

import client.userkt.data.entity.ClientEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : CrudRepository<ClientEntity, Long> {
    fun findByDni(dni: Long): ClientEntity?
}