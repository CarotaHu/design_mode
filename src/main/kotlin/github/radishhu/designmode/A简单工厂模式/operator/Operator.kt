package github.radishhu.designmode.A简单工厂模式.operator

/**
 * Description: 操作符接口 <br>
 * Date: 2024/2/20 13:18 <br>
 *
 * @author moon
 * @since 1.0.3
 */
abstract class Operator {

    /**
     * 操作
     */
    abstract fun operation(numberA:Double,numberB: Double) : Double

}