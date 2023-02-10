package client.userkt.exceptions

class UserAlreadyExistException(message: String = ExceptionMessages.USER_EXIST.message) : Exception(message) {
}