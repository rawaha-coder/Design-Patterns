fun main() {
    println("\n*** Facade Patterns Code ***\n")

    val translationManager = TranslationManager()
    translationManager.translate("Some text", Language.English, Language.Italian)
    translationManager.translate("Some text", Language.English, Language.French)

}