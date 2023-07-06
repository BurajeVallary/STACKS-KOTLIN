fun main() {
//   val myStack =Stack()
//    myStack.push(5)
//    myStack.push(24)
//    myStack.push(62)
//    println(myStack.peek())
//    println(myStack.pop())
//    println(myStack.peek())
//    myStack.push(41)
//    myStack.push(51)
//    myStack.push(88)
//    val x = myStack.pop()
//    val y = myStack.pop()
//    val z = x!!+ y !!
//    println(z)

    val str = "hello"
    val result= mutableListOf<Char>()
    val stack = Stack()
    str.forEach { c ->stack.push(c)  }
    while (!stack.isEmpty()){
        result.add(stack.pop()!!.toChar())
    }
    println(result.joinToString (""))


}

class Stack{
    var data= mutableListOf<Int>()

    fun push(value: Char){
        data.add(value.code)
    }

    fun pop():Int?{     //pop access the value
        if (data.isEmpty()){
            return  null
        }
        val top = data[data.lastIndex]
        data.removeAt(data.lastIndex)  ///remove removes the element at the specified position
        return top
    }
    fun peek():Int?{
        if (data.isEmpty()){
            return null

        }
        return data[data.lastIndex]

    }
        fun isEmpty():Boolean{
            return data.isEmpty()
        }




}

