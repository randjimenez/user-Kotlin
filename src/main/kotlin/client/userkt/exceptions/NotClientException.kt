package client.userkt.exceptions

import client.userkt.exceptions.enums.FailedResponse

class NotClientException(message: String = FailedResponse.NOT_CLIENT.message) : Exception(message) {
}