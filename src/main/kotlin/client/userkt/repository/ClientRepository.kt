package client.userkt.repository

import client.userkt.data.entity.ClientEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : CrudRepository<ClientEntity, Long> {
    fun findByDniClient(dni: Long): ClientEntity?
    fun findByDniClientAndEnabled(dniClient: Long, enabled: Boolean = true): ClientEntity?
}