package com.js.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;


/**
 * Demonstrates how to list a context using arguments supplied from
 * sources OTHER THAN the environment parameter to the initial context.
 * Other sources could be:
 * - application resource file (jndi.properties)
 * - system properties (via the -D option to java interpreter).
 *
 * Usage: java AppList (use jndi.properties)
 * Usage: java -Djava.naming.factory.initial=... -D... AppList
 */
public class AppList {

    public static void main(String[] args) {
        String target = "";

        try {
            Context ctx = new InitialContext();

            NamingEnumeration namingEnum = ctx.list(target);
            while (namingEnum.hasMore()) {
                System.out.println(namingEnum.next());
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}