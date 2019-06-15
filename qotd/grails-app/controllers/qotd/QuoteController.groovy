package qotd

class QuoteController {

	/* 'scaffold' diimplementasikan secara dinamis
	 tindakan pengontrol dan tampilan untuk hal-hal umum
	 yang ingin Anda lakukan saat menambahkan Tindakan CRUD untuk model data.*/

	static defaultAction = "home"
	static scaffold = true

	def quoteService

	def home() {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}

	def random() {
		def randomQuote = quoteService.getRandomQuote()
		[quote: randomQuote]
	}

	def ajaxRandom() {
		def randomQuote = quoteService.getRandomQuote()
		render {
			q(randomQuote.content)
			p(randomQuote.author)
		}
	}

	def getStaticQuote() {
		def staticAuthor = "Anonymous"
		def staticQuote = quoteService.getStaticQuote()
		[ quote : staticQuote]

		/* [] => Cara 'controller' menyampaikan informasi ke 'views' 
		 * :  => Menandakan bahwa 'key' dan 'value' */
	}
}
