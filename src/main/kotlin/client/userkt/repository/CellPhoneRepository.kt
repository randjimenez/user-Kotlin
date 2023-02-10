package client.userkt.repository

import client.userkt.data.entity.CellPhoneEntity
import org.springframework.data.repository.CrudRepository

interface CellPhoneRepository : CrudRepository<CellPhoneEntity, Long> {
}