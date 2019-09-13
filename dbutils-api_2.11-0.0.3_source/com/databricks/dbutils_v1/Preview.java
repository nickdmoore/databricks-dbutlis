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
import scala.Product;
import scala.Serializable;

@ScalaSignature(bytes = "\u0006\u0001\u0005Ea\u0001B\u0001\u0003\u0001&\u0011q\u0001\u0015:fm&,wO\u0003\u0002\u0004\t\u0005QAMY;uS2\u001cxL^\u0019\u000b\u0005\u00151\u0011A\u00033bi\u0006\u0014'/[2lg*\tq!A\u0002d_6\u001c\u0001a\u0005\u0003\u0001\u0015A\u0019\u0002CA\u0006\u000f\u001b\u0005a!\"A\u0007\u0002\u000bM\u001c\u0017\r\\1\n\u0005=a!AB!osJ+g\r\u0005\u0002\f#%\u0011!\u0003\u0004\u0002\r'\u0016\u0014\u0018.\u00197ju\u0006\u0014G.\u001a\t\u0003\u0017QI!!\u0006\u0007\u0003\u000fA\u0013x\u000eZ;di\"Aq\u0003\u0001BK\u0002\u0013\u0005\u0001$\u0001\u0004tK\u000e\u0014X\r^\u000b\u00023A\u0011!dG\u0007\u0002\u0005%\u0011AD\u0001\u0002\f'\u0016\u001c'/\u001a;Vi&d7\u000f\u0003\u0005\u001f\u0001\tE\t\u0015!\u0003\u001a\u0003\u001d\u0019Xm\u0019:fi\u0002BQ\u0001\t\u0001\u0005\u0002\u0005\na\u0001P5oSRtDC\u0001\u0012$!\tQ\u0002\u0001C\u0003\u0018?\u0001\u0007\u0011\u0004C\u0004&\u0001\u0005\u0005I\u0011\u0001\u0014\u0002\t\r|\u0007/\u001f\u000b\u0003E\u001dBqa\u0006\u0013\u0011\u0002\u0003\u0007\u0011\u0004C\u0004*\u0001E\u0005I\u0011\u0001\u0016\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\fW\u000f\u001c;%cU\t1F\u000b\u0002\u001aY-\nQ\u0006\u0005\u0002/g5\tqF\u0003\u00021c\u0005IQO\\2iK\u000e\\W\r\u001a\u0006\u0003e1\t!\"\u00198o_R\fG/[8o\u0013\t!tFA\tv]\u000eDWmY6fIZ\u000b'/[1oG\u0016DqA\u000e\u0001\u0002\u0002\u0013\u0005s'A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002qA\u0011\u0011HP\u0007\u0002u)\u00111\bP\u0001\u0005Y\u0006twMC\u0001>\u0003\u0011Q\u0017M^1\n\u0005}R$AB*ue&tw\rC\u0004B\u0001\u0005\u0005I\u0011\u0001\"\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003\r\u0003\"a\u0003#\n\u0005\u0015c!aA%oi\"9q\tAA\u0001\n\u0003A\u0015A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003\u00132\u0003\"a\u0003&\n\u0005-c!aA!os\"9QJRA\u0001\u0002\u0004\u0019\u0015a\u0001=%c!9q\nAA\u0001\n\u0003\u0002\u0016a\u00049s_\u0012,8\r^%uKJ\fGo\u001c:\u0016\u0003E\u00032AU+J\u001b\u0005\u0019&B\u0001+\r\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003-N\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\b1\u0002\t\t\u0011\"\u0001Z\u0003!\u0019\u0017M\\#rk\u0006dGC\u0001.^!\tY1,\u0003\u0002]\u0019\t9!i\\8mK\u0006t\u0007bB'X\u0003\u0003\u0005\r!\u0013\u0005\b?\u0002\t\t\u0011\"\u0011a\u0003!A\u0017m\u001d5D_\u0012,G#A\"\t\u000f\t\u0004\u0011\u0011!C!G\u0006AAo\\*ue&tw\rF\u00019\u0011\u001d)\u0007!!A\u0005B\u0019\fa!Z9vC2\u001cHC\u0001.h\u0011\u001diE-!AA\u0002%;q!\u001b\u0002\u0002\u0002#\u0005!.A\u0004Qe\u00164\u0018.Z<\u0011\u0005iYgaB\u0001\u0003\u0003\u0003E\t\u0001\\\n\u0004W6\u0004\u0002\u0003\u00028r3\tj\u0011a\u001c\u0006\u0003a2\tqA];oi&lW-\u0003\u0002s_\n\t\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u0019\t\u000b\u0001ZG\u0011\u0001;\u0015\u0003)DqAY6\u0002\u0002\u0013\u00153\rC\u0004xW\u0006\u0005I\u0011\u0011=\u0002\u000b\u0005\u0004\b\u000f\\=\u0015\u0005\tJ\b\"B\fw\u0001\u0004I\u0002bB>l\u0003\u0003%\t\t`\u0001\bk:\f\u0007\u000f\u001d7z)\ri\u0018\u0011\u0001\t\u0004\u0017yL\u0012BA@\r\u0005\u0019y\u0005\u000f^5p]\"A\u00111\u0001>\u0002\u0002\u0003\u0007!%A\u0002yIAB\u0011\"a\u0002l\u0003\u0003%I!!\u0003\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u0003\u0017\u00012!OA\u0007\u0013\r\tyA\u000f\u0002\u0007\u001f\nTWm\u0019;")
public class Preview implements Serializable, Product
{
    private final SecretUtils secret;
    
    public static Option<SecretUtils> unapply(final Preview x$0) {
        return Preview$.MODULE$.unapply(x$0);
    }
    
    public static Preview apply(final SecretUtils secret) {
        return Preview$.MODULE$.apply(secret);
    }
    
    public static <A> Function1<SecretUtils, A> andThen(final Function1<Preview, A> function1) {
        return (Function1<SecretUtils, A>)Preview$.MODULE$.andThen((Function1)function1);
    }
    
    public static <A> Function1<A, Preview> compose(final Function1<A, SecretUtils> function1) {
        return (Function1<A, Preview>)Preview$.MODULE$.compose((Function1)function1);
    }
    
    public SecretUtils secret() {
        return this.secret;
    }
    
    public Preview copy(final SecretUtils secret) {
        return new Preview(secret);
    }
    
    public SecretUtils copy$default$1() {
        return this.secret();
    }
    
    public String productPrefix() {
        return "Preview";
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
                return this.secret();
            }
        }
    }
    
    public Iterator<Object> productIterator() {
        return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }
    
    public boolean canEqual(final Object x$1) {
        return x$1 instanceof Preview;
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
            if (x$1 instanceof Preview) {
                final Preview preview = (Preview)x$1;
                final SecretUtils secret = this.secret();
                final SecretUtils secret2 = preview.secret();
                boolean b = false;
                Label_0077: {
                    Label_0076: {
                        if (secret == null) {
                            if (secret2 != null) {
                                break Label_0076;
                            }
                        }
                        else if (!secret.equals(secret2)) {
                            break Label_0076;
                        }
                        if (preview.canEqual(this)) {
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
    
    public Preview(final SecretUtils secret) {
        this.secret = secret;
        Product$class.$init$((Product)this);
    }
}
