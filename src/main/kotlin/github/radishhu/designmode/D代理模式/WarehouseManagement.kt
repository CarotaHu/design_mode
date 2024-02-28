package github.radishhu.designmode.D代理模式

/**
 * Description: 库存管理 <br>
 * Date: 2024/2/20 16:26 <br>
 *
 * @author moon
 * @since 1.0.3
 */
interface WarehouseManagement {
    /**
     * 出库
     */
    fun removal()

    /**
     * 入库
     */
    fun append()

}