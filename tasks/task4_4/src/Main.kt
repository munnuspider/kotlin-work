// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size < 3) {
        println("Missing temperature values")
        exitProcess(1)
    }
    var minTempCelsius = args[0].toFloat()
    val maxTempCelsius = args[1].toFloat()
    val increment = args[2].toFloat()

    while (minTempCelsius <= maxTempCelsius) {
        val fahrenheit = (minTempCelsius*1.8f) + 32f
        println("%.1f C = %.1f F".format(minTempCelsius, fahrenheit))
        minTempCelsius += increment
    }
}
