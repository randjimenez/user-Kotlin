package client.userkt.exceptions.enums

enum class FailedResponse(val message: String) {
    NOT_CLIENT("Cliente no existe en nuestro sistema"),
    USER_EXIST("Cliente ya existe en el sistema"),
    PHONE_LIST_SIZE("No se puede tener mas de dos celulares asociados")
}