// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.immutable.StringOps;
import scala.Predef$;
import scala.Serializable;

public final class SecretUtils$ implements Serializable
{
    public static final SecretUtils$ MODULE$;
    private final String meta_path;
    private final String secrets_doc;
    private final String get_doc;
    private final String getBytes_doc;
    private final String list_doc;
    private final String listScopes_doc;
    
    static {
        new SecretUtils$();
    }
    
    private String meta_path() {
        return this.meta_path;
    }
    
    private String secrets_doc() {
        return this.secrets_doc;
    }
    
    private String get_doc() {
        return this.get_doc;
    }
    
    private String getBytes_doc() {
        return this.getBytes_doc;
    }
    
    private String list_doc() {
        return this.list_doc;
    }
    
    private String listScopes_doc() {
        return this.listScopes_doc;
    }
    
    private Object readResolve() {
        return SecretUtils$.MODULE$;
    }
    
    private SecretUtils$() {
        MODULE$ = this;
        this.meta_path = "dbutils.secrets";
        this.secrets_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Provides utilities for leveraging secrets within notebooks.\n      |Databricks documentation for more info.\n    ")).stripMargin();
        this.get_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Gets the string representation of a secret value with scope and key.\n      |This API assumes the secret is encoded as UTF-8 bytes. This will\n      |always be the case if you use the `string_value` write API.\n      |\n      |Example: dbutils.secrets.get(\"scope1\", \"key1\")\n      |\n      |@param scope Scope in which the secret was created\n      |@param key Key with which the secret was created\n    ")).stripMargin();
        this.getBytes_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Gets the bytes representation of a secret value with scope and key.\n      |\n      |Example: dbutils.secrets.getBytes(\"scope1\", \"key1\")\n      |\n      |@param scope Scope in which the secret was created\n      |@param key Key with which the secret was created\n    ")).stripMargin();
        this.list_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Lists secret metadata for secrets within a scope.\n      |\n      |Example: dbutils.secrets.list(\"scope2\")\n      |\n      |@param scope Scope in which secrets were created\n    ")).stripMargin();
        this.listScopes_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Lists secret scopes.\n      |\n      |Example: dbutils.secrets.listScopes()\n    ")).stripMargin();
    }
}
