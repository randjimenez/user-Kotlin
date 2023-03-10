package client.userkt.service

import client.userkt.data.entity.ClientEntity

interface ClientService {
    fun findClient(dni: Long): ClientEntity
    fun createClient(client: ClientEntity): ClientEntity
    fun updateClient(client: ClientEntity): ClientEntity
    fun deleteClient(dni: Long)
}