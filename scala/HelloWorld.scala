object fuzzer {
	def fizzbuzz(n: Int) {
		var i : Int = 0;
		for (i <- 0 to n) {
			if (i % 3 == 0 || i % 5 == 0) {
				if (i % 3 == 0)
					print(i, "fizz")
				if (i % 5 == 0)
					print(i, "buzz")
				println
			}
		}
	}
}

abstract class Animal {
	var name : String = "Bob";
}

class Goose extends Animal {
	var can_fly : Boolean = false
	def enable_flight() {
		can_fly = true
	}
}

object HelloWorld {
	def main(args: Array[String]) {
		var greeting : String = "Hello!"
		println(greeting)
		fuzzer.fizzbuzz(20);

		var g : Goose = new Goose
		g.enable_flight
		println(g.can_fly, g.name)
	}
}


