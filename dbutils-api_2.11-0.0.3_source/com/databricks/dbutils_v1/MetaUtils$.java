// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.Seq;
import scala.StringContext;
import scala.collection.immutable.StringOps;
import scala.Predef$;
import scala.Serializable;

public final class MetaUtils$ implements Serializable
{
    public static final MetaUtils$ MODULE$;
    private final String meta_path;
    private final String doc;
    private final String define_doc;
    
    static {
        new MetaUtils$();
    }
    
    private String meta_path() {
        return this.meta_path;
    }
    
    private String doc() {
        return this.doc;
    }
    
    private String define_doc() {
        return this.define_doc;
    }
    
    private Object readResolve() {
        return MetaUtils$.MODULE$;
    }
    
    private MetaUtils$() {
        MODULE$ = this;
        this.meta_path = "dbutils.meta";
        this.doc = new StringOps(Predef$.MODULE$.augmentString(":: Experimental API ::<br><br>\n      |\n      |<b>notebookUtils.meta</b> provides utilities for working with source and class files\n      |directly.\n      |\n      |For more info about a method, use <b>notebookUtils.meta.help(\"methodName\")</b>.\n    ")).stripMargin();
        this.define_doc = new StringOps(Predef$.MODULE$.augmentString(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "\n      |:: Experimental API ::\n      |\n      |Compiles a class or object within the given package. Multiple class/object definitions\n      |may appear within the same code block, though one-per-method call is recommended.\n      |\n      |Example:\n      |  define(\"org.apache.spark\",\n      |    ", "\n      |    |import java.io.File\n      |    |case class MyDataClass(num: Int, location: File)\n      |    ", ".stripMargin)\n      |\n      |  val data = sc.parallelize(0 until 10).map { i =>\n      |    org.apache.spark.MyDataClass(i, new java.io.File(\"file\" + i))\n      |  }.collect()\n      |  data.map(_._location).foreach(println)\n      |\n      |It is not legal to redefine a class or object after using it. An error will not be\n      |immediately thrown, but the class is no longer valid for use.\n      |The behavior of redefining a class before using it is undefined.\n      |It is legal to redefine a class if it was never compiled successfully.\n      |\n      |Classes defined by this method are available on a per-cluster basis, meaning that they will\n      |be accessible by any notebook running on this cluster. Additionally, the pitfalls regarding\n      |redefinition also apply on a per-cluster basis.\n      |\n      |Two convenience features are provided to help using this method:\n      |  1. Calling this method with the exact same package/code Strings will not cause the\n      |     compiler to be invoked twice. The result of the original compilation will be returned\n      |     instead.\n      |  2. If the provided code already includes the expected package declaration, it will be\n      |     stripped out. If the package declaration does not correspond exactly to the given\n      |     packageName, an exception will be thrown instead to prevent accidental nesting.\n      |\n      |@param packageName Package in which to compile the code.\n      |@param code String of text to be compiled, similar to what would run in a notebook.\n      |@return True if the code was compiled successfully.\n      " })).s((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { "\"\"\"", "\"\"\"" })))).stripMargin();
    }
}
