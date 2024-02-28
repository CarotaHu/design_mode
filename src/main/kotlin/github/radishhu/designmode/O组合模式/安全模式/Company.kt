package github.radishhu.designmode.O组合模式.安全模式

import com.sun.org.apache.xpath.internal.operations.Or

/**
 * Description: 公司 <br>
 * Date: 2024/2/26 10:13 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Company(override var name: String, override var code: String) : Organization{

    val childList = ArrayList<Organization>()

    fun add(organization: Organization) {
        childList.add(organization)
    }

    fun remove(organization: Organization) {
        childList.remove(organization)
    }

    override fun show() {
        println("组织结构: $name, 编码: $code")
    }

}