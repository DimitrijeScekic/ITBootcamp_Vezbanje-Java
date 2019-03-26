package interfejs;

//Napisati program koji iz baze podataka Banka.db ispisuje sve filijale, kao i naziv mesta gde se nalaze. 

import java.sql.*;

public class DBBanka2 {

	String connectionString;

	public DBBanka2(String connectionString) {
		this.connectionString = connectionString;
	}

	public void printNameAdress() throws SQLException {

		try (Connection connection = DriverManager.getConnection(connectionString);
				Statement statement = connection.createStatement()) {
			final ResultSet resultSet = statement.executeQuery(

					"SELECT Filijala.Naziv as Filijala , Mesto.Naziv as Mesto FROM Filijala INNER JOIN Mesto on Filijala.IdMes = Mesto.IdMes");

			while (resultSet.next()) {
				
				String nazivFilijale = resultSet.getString(1);
				String nazivMesta = resultSet.getString(2);
				System.out.println(nazivFilijale + "\t" + nazivMesta);
			}
		}
	}
}
