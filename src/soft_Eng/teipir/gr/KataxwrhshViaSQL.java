package soft_Eng.teipir.gr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class KataxwrhshViaSQL {

	int kid, etos, emv;
	String eggr, location, eidos, orof, ypnodwmatia, mpania;
	int check3 = 0;

	public void regKataxwr(final int kid, final String eggr,
			final String location, final int eidos, final int emv,
			final String orof, final int etos, final String ypnodwmatia,
			final String mpania) {

		PreparedStatement pst = null;
		Connection conn = null;
		PreparedStatement stmt = null;

		final String url = "jdbc:mysql://localhost:3306/test";
		final String user = "alex";
		final String password = "";
		try {
			conn = DriverManager.getConnection(url, user, password);
			String name = "";
			stmt = conn.prepareStatement("Insert into kataxwrhseis VALUES("
					+ kid + "," + eggr + "," + location + "," + eidos + ""
					+ "," + emv + "," + orof + "," + etos + "," + ypnodwmatia
					+ "," + mpania + ",?,now());");
			stmt.setString(1, name);
			stmt.executeUpdate();
			check3 = 1;

		} catch (SQLException ex) {
			final JPanel panel = new JPanel();
			JOptionPane.showMessageDialog(panel,
					"This username does not exist.Please try again", "Error",
					JOptionPane.ERROR_MESSAGE);

		} finally {
			try {

				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException ex) {

			}

		}
	}

}
