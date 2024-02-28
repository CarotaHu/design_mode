package github.radishhu.designmode.B策略模式

import github.radishhu.designmode.A简单工厂模式.operator.Operator

/**
 * Description: 策略模式类 <br>
 * Date: 2024/2/20 14:42 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class OperatorContext private constructor(private val operator: Operator) {

    companion object {
        /**
         * 获取当前对象
         */
        fun getContext(operator: Operator): OperatorContext {
            return OperatorContext(operator)
        }
    }

    /**
     * 获取计算结果
     */
    fun getResult(numberA: Double, numberB: Double): Double {
        return operator.operation(numberA, numberB)
    }
}