package client.userkt.service.impl

import client.userkt.data.entity.ClientEntity
import client.userkt.exceptions.NotClientException
import client.userkt.exceptions.UserAlreadyExistException
import client.userkt.repository.ClientRepository
import client.userkt.service.ClientService
import org.springframework.stereotype.Service


@Service
class ClientServiceImpl(val clientRepository: ClientRepository) : ClientService {

    override fun findClient(dni: Long): ClientEntity {
        val client: ClientEntity? = clientRepository.findByDniClientAndEnabled(dni)
        if (client != null) {
            return client
        } else {
            throw NotClientException()
        }
    }

    override fun createClient(client: ClientEntity): ClientEntity {
        val clientExist: ClientEntity? = clientRepository.findByDniClient(client.dniClient)
        if (clientExist == null) {
            return clientRepository.save(client)
        } else {
            throw UserAlreadyExistException()
        }
    }

    override fun updateClient(client: ClientEntity): ClientEntity {
        clientRepository.findByDniClientAndEnabled(client.dniClient) ?: throw NotClientException()
        return clientRepository.save(client)
    }

    override fun deleteClient(dni: Long) {
        val client = clientRepository.findByDniClient(dni)
        if (client != null) {
            client.enabled = false
            clientRepository.save(client)
        }
    }
}