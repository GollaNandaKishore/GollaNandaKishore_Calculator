package Link;
import java.sql.*;
public class DataLink {
public void connected(double z,double q,String s1,double res)
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		PreparedStatement ps=c.prepareStatement("insert into calc values(?,?,?,?)");
		ps.setInt(1,(int)(z));
		ps.setInt(2,(int)(q));
		ps.setString(3,(s1));
		ps.setInt(4,(int)(res));
		ps.executeUpdate();
		c.close();
		ps.close();
	}
	catch(Exception ae)
	{
		ae.printStackTrace();
	}
}
}
