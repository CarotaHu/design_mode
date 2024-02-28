package github.radishhu.designmode.A简单工厂模式.operator

/**
 * Description: 减法 <br>
 * Date: 2024/2/20 13:21 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class SubtractionOperator : Operator() {
    override fun operation(numberA: Double, numberB: Double): Double {
        return  numberA - numberB
    }
}