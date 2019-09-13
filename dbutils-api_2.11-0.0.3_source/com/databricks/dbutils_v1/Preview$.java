// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.Some;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.runtime.AbstractFunction1;

public final class Preview$ extends AbstractFunction1<SecretUtils, Preview> implements Serializable
{
    public static final Preview$ MODULE$;
    
    static {
        new Preview$();
    }
    
    public final String toString() {
        return "Preview";
    }
    
    public Preview apply(final SecretUtils secret) {
        return new Preview(secret);
    }
    
    public Option<SecretUtils> unapply(final Preview x$0) {
        return (Option<SecretUtils>)((x$0 == null) ? None$.MODULE$ : new Some((Object)x$0.secret()));
    }
    
    private Object readResolve() {
        return Preview$.MODULE$;
    }
    
    private Preview$() {
        MODULE$ = this;
    }
}
