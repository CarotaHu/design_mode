package github.radishhu.designmode.O组合模式.透明模式

/**
 * Description:  <br>
 * Date: 2024/2/26 14:12 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Department(override var name: String, override var code: String) :Organization {

    override val type = 1

    override fun show() {
        println("部门: $name, 编码: $code")
    }

    @Deprecated(message = "当前方法已过期", level = DeprecationLevel.ERROR)
    override fun add(organization: Organization) {

    }

    @Deprecated(message = "当前方法已过期", level = DeprecationLevel.ERROR)
    override fun remove(organization: Organization) {

    }

    @Deprecated(message = "当前方法已过期", level = DeprecationLevel.ERROR)
    override fun childrenList(): ArrayList<Organization> {
        return ArrayList()
    }
}