import org.apache.spark.mllib.linalg.{SparseMatrix, DenseMatrix}

  val chars = List(
    " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
    "u", "v", "w", "x", "y", "z", "ñ", ".", "?", "!", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
  )

 val a = "Hhello my name is".map(f => chars.indexOf(f.toString.toLowerCase))
val max =140

println(chars.length)

(0 to a.length).toArray++Array.fill(max-a.length)(a.length)

val secu= a.toArray++Array.fill(max-a.length)(0)
secu.length

val ones =Array.fill(chars.length)(1)
ones.length

val sm = new SparseMatrix(max,
  chars.length,
  (0 to a.length).toArray++Array.fill(max-a.length)(a.length),
  a.toArray,
  Array.fill(a.length)(1),
  isTransposed = true)

sm.toDense


val botSaysMatrix = new DenseMatrix(max,chars.length,sm.toArray)



val b =botSaysMatrix.toSparse.transpose



/*
b.toString()


"(djas(sak".map(f => println(f.equals('(')))

val ind = "8,jas,(s,ak".substring(0,"8,jas,(s,ak".indexOf(",")).toInt

var dummyList = chars.slice(ind,ind+1)
val indxe = 8
var answer = ""


answer + chars.slice(ind, ind+1).apply(0)

println(answer)


def parseBot(rawmessage:String,answer:String):String={
  if (rawmessage.tail.isEmpty) {
    return answer
  }
  if (rawmessage.head.equals('(')) {
    val index = rawmessage.tail.substring(0,rawmessage.tail.indexOf(",")).toInt
    parseBot(rawmessage.tail, answer + chars.slice(index, index+1).apply(0))
  }
  else {
    parseBot(rawmessage.tail,answer)
  }
}
*/


