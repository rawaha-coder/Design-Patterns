data class Mail(val to: String,
                var title: String = "",
                var message: String = "",
                var cc: List<String> = listOf(),
                var bcc: List<String> = listOf(),
                var attachments: List<java.io.File> = listOf())