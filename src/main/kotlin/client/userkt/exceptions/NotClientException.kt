package client.userkt.exceptions

class NotClientException(message: String = ExceptionMessages.NOT_CLIENT.message) : Exception(message) {
}