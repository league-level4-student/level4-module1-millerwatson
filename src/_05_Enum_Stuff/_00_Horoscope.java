package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public void giveHoroscope(Zodiac z) {
		
		switch(z) {
			case ARIES:
			case TAURUS:
			case GEMINI:
				JOptionPane.showMessageDialog(null, "You could feel like a millionaire today, Aries. Money matters seem to surpass your expectations. You might want to spend time fixing up your home or perhaps shopping for yourself. Do you have plans to video chat tonight? A sexy new item might make your friend's eyes pop! Increased self-confidence adds even more juice to an already enhanced appearance. Dress in your favorite colors and have fun.");
				break;
			case CANCER:
			case LEO:
			case VIRGO:
			case LIBRA:
				JOptionPane.showMessageDialog(null, "Someone you've never met before who you find exceedingly attractive could pass you today. You might decide to go say hello and discover not only a physical attraction but an intellectual compatibility as well. Your feelings are probably reciprocated! If you're single, this attraction might be worth pursuing. If you're involved, at least you might make a new friend.");
				break;
			case SCORPIO:
			case SAGITTARIUS:
			case CAPRICORN:
			case AQUARIUS:
			case PISCES:
				JOptionPane.showMessageDialog(null, "Today you may be asked to speak to a virtual gathering or lead an online discussion group, Aquarius. You tend to be shy, but today you'll be all for it and enjoy being in the limelight, albeit temporarily. You'll certainly shine, and others may pay you sincere compliments. After the event, enjoy the rest of your day. You earned it.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "when were you born then");
		}
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope h = new _00_Horoscope();
		Zodiac z = Zodiac.GEMINI;
		h.giveHoroscope(z);
	}
	
}
