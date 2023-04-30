import java.lang.IllegalArgumentException
class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init {
        val a= this.a.toDouble()
        val b= this.b.toDouble()
        val c= this.c.toDouble()
        require(a+b>=c && a+c>=b && c+b>=a) {"Not a valid triangle"}
        require(a>0 && b>0 && c>0) {"Sides need to be positive numbers"}
    }

    val isEquilateral: Boolean = this.a==this.b && this.b==this.c
    val isIsosceles: Boolean = this.a==this.b || this.b==this.c || this.a==this.c
    val isScalene: Boolean = !this.isEquilateral && !this.isIsosceles

}
