// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.immutable.StringOps;
import scala.Predef$;
import scala.Serializable;

public final class WidgetsUtils$ implements Serializable
{
    public static final WidgetsUtils$ MODULE$;
    private final String meta_path;
    private final String doc;
    private final String text_doc;
    private final String dropdown_doc;
    private final String combobox_doc;
    private final String multiselect_doc;
    private final String get_doc;
    private final String getArgument_doc;
    private final String remove_doc;
    private final String removeAll_doc;
    private final String getWidgetsSerializationHelp;
    
    static {
        new WidgetsUtils$();
    }
    
    private String meta_path() {
        return this.meta_path;
    }
    
    private String doc() {
        return this.doc;
    }
    
    private String text_doc() {
        return this.text_doc;
    }
    
    private String dropdown_doc() {
        return this.dropdown_doc;
    }
    
    private String combobox_doc() {
        return this.combobox_doc;
    }
    
    private String multiselect_doc() {
        return this.multiselect_doc;
    }
    
    private String get_doc() {
        return this.get_doc;
    }
    
    private String getArgument_doc() {
        return this.getArgument_doc;
    }
    
    private String remove_doc() {
        return this.remove_doc;
    }
    
    private String removeAll_doc() {
        return this.removeAll_doc;
    }
    
    public String getWidgetsSerializationHelp() {
        return this.getWidgetsSerializationHelp;
    }
    
    private Object readResolve() {
        return WidgetsUtils$.MODULE$;
    }
    
    private WidgetsUtils$() {
        MODULE$ = this;
        this.meta_path = "dbutils.widgets";
        this.doc = new StringOps(Predef$.MODULE$.augmentString("<b>dbutils.widgets</b> provides utilities for working with notebook widgets. You can create\n      |different types of widgets and get their bound value.\n      |\n      |For more info about a method, use <b>dbutils.widgets.help(\"methodName\")</b>.\n    ")).stripMargin();
        this.text_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Creates a text input widget with a given name and default value. Optionally, you can provide\n      |a label for the text widget that will be rendered in place of the name. If widget with a\n      |given name already exists, its properties will be overwritten.\n      |\n      |Example: dbutils.widgets.text(\"product\", \"Camera\", label = \"Product Name\")\n      |\n      |@param name unique name identifying the widget\n      |@param defaultValue value with which widget is populated by default\n      |@param label optional widget label\n    ")).stripMargin();
        this.dropdown_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Creates a dropdown input widget a with given name, default value and choices. Optionally, you\n      |can provide a label for the dropdown widget that will be rendered in place of the name. If a\n      |widget with a given name already exists, its properties will be overwritten. The\n      |default value must be one of choices.\n      |\n      |Example: dbutils.widgets.dropdown(\"product\", \"Camera\", Seq(\"Camera\", \"GPS\", \"Smartphone\"))\n      |\n      |@param name unique name identifying the widget\n      |@param defaultValue value value which widget is populated by default. Must be one of choices\n      |@param choices possible choices for the dropdown menu\n      |@param label optional widget label\n    ")).stripMargin();
        this.combobox_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Creates a combobox input widget with a given name, default value and choices. Optionally, you\n      |can provide a label for the combobox widget that will be rendered in place of the name. If a\n      |widget with a given name already exists, its properties will be overwritten. The default\n      |value does not have to be one choices.\n      |\n      |Example: dbutils.widgets.combobox(\"product\", \"Other\", Seq(\"Camera\", \"GPS\", \"Smartphone\"))\n      |\n      |@param name unique name identifying the widget\n      |@param defaultValue value value which widget is populated by default\n      |@param choices possible choices for the dropdown menu\n      |@param label optional widget label\n    ")).stripMargin();
        this.multiselect_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Creates a multiselect input widget with a given name, default value and choices. Optionally,\n      |you can provide a label for the dropdown widget that will be rendered in place of the name.\n      |If a widget with a given name already exists, its properties will be overwritten. The default\n      |value must be one of choices.\n      |\n      |When using dbutils.widgets.get() with a multiselect widget, you get a string of\n      |comma delimited items that are selected by user.\n      |\n      |Example: dbutils.widgets.multiselect(\"product\", \"Camera\", Seq(\"Camera\", \"GPS\", \"Smartphone\"))\n      |\n      |@param name unique name identifying the widget\n      |@param defaultValue value value which widget is populated by default. Must be one of choices\n      |@param choices possible choices for the dropdown menu\n      |@param label optional widget label\n    ")).stripMargin();
        this.get_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Retrieves current value of an input widget. The widget is identified by its unique name. If\n      |a widget with given name does not exist an error is generated.\n      |\n      |Example: dbutils.widgets.get(\"product\")\n      |\n      |@param name unique name identifying the widget\n    ")).stripMargin();
        this.getArgument_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |(DEPRECATED) Equivalent to get. Retrieves current value of an input widget.\n      |The widget is identified by its unique name. If a widget with given name does not exist an\n      |error is generated.\n      |\n      |Example: dbutils.widgets.getArgument(\"product\")\n      |\n      |@param name unique name identifying the widget\n      |@param optional default value if widget is not present.\n    ")).stripMargin();
        this.remove_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Removes an input widget from the notebook. The widget is identified by its unique name.\n      |\n      |Example: dbutils.widgets.remove(\"product\")\n      |\n      |@param name unique name of the widget to be removed\n    ")).stripMargin();
        this.removeAll_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Removes all widgets in the notebook.\n      |\n      |Example: dbutils.widgets.removeAll()\n    ")).stripMargin();
        this.getWidgetsSerializationHelp = new StringOps(Predef$.MODULE$.augmentString("\n      |dbutils.widgets functions cannot be used within a spark job.\n      | If you need to use dbutils.widgets.get within a spark job, you have to retrieve the\n      | argument before using it in the job. For example, if you have the following code:\n      |\n      | myRdd.map(x => dbutils.widgets.get(\"ARG\") + x.toString)\n      |\n      | then you should rewrite it this way:\n      |\n      | val arg = dbutils.widgets.get(\"ARG\")\n      | myRdd.map(x => arg + x.toString)\n    ")).stripMargin();
    }
}
