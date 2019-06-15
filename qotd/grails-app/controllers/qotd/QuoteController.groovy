package qotd

class QuoteController {

	static defaultAction = "home"

	def quoteService

	def home() {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}

	def random() {
		def randomQuote = quoteService.getRandomQuote()
		[quote: randomQuote]
	}

	def getStaticQuote() {
		def staticAuthor = "Anonymous"
		def staticQuote = quoteService.getStaticQuote()
		[ quote : staticQuote]

		/* [] => Cara 'controller' menyampaikan informasi ke 'views' 
		 * :  => Menandakan bahwa 'key' dan 'value' */
	}
}
