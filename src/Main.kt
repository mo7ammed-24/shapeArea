fun main() {
println(shapeArea(4))
}

fun shapeArea(n: Int)=if(n==1) 1 else ((2*n)*(n-1)+1)