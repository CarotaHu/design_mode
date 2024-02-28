package github.radishhu.designmode.F原型模式

/**
 * Description: 简历类 <br>
 * Date: 2024/2/21 9:44 <br>
 *
 * @author moon
 * @since 1.0.3
 */
data class Vita(var name: String, var age: Int, var school:String) {

    fun show(){
        println("${name}，${age}岁，毕业于${school}")
    }

}