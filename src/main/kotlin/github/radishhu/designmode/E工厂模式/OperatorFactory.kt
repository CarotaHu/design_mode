package github.radishhu.designmode.E工厂模式

import github.radishhu.designmode.A简单工厂模式.operator.*

/**
 * Description: 工厂类 <br>
 * Date: 2024/2/21 8:44 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface OperatorFactory {

    /**
     * 创建操作符类
     */
    fun createOperator():Operator

}