// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.backend.daemon.dbutils;

import scala.reflect.ScalaSignature;
import org.apache.spark.sql.catalyst.DefinedByConstructorParams;

@ScalaSignature(bytes = "\u0006\u0001y2A!\u0001\u0002\u0001\u001b\tIQj\\;oi&sgm\u001c\u0006\u0003\u0007\u0011\tq\u0001\u001a2vi&d7O\u0003\u0002\u0006\r\u00051A-Y3n_:T!a\u0002\u0005\u0002\u000f\t\f7m[3oI*\u0011\u0011BC\u0001\u000bI\u0006$\u0018M\u0019:jG.\u001c(\"A\u0006\u0002\u0007\r|Wn\u0001\u0001\u0014\u0007\u0001qA\u0003\u0005\u0002\u0010%5\t\u0001CC\u0001\u0012\u0003\u0015\u00198-\u00197b\u0013\t\u0019\u0002C\u0001\u0004B]f\u0014VM\u001a\t\u0003+\u0001j\u0011A\u0006\u0006\u0003/a\t\u0001bY1uC2L8\u000f\u001e\u0006\u00033i\t1a]9m\u0015\tYB$A\u0003ta\u0006\u00148N\u0003\u0002\u001e=\u00051\u0011\r]1dQ\u0016T\u0011aH\u0001\u0004_J<\u0017BA\u0011\u0017\u0005i!UMZ5oK\u0012\u0014\u0015pQ8ogR\u0014Xo\u0019;peB\u000b'/Y7t\u0011!\u0019\u0003A!b\u0001\n\u0003!\u0013AC7pk:$\bk\\5oiV\tQ\u0005\u0005\u0002'S9\u0011qbJ\u0005\u0003QA\ta\u0001\u0015:fI\u00164\u0017B\u0001\u0016,\u0005\u0019\u0019FO]5oO*\u0011\u0001\u0006\u0005\u0005\t[\u0001\u0011\t\u0011)A\u0005K\u0005YQn\\;oiB{\u0017N\u001c;!\u0011!y\u0003A!b\u0001\n\u0003!\u0013AB:pkJ\u001cW\r\u0003\u00052\u0001\t\u0005\t\u0015!\u0003&\u0003\u001d\u0019x.\u001e:dK\u0002B\u0001b\r\u0001\u0003\u0006\u0004%\t\u0001J\u0001\u000fK:\u001c'/\u001f9uS>tG+\u001f9f\u0011!)\u0004A!A!\u0002\u0013)\u0013aD3oGJL\b\u000f^5p]RK\b/\u001a\u0011\t\r]\u0002A\u0011\u0001\u00039\u0003\u0019a\u0014N\\5u}Q!\u0011h\u000f\u001f>!\tQ\u0004!D\u0001\u0003\u0011\u0015\u0019c\u00071\u0001&\u0011\u0015yc\u00071\u0001&\u0011\u0015\u0019d\u00071\u0001&\u0001")
public class MountInfo implements DefinedByConstructorParams
{
    private final String mountPoint;
    private final String source;
    private final String encryptionType;
    
    public String mountPoint() {
        return this.mountPoint;
    }
    
    public String source() {
        return this.source;
    }
    
    public String encryptionType() {
        return this.encryptionType;
    }
    
    public MountInfo(final String mountPoint, final String source, final String encryptionType) {
        this.mountPoint = mountPoint;
        this.source = source;
        this.encryptionType = encryptionType;
    }
}
