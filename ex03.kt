fun main() {
  print("Produto: ")
  val produto = readln()
  print("Preço unitário (ex.: 12.50): ")
  val preco = readln().toDouble()
  print("Quantidade = r4eadln().toInt()

  if (preco < 0 || quantidade <= 0) {
    println("Preço ou quantidade inválidos.")
    return
  }

  val total = preco * quantidade 
        println("Produto: $produto")
        println("Quantidade: $quantidade")
        println("Total: R$ %.2f".format(total))
