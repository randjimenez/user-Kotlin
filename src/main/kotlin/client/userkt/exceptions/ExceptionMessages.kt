package client.userkt.exceptions

enum class ExceptionMessages(val message: String) {
    NOT_CLIENT("Client doesn't exist in data base"),
    USER_EXIST("Client already exist in our system")
}