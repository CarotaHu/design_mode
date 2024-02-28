package github.radishhu.designmode.D代理模式

/**
 * Description: 仓库管理员 <br>
 * Date: 2024/2/20 16:35 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class WarehouseKeeper : WarehouseManagement{
    override fun removal() {
        println("出库成功")
    }

    override fun append() {
        println("入库成功")
    }
}