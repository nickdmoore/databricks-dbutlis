// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.backend.daemon.dbutils;

import scala.StringContext;
import scala.Function2;
import scala.Function1;
import scala.collection.Seq;
import scala.runtime.BoxesRunTime;
import scala.Predef$;
import scala.collection.Seq$;
import scala.collection.TraversableLike;
import scala.collection.TraversableOnce;
import scala.reflect.ScalaSignature;
import org.apache.spark.sql.catalyst.DefinedByConstructorParams;

@ScalaSignature(bytes = "\u0006\u0001}3A!\u0001\u0002\u0001\u001b\tAa)\u001b7f\u0013:4wN\u0003\u0002\u0004\t\u00059AMY;uS2\u001c(BA\u0003\u0007\u0003\u0019!\u0017-Z7p]*\u0011q\u0001C\u0001\bE\u0006\u001c7.\u001a8e\u0015\tI!\"\u0001\u0006eCR\f'M]5dWNT\u0011aC\u0001\u0004G>l7\u0001A\n\u0004\u00019!\u0002CA\b\u0013\u001b\u0005\u0001\"\"A\t\u0002\u000bM\u001c\u0017\r\\1\n\u0005M\u0001\"AB!osJ+g\r\u0005\u0002\u0016A5\taC\u0003\u0002\u00181\u0005A1-\u0019;bYf\u001cHO\u0003\u0002\u001a5\u0005\u00191/\u001d7\u000b\u0005ma\u0012!B:qCJ\\'BA\u000f\u001f\u0003\u0019\t\u0007/Y2iK*\tq$A\u0002pe\u001eL!!\t\f\u00035\u0011+g-\u001b8fI\nK8i\u001c8tiJ,8\r^8s!\u0006\u0014\u0018-\\:\t\u0011\r\u0002!Q1A\u0005\u0002\u0011\nA\u0001]1uQV\tQ\u0005\u0005\u0002'S9\u0011qbJ\u0005\u0003QA\ta\u0001\u0015:fI\u00164\u0017B\u0001\u0016,\u0005\u0019\u0019FO]5oO*\u0011\u0001\u0006\u0005\u0005\t[\u0001\u0011\t\u0011)A\u0005K\u0005)\u0001/\u0019;iA!Aq\u0006\u0001BC\u0002\u0013\u0005A%\u0001\u0003oC6,\u0007\u0002C\u0019\u0001\u0005\u0003\u0005\u000b\u0011B\u0013\u0002\u000b9\fW.\u001a\u0011\t\u0011M\u0002!Q1A\u0005\u0002Q\nAa]5{KV\tQ\u0007\u0005\u0002\u0010m%\u0011q\u0007\u0005\u0002\u0005\u0019>tw\r\u0003\u0005:\u0001\t\u0005\t\u0015!\u00036\u0003\u0015\u0019\u0018N_3!\u0011\u0019Y\u0004\u0001\"\u0001\ty\u00051A(\u001b8jiz\"B!P A\u0003B\u0011a\bA\u0007\u0002\u0005!)1E\u000fa\u0001K!)qF\u000fa\u0001K!)1G\u000fa\u0001k!)1\t\u0001C\u0001\t\u0006)\u0011n\u001d#jeV\tQ\t\u0005\u0002\u0010\r&\u0011q\t\u0005\u0002\b\u0005>|G.Z1o\u0011\u0015I\u0005\u0001\"\u0001E\u0003\u0019I7OR5mK\")1\n\u0001C\u0001\u0019\u0006A1-\u00198FcV\fG\u000e\u0006\u0002F\u001b\")aJ\u0013a\u0001\u001f\u0006)q\u000e\u001e5feB\u0011q\u0002U\u0005\u0003#B\u00111!\u00118z\u0011\u0015\u0019\u0006\u0001\"\u0011U\u0003\u0019)\u0017/^1mgR\u0011Q)\u0016\u0005\u0006\u001dJ\u0003\ra\u0014\u0005\u0006/\u0002!\t\u0005W\u0001\tQ\u0006\u001c\bnQ8eKR\t\u0011\f\u0005\u0002\u00105&\u00111\f\u0005\u0002\u0004\u0013:$\b\"B/\u0001\t\u0003r\u0016\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003\u0015\u0002")
public class FileInfo implements DefinedByConstructorParams
{
    private final String path;
    private final String name;
    private final long size;
    
    public String path() {
        return this.path;
    }
    
    public String name() {
        return this.name;
    }
    
    public long size() {
        return this.size;
    }
    
    public boolean isDir() {
        return this.name().endsWith("/");
    }
    
    public boolean isFile() {
        return !this.isDir();
    }
    
    public boolean canEqual(final Object other) {
        return other instanceof FileInfo;
    }
    
    @Override
    public boolean equals(final Object other) {
        boolean b2;
        if (other instanceof FileInfo) {
            final FileInfo fileInfo = (FileInfo)other;
            boolean b = false;
            Label_0101: {
                Label_0100: {
                    if (fileInfo.canEqual(this)) {
                        final String path = this.path();
                        final String path2 = fileInfo.path();
                        if (path == null) {
                            if (path2 != null) {
                                break Label_0100;
                            }
                        }
                        else if (!path.equals(path2)) {
                            break Label_0100;
                        }
                        final String name = this.name();
                        final String name2 = fileInfo.name();
                        if (name == null) {
                            if (name2 != null) {
                                break Label_0100;
                            }
                        }
                        else if (!name.equals(name2)) {
                            break Label_0100;
                        }
                        if (this.size() == fileInfo.size()) {
                            b = true;
                            break Label_0101;
                        }
                    }
                }
                b = false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return BoxesRunTime.unboxToInt(((TraversableOnce)((TraversableLike)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { this.path(), this.name(), BoxesRunTime.boxToLong(this.size()) }))).map((Function1)new FileInfo$$anonfun$hashCode.FileInfo$$anonfun$hashCode$2(this), Seq$.MODULE$.canBuildFrom())).foldLeft((Object)BoxesRunTime.boxToInteger(0), (Function2)new FileInfo$$anonfun$hashCode.FileInfo$$anonfun$hashCode$1(this)));
    }
    
    @Override
    public String toString() {
        return new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "", "(", ", ", ", ", ")" })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { this.getClass().getSimpleName(), this.path(), this.name(), BoxesRunTime.boxToLong(this.size()) }));
    }
    
    public FileInfo(final String path, final String name, final long size) {
        this.path = path;
        this.name = name;
        this.size = size;
    }
}
