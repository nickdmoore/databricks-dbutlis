// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.Seq;
import scala.StringContext;
import scala.Predef$;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u0001!2A!\u0001\u0002\u0001\u0013\taB)\u001a4bk2$h+\u00197vK:{G/\u00138DQ>L7-Z:MSN$(BA\u0002\u0005\u0003)!'-\u001e;jYN|f/\r\u0006\u0003\u000b\u0019\t!\u0002Z1uC\n\u0014\u0018nY6t\u0015\u00059\u0011aA2p[\u000e\u00011C\u0001\u0001\u000b!\tYQC\u0004\u0002\r%9\u0011Q\u0002E\u0007\u0002\u001d)\u0011q\u0002C\u0001\u0007yI|w\u000e\u001e \n\u0003E\tQa]2bY\u0006L!a\u0005\u000b\u0002\u000fA\f7m[1hK*\t\u0011#\u0003\u0002\u0017/\tIQ\t_2faRLwN\u001c\u0006\u0003'QA\u0001\"\u0007\u0001\u0003\u0002\u0003\u0006IAG\u0001\u000bI\u00164\u0017-\u001e7u-\u0006d\u0007CA\u000e \u001d\taR$D\u0001\u0015\u0013\tqB#\u0001\u0004Qe\u0016$WMZ\u0005\u0003A\u0005\u0012aa\u0015;sS:<'B\u0001\u0010\u0015\u0011\u0015\u0019\u0003\u0001\"\u0001%\u0003\u0019a\u0014N\\5u}Q\u0011Qe\n\t\u0003M\u0001i\u0011A\u0001\u0005\u00063\t\u0002\rA\u0007")
public class DefaultValueNotInChoicesList extends Exception
{
    public DefaultValueNotInChoicesList(final String defaultVal) {
        super(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "Selection sequence must include ", "" })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { defaultVal })));
    }
}
