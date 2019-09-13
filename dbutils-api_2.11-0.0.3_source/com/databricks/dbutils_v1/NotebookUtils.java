// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import com.databricks.backend.common.rpc.CommandContext;
import com.databricks.WorkflowException;
import scala.collection.Map;
import scala.reflect.ScalaSignature;
import com.databricks.annotation.DBUtilsPy4JWhitelist;
import scala.Serializable;

@DBUtilsPy4JWhitelist
@ScalaSignature(bytes = "\u0006\u0001\u0005%baB\u0001\u0003!\u0003\r\t!\u0003\u0002\u000e\u001d>$XMY8pWV#\u0018\u000e\\:\u000b\u0005\r!\u0011A\u00033ckRLGn]0wc)\u0011QAB\u0001\u000bI\u0006$\u0018M\u0019:jG.\u001c(\"A\u0004\u0002\u0007\r|Wn\u0001\u0001\u0014\t\u0001Q\u0001c\u0005\t\u0003\u00179i\u0011\u0001\u0004\u0006\u0002\u001b\u0005)1oY1mC&\u0011q\u0002\u0004\u0002\u0007\u0003:L(+\u001a4\u0011\u0005-\t\u0012B\u0001\n\r\u00051\u0019VM]5bY&T\u0018M\u00197f!\t!R#D\u0001\u0003\u0013\t1\"AA\bXSRD\u0007*\u001a7q\u001b\u0016$\bn\u001c3t\u0011\u0015A\u0002A\"\u0001\u001a\u0003\u0011)\u00070\u001b;\u0015\u0005ii\u0002CA\u0006\u001c\u0013\taBB\u0001\u0003V]&$\b\"\u0002\u0010\u0018\u0001\u0004y\u0012!\u0002<bYV,\u0007C\u0001\u0011$\u001d\tY\u0011%\u0003\u0002#\u0019\u00051\u0001K]3eK\u001aL!\u0001J\u0013\u0003\rM#(/\u001b8h\u0015\t\u0011C\u0002C\u0003(\u0001\u0019\u0005\u0001&A\u0002sk:$RaH\u0015,aaBQA\u000b\u0014A\u0002}\tA\u0001]1uQ\")AF\na\u0001[\u0005qA/[7f_V$8+Z2p]\u0012\u001c\bCA\u0006/\u0013\tyCBA\u0002J]RDq!\r\u0014\u0011\u0002\u0003\u0007!'A\u0005be\u001e,X.\u001a8ugB!1GN\u0010 \u001b\u0005!$BA\u001b\r\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003oQ\u00121!T1q\u0011\u001dId\u0005%AA\u0002}\tqdX0eCR\f'M]5dWNLe\u000e^3s]\u0006d7\t\\;ti\u0016\u00148\u000b]3dQ\r13H\u0011\t\u0004\u0017qr\u0014BA\u001f\r\u0005\u0019!\bN]8xgB\u0011q\bQ\u0007\u0002\t%\u0011\u0011\t\u0002\u0002\u0012/>\u00148N\u001a7po\u0016C8-\u001a9uS>t\u0017%A\"\u0002C%3\u0007\u0005\u001e5fA]|'o\u001b4m_^\u0004S\r_3dkRLwN\u001c\u0011gC&dW\r\u001a\u0018\t\u000b\u0015\u0003a\u0011\u0001$\u0002\u0015\u001d,GoQ8oi\u0016DH\u000fF\u0001H!\tAu*D\u0001J\u0015\tQ5*A\u0002sa\u000eT!\u0001T'\u0002\r\r|W.\\8o\u0015\tqE!A\u0004cC\u000e\\WM\u001c3\n\u0005AK%AD\"p[6\fg\u000eZ\"p]R,\u0007\u0010\u001e\u0005\u0006%\u00021\taU\u0001\u000bg\u0016$8i\u001c8uKb$HC\u0001\u000eU\u0011\u0015)\u0016\u000b1\u0001H\u0003\r\u0019G\u000f\u001f\u0005\b/\u0002\t\n\u0011\"\u0001Y\u00035\u0011XO\u001c\u0013eK\u001a\fW\u000f\u001c;%gU\t\u0011L\u000b\u000235.\n1\f\u0005\u0002]C6\tQL\u0003\u0002_?\u0006IQO\\2iK\u000e\\W\r\u001a\u0006\u0003A2\t!\"\u00198o_R\fG/[8o\u0013\t\u0011WLA\tv]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u001a\u0001\u0012\u0002\u0013\u0005Q-A\u0007sk:$C-\u001a4bk2$H\u0005N\u000b\u0002M*\u0012qD\u0017\u0015\u0003\u0001!\u0004\"![6\u000e\u0003)T!\u0001\u0019\u0003\n\u00051T'\u0001\u0006#C+RLGn\u001d)zi);\u0006.\u001b;fY&\u001cHoB\u0003o\u0005!\u0005q.A\u0007O_R,'m\\8l+RLGn\u001d\t\u0003)A4Q!\u0001\u0002\t\u0002E\u001c2\u0001\u001d\u0006\u0011\u0011\u0015\u0019\b\u000f\"\u0001u\u0003\u0019a\u0014N\\5u}Q\tq\u000eC\u0004wa\n\u0007I\u0011B<\u0002\u00135,G/Y0qCRDW#\u0001=\u0011\u0005etX\"\u0001>\u000b\u0005md\u0018\u0001\u00027b]\u001eT\u0011!`\u0001\u0005U\u00064\u0018-\u0003\u0002%u\"9\u0011\u0011\u00019!\u0002\u0013A\u0018AC7fi\u0006|\u0006/\u0019;iA!I\u0011Q\u00019C\u0002\u0013%\u0011qA\u0001\u0004I>\u001cW#A\u0010\t\u000f\u0005-\u0001\u000f)A\u0005?\u0005!Am\\2!\u0011%\ty\u0001\u001db\u0001\n\u0013\t9!\u0001\u0005fq&$x\fZ8d\u0011\u001d\t\u0019\u0002\u001dQ\u0001\n}\t\u0011\"\u001a=ji~#wn\u0019\u0011\t\u0013\u0005]\u0001O1A\u0005\n\u0005\u001d\u0011a\u0002:v]~#wn\u0019\u0005\b\u00037\u0001\b\u0015!\u0003 \u0003!\u0011XO\\0e_\u000e\u0004\u0003\"CA\u0010a\u0006\u0005I\u0011BA\u0011\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005\r\u0002cA=\u0002&%\u0019\u0011q\u0005>\u0003\r=\u0013'.Z2u\u0001")
public interface NotebookUtils extends Serializable, WithHelpMethods
{
    void exit(final String p0);
    
    String run(final String p0, final int p1, final Map<String, String> p2, final String p3) throws WorkflowException;
    
    Map<String, String> run$default$3();
    
    String run$default$4();
    
    CommandContext getContext();
    
    void setContext(final CommandContext p0);
}
