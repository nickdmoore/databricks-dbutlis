// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.backend.daemon.dbutils;

import scala.reflect.ScalaSignature;
import org.apache.spark.sql.catalyst.DefinedByConstructorParams;

@ScalaSignature(bytes = "\u0006\u0001e2A!\u0001\u0002\u0001\u001b\tIqI]1oi&sgm\u001c\u0006\u0003\u0007\u0011\tq\u0001\u001a2vi&d7O\u0003\u0002\u0006\r\u00051A-Y3n_:T!a\u0002\u0005\u0002\u000f\t\f7m[3oI*\u0011\u0011BC\u0001\u000bI\u0006$\u0018M\u0019:jG.\u001c(\"A\u0006\u0002\u0007\r|Wn\u0001\u0001\u0014\u0007\u0001qA\u0003\u0005\u0002\u0010%5\t\u0001CC\u0001\u0012\u0003\u0015\u00198-\u00197b\u0013\t\u0019\u0002C\u0001\u0004B]f\u0014VM\u001a\t\u0003+\u0001j\u0011A\u0006\u0006\u0003/a\t\u0001bY1uC2L8\u000f\u001e\u0006\u00033i\t1a]9m\u0015\tYB$A\u0003ta\u0006\u00148N\u0003\u0002\u001e=\u00051\u0011\r]1dQ\u0016T\u0011aH\u0001\u0004_J<\u0017BA\u0011\u0017\u0005i!UMZ5oK\u0012\u0014\u0015pQ8ogR\u0014Xo\u0019;peB\u000b'/Y7t\u0011!\u0019\u0003A!b\u0001\n\u0003!\u0013\u0001B;tKJ,\u0012!\n\t\u0003M%r!aD\u0014\n\u0005!\u0002\u0012A\u0002)sK\u0012,g-\u0003\u0002+W\t11\u000b\u001e:j]\u001eT!\u0001\u000b\t\t\u00115\u0002!\u0011!Q\u0001\n\u0015\nQ!^:fe\u0002B\u0001b\f\u0001\u0003\u0006\u0004%\t\u0001J\u0001\u000ba\u0016\u0014X.[:tS>t\u0007\u0002C\u0019\u0001\u0005\u0003\u0005\u000b\u0011B\u0013\u0002\u0017A,'/\\5tg&|g\u000e\t\u0005\u0006g\u0001!\t\u0001N\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007U:\u0004\b\u0005\u00027\u00015\t!\u0001C\u0003$e\u0001\u0007Q\u0005C\u00030e\u0001\u0007Q\u0005")
public class GrantInfo implements DefinedByConstructorParams
{
    private final String user;
    private final String permission;
    
    public String user() {
        return this.user;
    }
    
    public String permission() {
        return this.permission;
    }
    
    public GrantInfo(final String user, final String permission) {
        this.user = user;
        this.permission = permission;
    }
}
