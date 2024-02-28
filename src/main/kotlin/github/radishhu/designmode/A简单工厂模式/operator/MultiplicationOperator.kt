package github.radishhu.designmode.A简单工厂模式.operator

/**
 * Description: 乘法 <br>
 * Date: 2024/2/20 13:22 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class MultiplicationOperator : Operator() {
    override fun operation(numberA: Double, numberB: Double): Double {
        return numberA * numberB
    }
}