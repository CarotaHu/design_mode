package github.radishhu.designmode.D代理模式

/**
 * Description: 仓库管理系统 <br>
 * Date: 2024/2/20 16:36 <br>
 * 代理WarehouseKeeper出入库操作
 * @author moon
 * @since 1.0.3
 */
class WarehouseManagementSystem(val management: WarehouseManagement, var number :Int) : WarehouseManagement {

    override fun removal() {
        if (number<=0){
            println("出库失败，当前库存为0")
            return
        }
        number-=1
        management.removal()
    }

    override fun append() {
        number+=1
        management.append()
    }



}