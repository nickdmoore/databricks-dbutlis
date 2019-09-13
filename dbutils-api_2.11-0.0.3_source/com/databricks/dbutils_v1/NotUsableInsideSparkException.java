// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.immutable.Nil$;
import scala.collection.Seq;
import scala.StringContext;
import scala.Predef$;
import scala.collection.mutable.StringBuilder;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u0001!2A!\u0001\u0002\u0001\u0013\tibj\u001c;Vg\u0006\u0014G.Z%og&$Wm\u00159be.,\u0005pY3qi&|gN\u0003\u0002\u0004\t\u0005QAMY;uS2\u001cxL^\u0019\u000b\u0005\u00151\u0011A\u00033bi\u0006\u0014'/[2lg*\tq!A\u0002d_6\u001c\u0001a\u0005\u0002\u0001\u0015A\u00111\"\u0006\b\u0003\u0019Iq!!\u0004\t\u000e\u00039Q!a\u0004\u0005\u0002\rq\u0012xn\u001c;?\u0013\u0005\t\u0012!B:dC2\f\u0017BA\n\u0015\u0003\u001d\u0001\u0018mY6bO\u0016T\u0011!E\u0005\u0003-]\u0011\u0011\"\u0012=dKB$\u0018n\u001c8\u000b\u0005M!\u0002\u0002C\r\u0001\u0005\u0003\u0005\u000b\u0011\u0002\u000e\u0002\u00075\u001cx\r\u0005\u0002\u001c?9\u0011A$H\u0007\u0002)%\u0011a\u0004F\u0001\u0007!J,G-\u001a4\n\u0005\u0001\n#AB*ue&twM\u0003\u0002\u001f)!)1\u0005\u0001C\u0001I\u00051A(\u001b8jiz\"\"!J\u0014\u0011\u0005\u0019\u0002Q\"\u0001\u0002\t\u000be\u0011\u0003\u0019\u0001\u000e")
public class NotUsableInsideSparkException extends Exception
{
    public NotUsableInsideSparkException(final String msg) {
        super(new StringBuilder().append((Object)new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "You cannot use this class inside a spark job: " })).s((Seq)Nil$.MODULE$)).append((Object)msg).toString());
    }
}
