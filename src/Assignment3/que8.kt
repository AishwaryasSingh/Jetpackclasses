package Assignment3
fun main() {
    try {
        println(login("aishwarya", "ashh"))
    } catch (e: LoginFailedException) {
        println("Error: ${e.message}")
    }
}
class LoginFailedException(message: String) : Exception(message)
@Throws(LoginFailedException::class)
fun login(username: String, password: String): String {
    if (username != "aishwarya" || password != "123") {
        throw LoginFailedException("Login failed for user '$username'")
    }
    return "Welcome, dear $username!"
}

