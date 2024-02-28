package github.radishhu.designmode.A简单工厂模式

import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/20 13:39 <br>
 *
 * @author moon
 * @since 1.0.3
 */

class OperatorSimpleFactoryTest {

    @Test
    fun test(){
        OperatorEnum.entries.asSequence()
            .map(OperatorEnum::ordinal)
            .map(OperatorSimpleFactory::createOperator)
            .forEach{operator->println(operator.operation(1.0,2.0))}
    }

}