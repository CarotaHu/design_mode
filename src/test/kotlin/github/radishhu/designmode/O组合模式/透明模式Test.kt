package github.radishhu.designmode.O组合模式

import github.radishhu.designmode.O组合模式.透明模式.Company
import github.radishhu.designmode.O组合模式.透明模式.Department
import github.radishhu.designmode.O组合模式.透明模式.Organization
import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/26 14:17 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class 透明模式Test {


    @Test
    fun 透明模式(){
        val top = Company("顶级组织机构", "0")
        val A = Company("山东正元数字", "1")
        val B = Company("济南正元数字", "2")

        val C = Department("研发中心", "3")
        val D = Department("智慧城市", "4")

        A.add(C)
        A.add(D)

        top.add(A)
        top.add(B)

        show(top)
    }

    fun show(org: Organization) {
        org.show()
        org.childrenList().forEach { each ->
            when (each.type) {
                 0 -> show(each)
                else -> each.show()
            }
        }
    }
}