package github.radishhu.designmode.R桥梁or桥接模式

/**
 * Description:  <br>
 * Date: 2024/2/26 15:02 <br>
 *
 * @author moon
 * @since 1.0.3
 */
class CircleBrush(val color: Color): Brush(color) {
    override fun drow() {
        println("画了一个 ${color.fill()} 的圆")
    }
}