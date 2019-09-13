// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.runtime.BoxesRunTime;
import scala.collection.Seq;
import scala.StringContext;
import scala.Predef$;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u0001\u001d2A!\u0001\u0002\u0001\u0013\t)Bk\\8NC:LH)\u001a4bk2$8\t[8jG\u0016\u001c(BA\u0002\u0005\u0003)!'-\u001e;jYN|f/\r\u0006\u0003\u000b\u0019\t!\u0002Z1uC\n\u0014\u0018nY6t\u0015\u00059\u0011aA2p[\u000e\u00011C\u0001\u0001\u000b!\tYQC\u0004\u0002\r%9\u0011Q\u0002E\u0007\u0002\u001d)\u0011q\u0002C\u0001\u0007yI|w\u000e\u001e \n\u0003E\tQa]2bY\u0006L!a\u0005\u000b\u0002\u000fA\f7m[1hK*\t\u0011#\u0003\u0002\u0017/\tIQ\t_2faRLwN\u001c\u0006\u0003'QA\u0001\"\u0007\u0001\u0003\u0002\u0003\u0006IAG\u0001\u000b]Vl7\t[8jG\u0016\u001c\bCA\u000e\u001d\u001b\u0005!\u0012BA\u000f\u0015\u0005\rIe\u000e\u001e\u0005\t?\u0001\u0011\t\u0011)A\u00055\u0005)A.[7ji\")\u0011\u0005\u0001C\u0001E\u00051A(\u001b8jiz\"2aI\u0013'!\t!\u0003!D\u0001\u0003\u0011\u0015I\u0002\u00051\u0001\u001b\u0011\u0015y\u0002\u00051\u0001\u001b\u0001")
public class TooManyDefaultChoices extends Exception
{
    public TooManyDefaultChoices(final int numChoices, final int limit) {
        super(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "Too many default choices (", "). Limit is ", "." })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { BoxesRunTime.boxToInteger(numChoices), BoxesRunTime.boxToInteger(limit) })));
    }
}
