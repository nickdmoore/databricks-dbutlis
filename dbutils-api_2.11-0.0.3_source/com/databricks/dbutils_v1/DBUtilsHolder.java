// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\u0006\u00011:Q!\u0001\u0002\t\u0002%\tQ\u0002\u0012\"Vi&d7\u000fS8mI\u0016\u0014(BA\u0002\u0005\u0003)!'-\u001e;jYN|f/\r\u0006\u0003\u000b\u0019\t!\u0002Z1uC\n\u0014\u0018nY6t\u0015\u00059\u0011aA2p[\u000e\u0001\u0001C\u0001\u0006\f\u001b\u0005\u0011a!\u0002\u0007\u0003\u0011\u0003i!!\u0004#C+RLGn\u001d%pY\u0012,'o\u0005\u0002\f\u001dA\u0011qBE\u0007\u0002!)\t\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\t1\u0011I\\=SK\u001aDQ!F\u0006\u0005\u0002Y\ta\u0001P5oSRtD#A\u0005\t\u000faY!\u0019!C\u00013\u0005AAMY;uS2\u001c\b'F\u0001\u001b!\rY\u0002EI\u0007\u00029)\u0011QDH\u0001\u0005Y\u0006twMC\u0001 \u0003\u0011Q\u0017M^1\n\u0005\u0005b\"AF%oQ\u0016\u0014\u0018\u000e^1cY\u0016$\u0006N]3bI2{7-\u00197\u0011\u0005)\u0019\u0013B\u0001\u0013\u0003\u0005%!%)\u0016;jYN4\u0016\u0007\u0003\u0004'\u0017\u0001\u0006IAG\u0001\nI\n,H/\u001b7ta\u0001Bq\u0001K\u0006C\u0002\u0013\u0005\u0011&A\u0004eEV$\u0018\u000e\\:\u0016\u0003\tBaaK\u0006!\u0002\u0013\u0011\u0013\u0001\u00033ckRLGn\u001d\u0011")
public final class DBUtilsHolder
{
    public static DBUtilsV1 dbutils() {
        return DBUtilsHolder$.MODULE$.dbutils();
    }
    
    public static InheritableThreadLocal<DBUtilsV1> dbutils0() {
        return DBUtilsHolder$.MODULE$.dbutils0();
    }
}
