// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class DBUtilsHolder$
{
    public static final DBUtilsHolder$ MODULE$;
    private final InheritableThreadLocal<DBUtilsV1> dbutils0;
    private final DBUtilsV1 dbutils;
    
    static {
        new DBUtilsHolder$();
    }
    
    public InheritableThreadLocal<DBUtilsV1> dbutils0() {
        return this.dbutils0;
    }
    
    public DBUtilsV1 dbutils() {
        return this.dbutils;
    }
    
    private DBUtilsHolder$() {
        MODULE$ = this;
        this.dbutils0 = new InheritableThreadLocal<DBUtilsV1>();
        this.dbutils = (DBUtilsV1)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] { DBUtilsV1.class }, (InvocationHandler)new DBUtilsHolder$$anon.DBUtilsHolder$$anon$1());
    }
}
