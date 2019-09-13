// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.immutable.StringOps;
import scala.collection.immutable.Nil$;
import scala.collection.Seq;
import scala.StringContext;
import scala.Predef$;
import scala.Serializable;

public final class NotebookUtils$ implements Serializable
{
    public static final NotebookUtils$ MODULE$;
    private final String meta_path;
    private final String doc;
    private final String exit_doc;
    private final String run_doc;
    
    static {
        new NotebookUtils$();
    }
    
    private String meta_path() {
        return this.meta_path;
    }
    
    private String doc() {
        return this.doc;
    }
    
    private String exit_doc() {
        return this.exit_doc;
    }
    
    private String run_doc() {
        return this.run_doc;
    }
    
    private Object readResolve() {
        return NotebookUtils$.MODULE$;
    }
    
    private NotebookUtils$() {
        MODULE$ = this;
        this.meta_path = "dbutils.notebook";
        this.doc = new StringOps(Predef$.MODULE$.augmentString(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "\n    |The notebook module.\n  " })).s((Seq)Nil$.MODULE$))).stripMargin();
        this.exit_doc = new StringOps(Predef$.MODULE$.augmentString(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "\n    |This method lets you exit a notebook with a value.\n    |\n    |@param value the value to return when exiting\n  " })).s((Seq)Nil$.MODULE$))).stripMargin();
        this.run_doc = new StringOps(Predef$.MODULE$.augmentString(new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[] { "\n    |This method runs a notebook and returns its exit value. The notebook will run\n    |in the current cluster by default.\n    |\n    |@param path relative path to the notebook, e.g. ../path/to/notebook\n    |@param timeoutSeconds timeout in seconds for the called notebook. If the run failed\n    |                      to finish within this time, this method will throw an exception.\n    |                      Note that currently, if the Databricks web application is down\n    |                      for more than 10 minutes, the run will fail regardless of this\n    |                      parameter.\n    |@param arguments string map of arguments to pass to the notebook\n    |@param __databricksInternalClusterSpec\n    |\n    |@return the string returned by dbutils.notebook.exit() or null\n    |@throws WorkflowException if the notebook run did not complete successfully\n  " })).s((Seq)Nil$.MODULE$))).stripMargin();
    }
}
