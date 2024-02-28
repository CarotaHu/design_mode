package github.radishhu.designmode.H外观模式

/**
 * Description: 外观类 <br>
 * Date: 2024/2/21 10:15 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class Facade {

    /**
     * 面试
     */
    fun interview(){
        val receptionist = Receptionist()
        receptionist.reception()
        receptionist.inform()
        val projectManager = ProjectManager()
        projectManager.interview()
    }

    /**
     * 上班
     */
    fun work(){
        ProjectManager().arrange()
    }

}