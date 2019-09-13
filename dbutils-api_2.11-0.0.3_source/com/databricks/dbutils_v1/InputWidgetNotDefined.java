// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.Seq;
import scala.StringContext;
import scala.Predef$;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u0001!2A!\u0001\u0002\u0001\u0013\t)\u0012J\u001c9vi^KGmZ3u\u001d>$H)\u001a4j]\u0016$'BA\u0002\u0005\u0003)!'-\u001e;jYN|f/\r\u0006\u0003\u000b\u0019\t!\u0002Z1uC\n\u0014\u0018nY6t\u0015\u00059\u0011aA2p[\u000e\u00011C\u0001\u0001\u000b!\tYQC\u0004\u0002\r%9\u0011Q\u0002E\u0007\u0002\u001d)\u0011q\u0002C\u0001\u0007yI|w\u000e\u001e \n\u0003E\tQa]2bY\u0006L!a\u0005\u000b\u0002\u000fA\f7m[1hK*\t\u0011#\u0003\u0002\u0017/\tIQ\t_2faRLwN\u001c\u0006\u0003'QA\u0001\"\u0007\u0001\u0003\u0002\u0003\u0006IAG\u0001\bCJ<g*Y7f!\tYrD\u0004\u0002\u001d;5\tA#\u0003\u0002\u001f)\u00051\u0001K]3eK\u001aL!\u0001I\u0011\u0003\rM#(/\u001b8h\u0015\tqB\u0003C\u0003$\u0001\u0011\u0005A%\u0001\u0004=S:LGO\u0010\u000b\u0003K\u001d\u0002\"A\n\u0001\u000e\u0003\tAQ!\u0007\u0012A\u0002i\u0001")
public class InputWidgetNotDefined extends Exception
{
    public InputWidgetNotDefined(final String argName) {
        super(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "No input widget named ", " is defined" })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { argName })));
    }
}
