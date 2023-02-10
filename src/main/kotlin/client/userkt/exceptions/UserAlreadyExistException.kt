package client.userkt.exceptions

import client.userkt.exceptions.enums.FailedResponse

class UserAlreadyExistException(message: String = FailedResponse.USER_EXIST.message) : Exception(message) {
}