package github.radishhu.designmode.O组合模式.透明模式


/**
 * Description: 公司 <br>
 * Date: 2024/2/26 10:13 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Company(override var name: String, override var code: String) : Organization{

    override val type = 0

    val childList = ArrayList<Organization>()

    override fun add(organization: Organization) {
        childList.add(organization)
    }

    override fun remove(organization: Organization) {
        childList.remove(organization)
    }

    override fun childrenList(): ArrayList<Organization> {
        return childList
    }

    override fun show() {
        println("组织结构: $name, 编码: $code")
    }


}