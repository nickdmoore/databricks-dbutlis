// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.Some;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.runtime.AbstractFunction1;

public final class SecretMetadata$ extends AbstractFunction1<String, SecretMetadata> implements Serializable
{
    public static final SecretMetadata$ MODULE$;
    
    static {
        new SecretMetadata$();
    }
    
    public final String toString() {
        return "SecretMetadata";
    }
    
    public SecretMetadata apply(final String key) {
        return new SecretMetadata(key);
    }
    
    public Option<String> unapply(final SecretMetadata x$0) {
        return (Option<String>)((x$0 == null) ? None$.MODULE$ : new Some((Object)x$0.key()));
    }
    
    private Object readResolve() {
        return SecretMetadata$.MODULE$;
    }
    
    private SecretMetadata$() {
        MODULE$ = this;
    }
}
