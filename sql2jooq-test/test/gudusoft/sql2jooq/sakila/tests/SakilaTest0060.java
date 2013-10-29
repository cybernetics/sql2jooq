package gudusoft.sql2jooq.sakila.tests;

import static org.jooq.impl.DSL.*;
import static org.junit.Assert.*;
import static gudusoft.sakila.Tables.*;

import java.sql.*;

import org.jooq.*;
import org.jooq.impl.*;
import org.junit.*;

import gudusoft.sakila.tables.*;
import gudusoft.sql2jooq.sakila.MySQLTest;

/**
 * @author Lukas Eder
 */
@SuppressWarnings({ "unchecked", "rawtypes", "unused", "all" })
public class SakilaTest0060 extends MySQLTest
{

	@Test
	public void test() throws Exception 
	{
		String sql = "select nullif(1, 2) a, nullif(1, 1) b;";
		
		if (sql.toLowerCase().startsWith("select")) 
		{
			assertSame(ctx.fetch(sql), generatedSQL(conn));
		}
		else 
		{
			throw new UnsupportedOperationException("DML is not yet supported");
		}
	}
	
	private static Result generatedSQL( Connection conn )
	{
		DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
Field a = DSL.nullif( DSL.inline( 1 ), DSL.inline( 2 ) ).as("a");
Field b = DSL.nullif( DSL.inline( 1 ), DSL.inline( 1 ) ).as("b");

Result result = create.select( a, b ).fetch( );

		return result;
	}
}