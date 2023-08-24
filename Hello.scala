#Object-oriented code
object HelloWorld {
 def main(args: Array[String]): Unit = {
 println("Hello, world!")
 println("Scala language: "+util.Properties.versionString)
 }
}

#Functional code
object Hello extends App {
 println("Hello, world")
 println("Scala language: "+util.Properties.versionString)
}
