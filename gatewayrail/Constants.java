package com.example.th3_sagittarian.gatewayrail;

public class Constants {

	public static final String FIRST_COLUMN="First";
	public static final String SECOND_COLUMN="Second";

}



   try
                            {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.3/xonex","xonexuser","xonex12345");
                                Statement statement = connection.createStatement();
                                int resultSet = statement.executeUpdate("INSERT INTO `zrecord` (`useradd`, `username`, `nearbyadd`, `nearbyname`) VALUES ( '"+device.getAddress()+"', '"+device.getAddress()+"', '"+device.getAddress()+"', '"+device.getName()+"')");

                            }
                            catch (Exception ex)
                            {

                            }