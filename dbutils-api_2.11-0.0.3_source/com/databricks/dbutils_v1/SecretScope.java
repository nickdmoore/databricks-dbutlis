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

@ScalaSignature(bytes = "\u0006\u0001\u0005eb\u0001B\u0001\u0003\u0001&\u00111bU3de\u0016$8kY8qK*\u00111\u0001B\u0001\u000bI\n,H/\u001b7t?Z\f$BA\u0003\u0007\u0003)!\u0017\r^1ce&\u001c7n\u001d\u0006\u0002\u000f\u0005\u00191m\\7\u0004\u0001M)\u0001A\u0003\t\u001fCA\u00111BD\u0007\u0002\u0019)\tQ\"A\u0003tG\u0006d\u0017-\u0003\u0002\u0010\u0019\t1\u0011I\\=SK\u001a\u0004\"!\u0005\u000f\u000e\u0003IQ!a\u0005\u000b\u0002\u0011\r\fG/\u00197zgRT!!\u0006\f\u0002\u0007M\fHN\u0003\u0002\u00181\u0005)1\u000f]1sW*\u0011\u0011DG\u0001\u0007CB\f7\r[3\u000b\u0003m\t1a\u001c:h\u0013\ti\"C\u0001\u000eEK\u001aLg.\u001a3Cs\u000e{gn\u001d;sk\u000e$xN\u001d)be\u0006l7\u000f\u0005\u0002\f?%\u0011\u0001\u0005\u0004\u0002\b!J|G-^2u!\tY!%\u0003\u0002$\u0019\ta1+\u001a:jC2L'0\u00192mK\"AQ\u0005\u0001BK\u0002\u0013\u0005a%\u0001\u0003oC6,W#A\u0014\u0011\u0005!ZcBA\u0006*\u0013\tQC\"\u0001\u0004Qe\u0016$WMZ\u0005\u0003Y5\u0012aa\u0015;sS:<'B\u0001\u0016\r\u0011!y\u0003A!E!\u0002\u00139\u0013!\u00028b[\u0016\u0004\u0003\"B\u0019\u0001\t\u0003\u0011\u0014A\u0002\u001fj]&$h\b\u0006\u00024kA\u0011A\u0007A\u0007\u0002\u0005!)Q\u0005\ra\u0001O!)q\u0007\u0001C\u0001q\u00059q-\u001a;OC6,G#A\u0014\t\u000fi\u0002\u0011\u0011!C\u0001w\u0005!1m\u001c9z)\t\u0019D\bC\u0004&sA\u0005\t\u0019A\u0014\t\u000fy\u0002\u0011\u0013!C\u0001\u007f\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#\u0001!+\u0005\u001d\n5&\u0001\"\u0011\u0005\rCU\"\u0001#\u000b\u0005\u00153\u0015!C;oG\",7m[3e\u0015\t9E\"\u0001\u0006b]:|G/\u0019;j_:L!!\u0013#\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004L\u0001\u0005\u0005I\u0011\t'\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005i\u0005C\u0001(T\u001b\u0005y%B\u0001)R\u0003\u0011a\u0017M\\4\u000b\u0003I\u000bAA[1wC&\u0011Af\u0014\u0005\b+\u0002\t\t\u0011\"\u0001W\u00031\u0001(o\u001c3vGR\f%/\u001b;z+\u00059\u0006CA\u0006Y\u0013\tIFBA\u0002J]RDqa\u0017\u0001\u0002\u0002\u0013\u0005A,\u0001\bqe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005u\u0003\u0007CA\u0006_\u0013\tyFBA\u0002B]fDq!\u0019.\u0002\u0002\u0003\u0007q+A\u0002yIEBqa\u0019\u0001\u0002\u0002\u0013\u0005C-A\bqe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u0005)\u0007c\u00014j;6\tqM\u0003\u0002i\u0019\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u0005)<'\u0001C%uKJ\fGo\u001c:\t\u000f1\u0004\u0011\u0011!C\u0001[\u0006A1-\u00198FcV\fG\u000e\u0006\u0002ocB\u00111b\\\u0005\u0003a2\u0011qAQ8pY\u0016\fg\u000eC\u0004bW\u0006\u0005\t\u0019A/\t\u000fM\u0004\u0011\u0011!C!i\u0006A\u0001.Y:i\u0007>$W\rF\u0001X\u0011\u001d1\b!!A\u0005B]\f\u0001\u0002^8TiJLgn\u001a\u000b\u0002\u001b\"9\u0011\u0010AA\u0001\n\u0003R\u0018AB3rk\u0006d7\u000f\u0006\u0002ow\"9\u0011\r_A\u0001\u0002\u0004ivaB?\u0003\u0003\u0003E\tA`\u0001\f'\u0016\u001c'/\u001a;TG>\u0004X\r\u0005\u00025\u007f\u001aA\u0011AAA\u0001\u0012\u0003\t\ta\u0005\u0003\u0000\u0003\u0007\t\u0003CBA\u0003\u0003\u001793'\u0004\u0002\u0002\b)\u0019\u0011\u0011\u0002\u0007\u0002\u000fI,h\u000e^5nK&!\u0011QBA\u0004\u0005E\t%m\u001d;sC\u000e$h)\u001e8di&|g.\r\u0005\u0007c}$\t!!\u0005\u0015\u0003yDqA^@\u0002\u0002\u0013\u0015s\u000fC\u0005\u0002\u0018}\f\t\u0011\"!\u0002\u001a\u0005)\u0011\r\u001d9msR\u00191'a\u0007\t\r\u0015\n)\u00021\u0001(\u0011%\tyb`A\u0001\n\u0003\u000b\t#A\u0004v]\u0006\u0004\b\u000f\\=\u0015\t\u0005\r\u0012\u0011\u0006\t\u0005\u0017\u0005\u0015r%C\u0002\u0002(1\u0011aa\u00149uS>t\u0007\"CA\u0016\u0003;\t\t\u00111\u00014\u0003\rAH\u0005\r\u0005\n\u0003_y\u0018\u0011!C\u0005\u0003c\t1B]3bIJ+7o\u001c7wKR\u0011\u00111\u0007\t\u0004\u001d\u0006U\u0012bAA\u001c\u001f\n1qJ\u00196fGR\u0004")
public class SecretScope implements DefinedByConstructorParams, Product, Serializable
{
    private final String name;
    
    public static Option<String> unapply(final SecretScope x$0) {
        return SecretScope$.MODULE$.unapply(x$0);
    }
    
    public static SecretScope apply(final String name) {
        return SecretScope$.MODULE$.apply(name);
    }
    
    public static <A> Function1<String, A> andThen(final Function1<SecretScope, A> function1) {
        return (Function1<String, A>)SecretScope$.MODULE$.andThen((Function1)function1);
    }
    
    public static <A> Function1<A, SecretScope> compose(final Function1<A, String> function1) {
        return (Function1<A, SecretScope>)SecretScope$.MODULE$.compose((Function1)function1);
    }
    
    public String name() {
        return this.name;
    }
    
    public String getName() {
        return this.name();
    }
    
    public SecretScope copy(final String name) {
        return new SecretScope(name);
    }
    
    public String copy$default$1() {
        return this.name();
    }
    
    public String productPrefix() {
        return "SecretScope";
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
                return this.name();
            }
        }
    }
    
    public Iterator<Object> productIterator() {
        return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }
    
    public boolean canEqual(final Object x$1) {
        return x$1 instanceof SecretScope;
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
            if (x$1 instanceof SecretScope) {
                final SecretScope secretScope = (SecretScope)x$1;
                final String name = this.name();
                final String name2 = secretScope.name();
                boolean b = false;
                Label_0077: {
                    Label_0076: {
                        if (name == null) {
                            if (name2 != null) {
                                break Label_0076;
                            }
                        }
                        else if (!name.equals(name2)) {
                            break Label_0076;
                        }
                        if (secretScope.canEqual(this)) {
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
    
    public SecretScope(final String name) {
        this.name = name;
        Product$class.$init$((Product)this);
    }
}
