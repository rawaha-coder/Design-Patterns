fun main(args: Array<String>) {
    println("\n*** Builder Pattern Code***\n")

    println("\n*** build with default values ***\n")
    val mail1 = Mail("one@recepient.org", "Hi", "How are you")
    printMail(mail1)

    println("\n*** build with apply function ***\n")
    val mail2 = Mail("one@company.org").apply {
        title = "Bonjour"
        message = "How you been"
    }
    printMail(mail2)

    println("\n*** build with named arguments ***\n")
    val mail3 = Mail(to = "one@recepient.org", message = "How are you", title = "Hi", )
    printMail(mail3)

    println("\n*** build with setters ***\n")
    val mail4 = Mail("manager@company.com")
    mail4.title = "Bing"
    mail4.cc = listOf<String>()
    printMail(mail4)
}

fun printMail(mail1: Mail) {
    println("Email: ${mail1.to}")
    println("Title: ${mail1.title}")
    println("Message: ${mail1.message}")
    println("CC: ${mail1.cc}")
    println("BCC: ${mail1.bcc}")
    println("attachments: ${mail1.attachments}")
}




