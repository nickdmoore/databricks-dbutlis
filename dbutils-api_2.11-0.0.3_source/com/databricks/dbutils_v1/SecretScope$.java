// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.Some;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.runtime.AbstractFunction1;

public final class SecretScope$ extends AbstractFunction1<String, SecretScope> implements Serializable
{
    public static final SecretScope$ MODULE$;
    
    static {
        new SecretScope$();
    }
    
    public final String toString() {
        return "SecretScope";
    }
    
    public SecretScope apply(final String name) {
        return new SecretScope(name);
    }
    
    public Option<String> unapply(final SecretScope x$0) {
        return (Option<String>)((x$0 == null) ? None$.MODULE$ : new Some((Object)x$0.name()));
    }
    
    private Object readResolve() {
        return SecretScope$.MODULE$;
    }
    
    private SecretScope$() {
        MODULE$ = this;
    }
}
