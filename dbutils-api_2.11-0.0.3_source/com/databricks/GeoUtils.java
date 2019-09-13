// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks;

import scala.Some;
import scala.None$;
import scala.Tuple3;
import scala.Option;
import scala.runtime.AbstractFunction3;
import scala.Product$class;
import scala.runtime.Statics;
import scala.runtime.ScalaRunTime$;
import scala.collection.Iterator;
import java.lang.constant.Constable;
import scala.runtime.BoxesRunTime;
import scala.Serializable;
import scala.Product;
import scala.runtime.BoxedUnit;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u0001\u0005\rv!B\u0001\u0003\u0011\u00039\u0011\u0001C$f_V#\u0018\u000e\\:\u000b\u0005\r!\u0011A\u00033bi\u0006\u0014'/[2lg*\tQ!A\u0002d_6\u001c\u0001\u0001\u0005\u0002\t\u00135\t!AB\u0003\u000b\u0005!\u00051B\u0001\u0005HK>,F/\u001b7t'\rIAB\u0005\t\u0003\u001bAi\u0011A\u0004\u0006\u0002\u001f\u0005)1oY1mC&\u0011\u0011C\u0004\u0002\u0007\u0003:L(+\u001a4\u0011\u00055\u0019\u0012B\u0001\u000b\u000f\u0005\r\t\u0005\u000f\u001d\u0005\u0006-%!\taF\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0003\u001d1A!G\u0005E5\t91i\\;oiJL8\u0003\u0002\r\r7y\u0001\"!\u0004\u000f\n\u0005uq!a\u0002)s_\u0012,8\r\u001e\t\u0003\u001b}I!\u0001\t\b\u0003\u0019M+'/[1mSj\f'\r\\3\t\u0011\tB\"Q3A\u0005\u0002\r\nAaY8eKV\tA\u0005\u0005\u0002&Q9\u0011QBJ\u0005\u0003O9\ta\u0001\u0015:fI\u00164\u0017BA\u0015+\u0005\u0019\u0019FO]5oO*\u0011qE\u0004\u0005\tYa\u0011\t\u0012)A\u0005I\u0005)1m\u001c3fA!Aa\u0006\u0007BK\u0002\u0013\u0005q&\u0001\u0005mCRLG/\u001e3f+\u0005\u0001\u0004CA\u00072\u0013\t\u0011dB\u0001\u0004E_V\u0014G.\u001a\u0005\tia\u0011\t\u0012)A\u0005a\u0005IA.\u0019;jiV$W\r\t\u0005\tma\u0011)\u001a!C\u0001_\u0005IAn\u001c8hSR,H-\u001a\u0005\tqa\u0011\t\u0012)A\u0005a\u0005QAn\u001c8hSR,H-\u001a\u0011\t\u000bYAB\u0011\u0001\u001e\u0015\tmjdh\u0010\t\u0003yai\u0011!\u0003\u0005\u0006Ee\u0002\r\u0001\n\u0005\u0006]e\u0002\r\u0001\r\u0005\u0006me\u0002\r\u0001\r\u0005\b\u0003b\t\t\u0011\"\u0001C\u0003\u0011\u0019w\u000e]=\u0015\tm\u001aE)\u0012\u0005\bE\u0001\u0003\n\u00111\u0001%\u0011\u001dq\u0003\t%AA\u0002ABqA\u000e!\u0011\u0002\u0003\u0007\u0001\u0007C\u0004H1E\u0005I\u0011\u0001%\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\fW\u000f\u001c;%cU\t\u0011J\u000b\u0002%\u0015.\n1\n\u0005\u0002M#6\tQJ\u0003\u0002O\u001f\u0006IQO\\2iK\u000e\\W\r\u001a\u0006\u0003!:\t!\"\u00198o_R\fG/[8o\u0013\t\u0011VJA\tv]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u0016\r\u0012\u0002\u0013\u0005Q+\u0001\bd_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003YS#\u0001\r&\t\u000faC\u0012\u0013!C\u0001+\u0006q1m\u001c9zI\u0011,g-Y;mi\u0012\u001a\u0004b\u0002.\u0019\u0003\u0003%\teW\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003q\u0003\"!\u00182\u000e\u0003yS!a\u00181\u0002\t1\fgn\u001a\u0006\u0002C\u0006!!.\u0019<b\u0013\tIc\fC\u0004e1\u0005\u0005I\u0011A3\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003\u0019\u0004\"!D4\n\u0005!t!aA%oi\"9!\u000eGA\u0001\n\u0003Y\u0017A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003Y>\u0004\"!D7\n\u00059t!aA!os\"9\u0001/[A\u0001\u0002\u00041\u0017a\u0001=%c!9!\u000fGA\u0001\n\u0003\u001a\u0018a\u00049s_\u0012,8\r^%uKJ\fGo\u001c:\u0016\u0003Q\u00042!\u001e=m\u001b\u00051(BA<\u000f\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003sZ\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\bwb\t\t\u0011\"\u0001}\u0003!\u0019\u0017M\\#rk\u0006dGcA?\u0002\u0002A\u0011QB`\u0005\u0003\u007f:\u0011qAQ8pY\u0016\fg\u000eC\u0004qu\u0006\u0005\t\u0019\u00017\t\u0013\u0005\u0015\u0001$!A\u0005B\u0005\u001d\u0011\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003\u0019D\u0011\"a\u0003\u0019\u0003\u0003%\t%!\u0004\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012\u0001\u0018\u0005\n\u0003#A\u0012\u0011!C!\u0003'\ta!Z9vC2\u001cHcA?\u0002\u0016!A\u0001/a\u0004\u0002\u0002\u0003\u0007AnB\u0005\u0002\u001a%\t\t\u0011#\u0003\u0002\u001c\u000591i\\;oiJL\bc\u0001\u001f\u0002\u001e\u0019A\u0011$CA\u0001\u0012\u0013\tybE\u0003\u0002\u001e\u0005\u0005b\u0004\u0005\u0005\u0002$\u0005%B\u0005\r\u0019<\u001b\t\t)CC\u0002\u0002(9\tqA];oi&lW-\u0003\u0003\u0002,\u0005\u0015\"!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8og!9a#!\b\u0005\u0002\u0005=BCAA\u000e\u0011)\tY!!\b\u0002\u0002\u0013\u0015\u0013Q\u0002\u0005\u000b\u0003k\ti\"!A\u0005\u0002\u0006]\u0012!B1qa2LHcB\u001e\u0002:\u0005m\u0012Q\b\u0005\u0007E\u0005M\u0002\u0019\u0001\u0013\t\r9\n\u0019\u00041\u00011\u0011\u00191\u00141\u0007a\u0001a!Q\u0011\u0011IA\u000f\u0003\u0003%\t)a\u0011\u0002\u000fUt\u0017\r\u001d9msR!\u0011QIA)!\u0015i\u0011qIA&\u0013\r\tIE\u0004\u0002\u0007\u001fB$\u0018n\u001c8\u0011\r5\ti\u0005\n\u00191\u0013\r\tyE\u0004\u0002\u0007)V\u0004H.Z\u001a\t\u0013\u0005M\u0013qHA\u0001\u0002\u0004Y\u0014a\u0001=%a!Q\u0011qKA\u000f\u0003\u0003%I!!\u0017\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u00037\u00022!XA/\u0013\r\tyF\u0018\u0002\u0007\u001f\nTWm\u0019;\t\u0015\u0005\r\u0014\u0002#b\u0001\n\u0013\t)'A\u0005d_VtGO]5fgV\u0011\u0011q\r\t\u0006\u0003S\nIh\u000f\b\u0005\u0003W\n)H\u0004\u0003\u0002n\u0005MTBAA8\u0015\r\t\tHB\u0001\u0007yI|w\u000e\u001e \n\u0003=I1!a\u001e\u000f\u0003\u001d\u0001\u0018mY6bO\u0016LA!a\u001f\u0002~\t!A*[:u\u0015\r\t9H\u0004\u0005\u000b\u0003\u0003K\u0001\u0012!Q!\n\u0005\u001d\u0014AC2pk:$(/[3tA!9\u0011QQ\u0005\u0005\u0002\u0005\u001d\u0015!E4fi\u000ecwn]3ti\u000e{WO\u001c;ssR)A%!#\u0002\f\"1a&a!A\u0002ABaANAB\u0001\u0004\u0001\u0004bBAH\u0013\u0011%\u0011\u0011S\u0001\nQ\u00064XM]:j]\u0016$\u0012\u0002MAJ\u0003/\u000bY*a(\t\u000f\u0005U\u0015Q\u0012a\u0001a\u0005!A.\u0019;2\u0011\u001d\tI*!$A\u0002A\nA\u0001\\8oc!9\u0011QTAG\u0001\u0004\u0001\u0014\u0001\u00027biJBq!!)\u0002\u000e\u0002\u0007\u0001'\u0001\u0003m_:\u0014\u0004")
public final class GeoUtils
{
    public static void main(final String[] args) {
        GeoUtils$.MODULE$.main(args);
    }
    
    public static void delayedInit(final Function0<BoxedUnit> body) {
        GeoUtils$.MODULE$.delayedInit(body);
    }
    
    public static String[] args() {
        return GeoUtils$.MODULE$.args();
    }
    
    public static void scala$App$_setter_$executionStart_$eq(final long x$1) {
        GeoUtils$.MODULE$.scala$App$_setter_$executionStart_$eq(x$1);
    }
    
    public static long executionStart() {
        return GeoUtils$.MODULE$.executionStart();
    }
    
    public static String getClosestCountry(final double latitude, final double longitude) {
        return GeoUtils$.MODULE$.getClosestCountry(latitude, longitude);
    }
    
    public static class Country implements Product, Serializable
    {
        private final String code;
        private final double latitude;
        private final double longitude;
        
        public String code() {
            return this.code;
        }
        
        public double latitude() {
            return this.latitude;
        }
        
        public double longitude() {
            return this.longitude;
        }
        
        public Country copy(final String code, final double latitude, final double longitude) {
            return new Country(code, latitude, longitude);
        }
        
        public String copy$default$1() {
            return this.code();
        }
        
        public double copy$default$2() {
            return this.latitude();
        }
        
        public double copy$default$3() {
            return this.longitude();
        }
        
        public String productPrefix() {
            return "Country";
        }
        
        public int productArity() {
            return 3;
        }
        
        public Object productElement(final int x$1) {
            Constable constable = null;
            switch (x$1) {
                default: {
                    throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());
                }
                case 2: {
                    constable = BoxesRunTime.boxToDouble(this.longitude());
                    break;
                }
                case 1: {
                    constable = BoxesRunTime.boxToDouble(this.latitude());
                    break;
                }
                case 0: {
                    constable = this.code();
                    break;
                }
            }
            return constable;
        }
        
        public Iterator<Object> productIterator() {
            return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
        }
        
        public boolean canEqual(final Object x$1) {
            return x$1 instanceof Country;
        }
        
        @Override
        public int hashCode() {
            return Statics.finalizeHash(Statics.mix(Statics.mix(Statics.mix(-889275714, Statics.anyHash((Object)this.code())), Statics.doubleHash(this.latitude())), Statics.doubleHash(this.longitude())), 3);
        }
        
        @Override
        public String toString() {
            return ScalaRunTime$.MODULE$._toString((Product)this);
        }
        
        @Override
        public boolean equals(final Object x$1) {
            if (this != x$1) {
                if (x$1 instanceof Country) {
                    final Country country = (Country)x$1;
                    final String code = this.code();
                    final String code2 = country.code();
                    boolean b = false;
                    Label_0103: {
                        Label_0102: {
                            if (code == null) {
                                if (code2 != null) {
                                    break Label_0102;
                                }
                            }
                            else if (!code.equals(code2)) {
                                break Label_0102;
                            }
                            if (this.latitude() == country.latitude() && this.longitude() == country.longitude() && country.canEqual(this)) {
                                b = true;
                                break Label_0103;
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
        
        public Country(final String code, final double latitude, final double longitude) {
            this.code = code;
            this.latitude = latitude;
            this.longitude = longitude;
            Product$class.$init$((Product)this);
        }
    }
    
    public static class Country$ extends AbstractFunction3<String, Object, Object, Country> implements Serializable
    {
        public static final Country$ MODULE$;
        
        static {
            new Country$();
        }
        
        public final String toString() {
            return "Country";
        }
        
        public Country apply(final String code, final double latitude, final double longitude) {
            return new Country(code, latitude, longitude);
        }
        
        public Option<Tuple3<String, Object, Object>> unapply(final Country x$0) {
            return (Option<Tuple3<String, Object, Object>>)((x$0 == null) ? None$.MODULE$ : new Some((Object)new Tuple3((Object)x$0.code(), (Object)BoxesRunTime.boxToDouble(x$0.latitude()), (Object)BoxesRunTime.boxToDouble(x$0.longitude()))));
        }
        
        private Object readResolve() {
            return Country$.MODULE$;
        }
        
        public Country$() {
            MODULE$ = this;
        }
    }
}
