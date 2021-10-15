import kotlin.math.roundToInt

fun main() {
    val subscription = false
    val totalAmountOfBuy = 12000f
    val buyForAmountOf = 2597f
    val discount = if (totalAmountOfBuy in 0f..1000f) {
        return
    } else if (totalAmountOfBuy in 1001f..10000f) {
        100f
    } else {
        (5 * buyForAmountOf) / 100
    }
    val subscriptionDiscount = if (subscription == true) {
        (1 * discount) / 100
    } else {
        0f
    }
    val resultDiscount = discount + subscriptionDiscount
    val roundToHundredths = ((resultDiscount * 100.0).roundToInt() / 100.0)
    val integerDiscount = roundToHundredths.toLong()
    val fractionalDiscount = ((roundToHundredths % 1) * 100).toLong()
    println("Ваша скидка составит: $integerDiscount рублей $fractionalDiscount копеек")
    val resultPrice = buyForAmountOf - roundToHundredths
    val integerPrice = resultPrice.toLong()
    val fractionalPrice = ((resultPrice % 1) * 100).toLong()
    println("Сумма к оплате: $integerPrice рублей $fractionalPrice копеек")
}