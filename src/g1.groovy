

	def c1 = { println it }
	def c2 = { text -> println text }
	c1.call("content1") //用call方法调用闭包
	c2("content2") //直接调用闭包
	

