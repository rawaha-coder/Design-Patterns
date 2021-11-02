fun main() {
    println("\n*** Adapter pattern Code ***\n")

    cellPhone(
        charger(
            powerOutlet().toEUPlug()
        ).toUsbTypeC()
    )
}

interface UsbTypeC
interface UsbMini
interface EUPlug
interface USPlug

fun powerOutlet() : USPlug {
    println("Power outlet is ready")
    return object : USPlug {}
}

fun charger(plug: EUPlug) : UsbMini {
    println("Plug charge into power outlet")
    return object : UsbMini {}
}

fun cellPhone(chargeCable: UsbTypeC) {
    println("Cell Phone charging...")
}

fun USPlug.toEUPlug() : EUPlug {
    return object : EUPlug {
        // Do something to convert
        init {
            println("Convert USPlug to EUPlug")
        }
    }
}

fun UsbMini.toUsbTypeC() : UsbTypeC {
    return object : UsbTypeC {
        // Do something to convert
        init {
            println("Convert UsbMini to UsbTypeC")
        }
    }
}