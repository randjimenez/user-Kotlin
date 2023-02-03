package client.userkt.service

import client.userkt.data.entity.ClientEntity

interface ClientService {
    fun findUser(dni: Long): ClientEntity
}