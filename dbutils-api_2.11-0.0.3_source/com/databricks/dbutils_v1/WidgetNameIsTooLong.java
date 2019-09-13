// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.runtime.BoxesRunTime;
import scala.collection.Seq;
import scala.StringContext;
import scala.Predef$;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u000192A!\u0001\u0002\u0001\u0013\t\u0019r+\u001b3hKRt\u0015-\\3JgR{w\u000eT8oO*\u00111\u0001B\u0001\u000bI\n,H/\u001b7t?Z\f$BA\u0003\u0007\u0003)!\u0017\r^1ce&\u001c7n\u001d\u0006\u0002\u000f\u0005\u00191m\\7\u0004\u0001M\u0011\u0001A\u0003\t\u0003\u0017Uq!\u0001\u0004\n\u000f\u00055\u0001R\"\u0001\b\u000b\u0005=A\u0011A\u0002\u001fs_>$h(C\u0001\u0012\u0003\u0015\u00198-\u00197b\u0013\t\u0019B#A\u0004qC\u000e\\\u0017mZ3\u000b\u0003EI!AF\f\u0003\u0013\u0015C8-\u001a9uS>t'BA\n\u0015\u0011!I\u0002A!A!\u0002\u0013Q\u0012aB1sO:\u000bW.\u001a\t\u00037}q!\u0001H\u000f\u000e\u0003QI!A\b\u000b\u0002\rA\u0013X\rZ3g\u0013\t\u0001\u0013E\u0001\u0004TiJLgn\u001a\u0006\u0003=QA\u0001b\t\u0001\u0003\u0002\u0003\u0006I\u0001J\u0001\u0006Y&l\u0017\u000e\u001e\t\u00039\u0015J!A\n\u000b\u0003\u0007%sG\u000fC\u0003)\u0001\u0011\u0005\u0011&\u0001\u0004=S:LGO\u0010\u000b\u0004U1j\u0003CA\u0016\u0001\u001b\u0005\u0011\u0001\"B\r(\u0001\u0004Q\u0002\"B\u0012(\u0001\u0004!\u0003")
public class WidgetNameIsTooLong extends Exception
{
    public WidgetNameIsTooLong(final String argName, final int limit) {
        super(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "Widget name is longer than ", " bytes: ", "" })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { BoxesRunTime.boxToInteger(limit), argName })));
    }
}
