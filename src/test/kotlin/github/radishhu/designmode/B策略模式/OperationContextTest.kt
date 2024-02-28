package github.radishhu.designmode.B策略模式

import github.radishhu.designmode.A简单工厂模式.OperatorEnum
import github.radishhu.designmode.A简单工厂模式.OperatorSimpleFactory
import org.junit.jupiter.api.Test

/**
 * Description: 策略模式测试类 <br>
 * Date: 2024/2/20 15:06 <br>
 *  普通策略模式比策略+简单工厂模式多了一步手动创建对象的工作<br>
 *  简单工厂模式和策略模式对比:简单工厂模式创建的是Operator对象,需要手动调用operator(A,B)方法.策略模式会创建Context并引用一个Operator对象,调用getResult(A,B)方法即可
 * @author moon
 * @since 1.0.3
 */
class OperationContextTest {

    @Test
    fun operatorContextTest() {
        OperatorEnum.entries.asSequence()
            .map(OperatorEnum::ordinal) // 为了写着方便,使用了简单工厂,实际应该是手动new对象
            .map(OperatorSimpleFactory::createOperator)
            .map(OperatorContext::getContext)
            .forEach { context-> println(context.getResult(1.0,2.0)) }
    }

    @Test
    fun operatorSimpleFactoryTest() {
        OperatorEnum.entries.asSequence()
            .map(OperatorEnum::ordinal)
            .map(OperatorSimpleFactoryContext::getContext)
            .forEach { context-> println(context.getResult(1.0,2.0)) }
    }

}