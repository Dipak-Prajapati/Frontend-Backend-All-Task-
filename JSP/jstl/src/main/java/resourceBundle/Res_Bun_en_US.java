package resourceBundle;

import java.util.ListResourceBundle;

public class Res_Bun_en_US extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return new Object[][] {
			{"count.k1","Hello!"},
			{"count.k2","How Are You? ... {0}"},
			{"count.k3","I am Good...{0}"},
			{"count.k4","BYE.."},
		};
	}
}
