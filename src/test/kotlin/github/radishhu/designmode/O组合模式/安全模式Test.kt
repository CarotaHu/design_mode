package github.radishhu.designmode.O组合模式

import github.radishhu.designmode.O组合模式.安全模式.Company
import github.radishhu.designmode.O组合模式.安全模式.Department
import org.junit.jupiter.api.Test

/**
 * Description:  <br>
 * Date: 2024/2/26 13:59 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class 安全模式Test {

    @Test
    fun 安全模式测试() {
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

    fun show(company: Company) {
        company.show()
        company.childList.forEach { each ->
            when (each) {
                is Company -> show(each)
                else -> each.show()
            }
        }
    }

}