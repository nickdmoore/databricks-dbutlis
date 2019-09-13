// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.immutable.StringOps;
import scala.Predef$;
import scala.Serializable;

public final class DBUtilsV1$ implements Serializable
{
    public static final DBUtilsV1$ MODULE$;
    private final String meta_path;
    private final String doc;
    private final String widgets_doc;
    private final String meta_doc;
    private final String fs_doc;
    private final String notebook_doc;
    private final String secrets_doc;
    private final String preview_doc;
    
    static {
        new DBUtilsV1$();
    }
    
    private String meta_path() {
        return this.meta_path;
    }
    
    private String doc() {
        return this.doc;
    }
    
    private String widgets_doc() {
        return this.widgets_doc;
    }
    
    private String meta_doc() {
        return this.meta_doc;
    }
    
    private String fs_doc() {
        return this.fs_doc;
    }
    
    private String notebook_doc() {
        return this.notebook_doc;
    }
    
    private String secrets_doc() {
        return this.secrets_doc;
    }
    
    private String preview_doc() {
        return this.preview_doc;
    }
    
    private Object readResolve() {
        return DBUtilsV1$.MODULE$;
    }
    
    private DBUtilsV1$() {
        MODULE$ = this;
        this.meta_path = "dbutils";
        this.doc = new StringOps(Predef$.MODULE$.augmentString("\n    |This module provides various utilities for users to interact with the rest of Databricks.\n  ")).stripMargin();
        this.widgets_doc = new StringOps(Predef$.MODULE$.augmentString("\n    |Methods to create and get bound value of input widgets inside notebooks.\n  ")).stripMargin();
        this.meta_doc = new StringOps(Predef$.MODULE$.augmentString("\n    |Methods to hook into the compiler (EXPERIMENTAL).\n  ")).stripMargin();
        this.fs_doc = new StringOps(Predef$.MODULE$.augmentString("\n    |Manipulates the Databricks filesystem (DBFS) from the console.\n  ")).stripMargin();
        this.notebook_doc = new StringOps(Predef$.MODULE$.augmentString("\n    |Utilities for the control flow of a notebook (EXPERIMENTAL).\n  ")).stripMargin();
        this.secrets_doc = new StringOps(Predef$.MODULE$.augmentString("\n     |Provides utilities for leveraging secrets within notebooks.\n     |Databricks documentation for more info.\n   ")).stripMargin();
        this.preview_doc = new StringOps(Predef$.MODULE$.augmentString("\n    |Utilities under preview category. Currently this includes secret module. (EXPERIMENTAL).\n  ")).stripMargin();
    }
}
