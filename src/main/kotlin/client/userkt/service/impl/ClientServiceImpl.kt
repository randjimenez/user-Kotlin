package client.userkt.service.impl

import client.userkt.data.entity.ClientEntity
import client.userkt.exceptions.NotClientException
import client.userkt.repository.ClientRepository
import client.userkt.service.ClientService
import org.springframework.stereotype.Service


@Service
class ClientServiceImpl(val clientRepository: ClientRepository) : ClientService {

    override fun findUser(dni: Long): ClientEntity {
        val client: ClientEntity? = clientRepository.findByDni(dni)
        if (client != null) {
            return client
        } else {
            throw NotClientException()
        }
    }
}