package books;

public class booklist {

		public String ISBN;
		public String Title;
		public String AuthorID;
		public String Publisher;
		public String PublishDate;
		public float Price;	
		public  booklist(String ISBN,String Title,String AuthorID,String Publisher,String PublishDate,float Price)
		{
			this.ISBN = ISBN;
			this.Title = Title;
			this.AuthorID = AuthorID;
			this.Publisher = Publisher;
			this.PublishDate = PublishDate;
			this.Price = Price;
		}
		
	}

