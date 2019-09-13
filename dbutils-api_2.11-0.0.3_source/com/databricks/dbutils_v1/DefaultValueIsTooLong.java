// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.runtime.BoxesRunTime;
import scala.collection.Seq;
import scala.StringContext;
import scala.Predef$;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u000192A!\u0001\u0002\u0001\u0013\t)B)\u001a4bk2$h+\u00197vK&\u001bHk\\8M_:<'BA\u0002\u0005\u0003)!'-\u001e;jYN|f/\r\u0006\u0003\u000b\u0019\t!\u0002Z1uC\n\u0014\u0018nY6t\u0015\u00059\u0011aA2p[\u000e\u00011C\u0001\u0001\u000b!\tYQC\u0004\u0002\r%9\u0011Q\u0002E\u0007\u0002\u001d)\u0011q\u0002C\u0001\u0007yI|w\u000e\u001e \n\u0003E\tQa]2bY\u0006L!a\u0005\u000b\u0002\u000fA\f7m[1hK*\t\u0011#\u0003\u0002\u0017/\tIQ\t_2faRLwN\u001c\u0006\u0003'QA\u0001\"\u0007\u0001\u0003\u0002\u0003\u0006IAG\u0001\rI\u00164\u0017-\u001e7u-\u0006dW/\u001a\t\u00037}q!\u0001H\u000f\u000e\u0003QI!A\b\u000b\u0002\rA\u0013X\rZ3g\u0013\t\u0001\u0013E\u0001\u0004TiJLgn\u001a\u0006\u0003=QA\u0001b\t\u0001\u0003\u0002\u0003\u0006I\u0001J\u0001\u0006Y&l\u0017\u000e\u001e\t\u00039\u0015J!A\n\u000b\u0003\u0007%sG\u000fC\u0003)\u0001\u0011\u0005\u0011&\u0001\u0004=S:LGO\u0010\u000b\u0004U1j\u0003CA\u0016\u0001\u001b\u0005\u0011\u0001\"B\r(\u0001\u0004Q\u0002\"B\u0012(\u0001\u0004!\u0003")
public class DefaultValueIsTooLong extends Exception
{
    public DefaultValueIsTooLong(final String defaultValue, final int limit) {
        super(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "Default value is longer than ", " bytes: ", "" })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { BoxesRunTime.boxToInteger(limit), defaultValue })));
    }
}
