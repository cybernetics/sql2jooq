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
public class SakilaTest0026 extends MySQLTest
{

	@Test
	public void test() throws Exception 
	{
		String sql = "select count(*) c from actor where first_name is not null";
		
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
Field c = DSL.count(  ).as("c");

Result result = create.select( c )
	.from( Actor.ACTOR )
	.where( ((Field)Actor.ACTOR.FIRST_NAME).isNotNull(  ) ).fetch( );

		return result;
	}
}
