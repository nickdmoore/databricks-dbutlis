// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks;

import scala.math.package$;
import scala.Predef$;
import scala.runtime.RichDouble$;
import scala.math.Ordering;
import scala.collection.immutable.List$;
import scala.collection.TraversableOnce;
import scala.Tuple2;
import scala.App$class;
import scala.collection.Iterator;
import java.net.URL;
import scala.Function1;
import scala.io.Codec$;
import scala.io.Source$;
import scala.runtime.BoxedUnit;
import scala.Function0;
import scala.collection.mutable.ListBuffer;
import scala.collection.immutable.List;
import scala.App;

public final class GeoUtils$ implements App
{
    public static final GeoUtils$ MODULE$;
    private List<GeoUtils.Country> countries;
    private final long executionStart;
    private String[] scala$App$$_args;
    private final ListBuffer<Function0<BoxedUnit>> scala$App$$initCode;
    private volatile boolean bitmap$0;
    
    static {
        new GeoUtils$();
    }
    
    private List countries$lzycompute() {
        synchronized (this) {
            if (!this.bitmap$0) {
                final URL geocodesUrl = this.getClass().getClassLoader().getResource("country_geocodes.csv");
                if (geocodesUrl == null) {
                    throw new IllegalStateException("Could not find 'country_geocodes.csv' to perform reverse geo lookups");
                }
                final Iterator geocodes = Source$.MODULE$.fromURL(geocodesUrl, Codec$.MODULE$.fallbackSystemCodec()).getLines();
                geocodes.next();
                this.countries = (List<GeoUtils.Country>)geocodes.map((Function1)new GeoUtils$$anonfun$countries.GeoUtils$$anonfun$countries$1()).map((Function1)new GeoUtils$$anonfun$countries.GeoUtils$$anonfun$countries$2()).toList();
                this.bitmap$0 = true;
            }
            final BoxedUnit unit = BoxedUnit.UNIT;
            return this.countries;
        }
    }
    
    public long executionStart() {
        return this.executionStart;
    }
    
    public String[] scala$App$$_args() {
        return this.scala$App$$_args;
    }
    
    public void scala$App$$_args_$eq(final String[] x$1) {
        this.scala$App$$_args = x$1;
    }
    
    public ListBuffer<Function0<BoxedUnit>> scala$App$$initCode() {
        return this.scala$App$$initCode;
    }
    
    public void scala$App$_setter_$executionStart_$eq(final long x$1) {
        this.executionStart = x$1;
    }
    
    public void scala$App$_setter_$scala$App$$initCode_$eq(final ListBuffer x$1) {
        this.scala$App$$initCode = (ListBuffer<Function0<BoxedUnit>>)x$1;
    }
    
    public String[] args() {
        return App$class.args((App)this);
    }
    
    @Deprecated
    public void delayedInit(final Function0<BoxedUnit> body) {
        App$class.delayedInit((App)this, (Function0)body);
    }
    
    public void main(final String[] args) {
        App$class.main((App)this, args);
    }
    
    private List<GeoUtils.Country> countries() {
        return (List<GeoUtils.Country>)(this.bitmap$0 ? this.countries : this.countries$lzycompute());
    }
    
    public String getClosestCountry(final double latitude, final double longitude) {
        return ((GeoUtils.Country)((Tuple2)((TraversableOnce)this.countries().map((Function1)new GeoUtils$$anonfun$getClosestCountry.GeoUtils$$anonfun$getClosestCountry$1(latitude, longitude), List$.MODULE$.canBuildFrom())).minBy((Function1)new GeoUtils$$anonfun$getClosestCountry.GeoUtils$$anonfun$getClosestCountry$2(), (Ordering)Ordering.Double$.MODULE$))._2()).code();
    }
    
    public double com$databricks$GeoUtils$$haversine(final double lat1, final double lon1, final double lat2, final double lon2) {
        final double R = 6372.8;
        final double dLat = RichDouble$.MODULE$.toRadians$extension(Predef$.MODULE$.doubleWrapper(lat2 - lat1));
        final double dLon = RichDouble$.MODULE$.toRadians$extension(Predef$.MODULE$.doubleWrapper(lon2 - lon1));
        final double a = package$.MODULE$.pow(package$.MODULE$.sin(dLat / 2), 2.0) + package$.MODULE$.pow(package$.MODULE$.sin(dLon / 2), 2.0) * package$.MODULE$.cos(RichDouble$.MODULE$.toRadians$extension(Predef$.MODULE$.doubleWrapper(lat1))) * package$.MODULE$.cos(RichDouble$.MODULE$.toRadians$extension(Predef$.MODULE$.doubleWrapper(lat2)));
        final double c = 2 * package$.MODULE$.asin(package$.MODULE$.sqrt(a));
        return R * c;
    }
    
    private GeoUtils$() {
        App$class.$init$((App)(MODULE$ = this));
    }
}
