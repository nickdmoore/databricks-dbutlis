// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.Predef$;
import scala.collection.Map;

public abstract class DbfsUtils$class
{
    public static boolean rm$default$2(final DbfsUtils $this) {
        return false;
    }
    
    public static boolean cp$default$3(final DbfsUtils $this) {
        return false;
    }
    
    public static boolean mv$default$3(final DbfsUtils $this) {
        return false;
    }
    
    public static int head$default$2(final DbfsUtils $this) {
        return 65536;
    }
    
    public static boolean put$default$3(final DbfsUtils $this) {
        return false;
    }
    
    public static String mount$default$3(final DbfsUtils $this) {
        return "";
    }
    
    public static String mount$default$4(final DbfsUtils $this) {
        return null;
    }
    
    public static Map mount$default$5(final DbfsUtils $this) {
        return (Map)Predef$.MODULE$.Map().empty();
    }
    
    public static void $init$(final DbfsUtils $this) {
    }
}
