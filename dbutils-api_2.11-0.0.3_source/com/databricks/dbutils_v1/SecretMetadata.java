// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.Product$class;
import scala.runtime.ScalaRunTime$;
import scala.collection.Iterator;
import scala.runtime.BoxesRunTime;
import scala.Function1;
import scala.Option;
import scala.reflect.ScalaSignature;
import scala.Serializable;
import scala.Product;
import org.apache.spark.sql.catalyst.DefinedByConstructorParams;

@ScalaSignature(bytes = "\u0006\u0001\u0005Mb\u0001B\u0001\u0003\u0001&\u0011abU3de\u0016$X*\u001a;bI\u0006$\u0018M\u0003\u0002\u0004\t\u0005QAMY;uS2\u001cxL^\u0019\u000b\u0005\u00151\u0011A\u00033bi\u0006\u0014'/[2lg*\tq!A\u0002d_6\u001c\u0001aE\u0003\u0001\u0015Aq\u0012\u0005\u0005\u0002\f\u001d5\tABC\u0001\u000e\u0003\u0015\u00198-\u00197b\u0013\tyAB\u0001\u0004B]f\u0014VM\u001a\t\u0003#qi\u0011A\u0005\u0006\u0003'Q\t\u0001bY1uC2L8\u000f\u001e\u0006\u0003+Y\t1a]9m\u0015\t9\u0002$A\u0003ta\u0006\u00148N\u0003\u0002\u001a5\u00051\u0011\r]1dQ\u0016T\u0011aG\u0001\u0004_J<\u0017BA\u000f\u0013\u0005i!UMZ5oK\u0012\u0014\u0015pQ8ogR\u0014Xo\u0019;peB\u000b'/Y7t!\tYq$\u0003\u0002!\u0019\t9\u0001K]8ek\u000e$\bCA\u0006#\u0013\t\u0019CB\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005&\u0001\tU\r\u0011\"\u0001'\u0003\rYW-_\u000b\u0002OA\u0011\u0001f\u000b\b\u0003\u0017%J!A\u000b\u0007\u0002\rA\u0013X\rZ3g\u0013\taSF\u0001\u0004TiJLgn\u001a\u0006\u0003U1A\u0001b\f\u0001\u0003\u0012\u0003\u0006IaJ\u0001\u0005W\u0016L\b\u0005C\u00032\u0001\u0011\u0005!'\u0001\u0004=S:LGO\u0010\u000b\u0003gU\u0002\"\u0001\u000e\u0001\u000e\u0003\tAQ!\n\u0019A\u0002\u001dBqa\u000e\u0001\u0002\u0002\u0013\u0005\u0001(\u0001\u0003d_BLHCA\u001a:\u0011\u001d)c\u0007%AA\u0002\u001dBqa\u000f\u0001\u0012\u0002\u0013\u0005A(\u0001\bd_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003uR#a\n ,\u0003}\u0002\"\u0001Q#\u000e\u0003\u0005S!AQ\"\u0002\u0013Ut7\r[3dW\u0016$'B\u0001#\r\u0003)\tgN\\8uCRLwN\\\u0005\u0003\r\u0006\u0013\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001dA\u0005!!A\u0005B%\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001&\u0011\u0005-\u0003V\"\u0001'\u000b\u00055s\u0015\u0001\u00027b]\u001eT\u0011aT\u0001\u0005U\u00064\u0018-\u0003\u0002-\u0019\"9!\u000bAA\u0001\n\u0003\u0019\u0016\u0001\u00049s_\u0012,8\r^!sSRLX#\u0001+\u0011\u0005-)\u0016B\u0001,\r\u0005\rIe\u000e\u001e\u0005\b1\u0002\t\t\u0011\"\u0001Z\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"AW/\u0011\u0005-Y\u0016B\u0001/\r\u0005\r\te.\u001f\u0005\b=^\u000b\t\u00111\u0001U\u0003\rAH%\r\u0005\bA\u0002\t\t\u0011\"\u0011b\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u00012\u0011\u0007\r4',D\u0001e\u0015\t)G\"\u0001\u0006d_2dWm\u0019;j_:L!a\u001a3\u0003\u0011%#XM]1u_JDq!\u001b\u0001\u0002\u0002\u0013\u0005!.\u0001\u0005dC:,\u0015/^1m)\tYg\u000e\u0005\u0002\fY&\u0011Q\u000e\u0004\u0002\b\u0005>|G.Z1o\u0011\u001dq\u0006.!AA\u0002iCq\u0001\u001d\u0001\u0002\u0002\u0013\u0005\u0013/\u0001\u0005iCND7i\u001c3f)\u0005!\u0006bB:\u0001\u0003\u0003%\t\u0005^\u0001\ti>\u001cFO]5oOR\t!\nC\u0004w\u0001\u0005\u0005I\u0011I<\u0002\r\u0015\fX/\u00197t)\tY\u0007\u0010C\u0004_k\u0006\u0005\t\u0019\u0001.\b\u000fi\u0014\u0011\u0011!E\u0001w\u0006q1+Z2sKRlU\r^1eCR\f\u0007C\u0001\u001b}\r\u001d\t!!!A\t\u0002u\u001c2\u0001 @\"!\u0015y\u0018QA\u00144\u001b\t\t\tAC\u0002\u0002\u00041\tqA];oi&lW-\u0003\u0003\u0002\b\u0005\u0005!!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oc!1\u0011\u0007 C\u0001\u0003\u0017!\u0012a\u001f\u0005\bgr\f\t\u0011\"\u0012u\u0011%\t\t\u0002`A\u0001\n\u0003\u000b\u0019\"A\u0003baBd\u0017\u0010F\u00024\u0003+Aa!JA\b\u0001\u00049\u0003\"CA\ry\u0006\u0005I\u0011QA\u000e\u0003\u001d)h.\u00199qYf$B!!\b\u0002$A!1\"a\b(\u0013\r\t\t\u0003\u0004\u0002\u0007\u001fB$\u0018n\u001c8\t\u0013\u0005\u0015\u0012qCA\u0001\u0002\u0004\u0019\u0014a\u0001=%a!I\u0011\u0011\u0006?\u0002\u0002\u0013%\u00111F\u0001\fe\u0016\fGMU3t_24X\r\u0006\u0002\u0002.A\u00191*a\f\n\u0007\u0005EBJ\u0001\u0004PE*,7\r\u001e")
public class SecretMetadata implements DefinedByConstructorParams, Product, Serializable
{
    private final String key;
    
    public static Option<String> unapply(final SecretMetadata x$0) {
        return SecretMetadata$.MODULE$.unapply(x$0);
    }
    
    public static SecretMetadata apply(final String key) {
        return SecretMetadata$.MODULE$.apply(key);
    }
    
    public static <A> Function1<String, A> andThen(final Function1<SecretMetadata, A> function1) {
        return (Function1<String, A>)SecretMetadata$.MODULE$.andThen((Function1)function1);
    }
    
    public static <A> Function1<A, SecretMetadata> compose(final Function1<A, String> function1) {
        return (Function1<A, SecretMetadata>)SecretMetadata$.MODULE$.compose((Function1)function1);
    }
    
    public String key() {
        return this.key;
    }
    
    public SecretMetadata copy(final String key) {
        return new SecretMetadata(key);
    }
    
    public String copy$default$1() {
        return this.key();
    }
    
    public String productPrefix() {
        return "SecretMetadata";
    }
    
    public int productArity() {
        return 1;
    }
    
    public Object productElement(final int x$1) {
        switch (x$1) {
            default: {
                throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());
            }
            case 0: {
                return this.key();
            }
        }
    }
    
    public Iterator<Object> productIterator() {
        return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }
    
    public boolean canEqual(final Object x$1) {
        return x$1 instanceof SecretMetadata;
    }
    
    @Override
    public int hashCode() {
        return ScalaRunTime$.MODULE$._hashCode((Product)this);
    }
    
    @Override
    public String toString() {
        return ScalaRunTime$.MODULE$._toString((Product)this);
    }
    
    @Override
    public boolean equals(final Object x$1) {
        if (this != x$1) {
            if (x$1 instanceof SecretMetadata) {
                final SecretMetadata secretMetadata = (SecretMetadata)x$1;
                final String key = this.key();
                final String key2 = secretMetadata.key();
                boolean b = false;
                Label_0077: {
                    Label_0076: {
                        if (key == null) {
                            if (key2 != null) {
                                break Label_0076;
                            }
                        }
                        else if (!key.equals(key2)) {
                            break Label_0076;
                        }
                        if (secretMetadata.canEqual(this)) {
                            b = true;
                            break Label_0077;
                        }
                    }
                    b = false;
                }
                if (b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public SecretMetadata(final String key) {
        this.key = key;
        Product$class.$init$((Product)this);
    }
}
