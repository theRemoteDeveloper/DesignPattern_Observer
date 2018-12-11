
public class Main {

	public static void main(String[] args) {

		NewsAgency observable = new NewsAgency();
		
		NewsChannel observer1 = new NewsChannel();
		NewsChannel observer2 = new NewsChannel();
		
		observer1.setNews("News_observer1");
		observer2.setNews("News_observer2");
		
		System.out.println(observer1.getNews());
		System.out.println(observer2.getNews());
		
		observable.addObserver(observer1);
		observable.addObserver(observer2);
		
		observable.setNews("News_common");
		
		System.out.println(observer1.getNews());
		System.out.println(observer2.getNews());

	}
}
