// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import com.databricks.backend.daemon.dbutils.MountInfo;
import scala.collection.Map;
import com.databricks.backend.daemon.dbutils.Default;
import com.databricks.backend.daemon.dbutils.FileInfo;
import scala.collection.Seq;
import org.apache.hadoop.fs.FileSystem;
import scala.reflect.ScalaSignature;
import scala.Serializable;

@ScalaSignature(bytes = "\u0006\u0001\teeaB\u0001\u0003!\u0003\r\t!\u0003\u0002\n\t\n47/\u0016;jYNT!a\u0001\u0003\u0002\u0015\u0011\u0014W\u000f^5mg~3\u0018G\u0003\u0002\u0006\r\u0005QA-\u0019;bEJL7m[:\u000b\u0003\u001d\t1aY8n\u0007\u0001\u0019B\u0001\u0001\u0006\u0011'A\u00111BD\u0007\u0002\u0019)\tQ\"A\u0003tG\u0006d\u0017-\u0003\u0002\u0010\u0019\t1\u0011I\\=SK\u001a\u0004\"aC\t\n\u0005Ia!\u0001D*fe&\fG.\u001b>bE2,\u0007C\u0001\u000b\u0016\u001b\u0005\u0011\u0011B\u0001\f\u0003\u0005=9\u0016\u000e\u001e5IK2\u0004X*\u001a;i_\u0012\u001c\b\"\u0002\r\u0001\r\u0003I\u0012\u0001\u00023cMN,\u0012A\u0007\t\u00037\u0011j\u0011\u0001\b\u0006\u0003;y\t!AZ:\u000b\u0005}\u0001\u0013A\u00025bI>|\u0007O\u0003\u0002\"E\u00051\u0011\r]1dQ\u0016T\u0011aI\u0001\u0004_J<\u0017BA\u0013\u001d\u0005)1\u0015\u000e\\3TsN$X-\u001c\u0005\u0006O\u00011\t\u0001K\u0001\u0003YN$\"!K \u0011\u0007)\u0012TG\u0004\u0002,a9\u0011AfL\u0007\u0002[)\u0011a\u0006C\u0001\u0007yI|w\u000e\u001e \n\u00035I!!\r\u0007\u0002\u000fA\f7m[1hK&\u00111\u0007\u000e\u0002\u0004'\u0016\f(BA\u0019\r!\t1T(D\u00018\u0015\tA\u0014(A\u0004eEV$\u0018\u000e\\:\u000b\u0005iZ\u0014A\u00023bK6|gN\u0003\u0002=\t\u00059!-Y2lK:$\u0017B\u0001 8\u0005!1\u0015\u000e\\3J]\u001a|\u0007\"\u0002!'\u0001\u0004\t\u0015a\u00013jeB\u0011!)\u0012\b\u0003\u0017\rK!\u0001\u0012\u0007\u0002\rA\u0013X\rZ3g\u0013\t1uI\u0001\u0004TiJLgn\u001a\u0006\u0003\t2AQ!\u0013\u0001\u0007\u0002)\u000b!A]7\u0015\u0007-su\n\u0005\u0002\f\u0019&\u0011Q\n\u0004\u0002\b\u0005>|G.Z1o\u0011\u0015\u0001\u0005\n1\u0001B\u0011\u001d\u0001\u0006\n%AA\u0002-\u000bqA]3dkJ\u001cX\r\u000b\u0003P%V3\u0006C\u0001\u001cT\u0013\t!vGA\u0004EK\u001a\fW\u000f\u001c;\u0002\u000bY\fG.^3\"\u0003]\u000bQAZ1mg\u0016DQ!\u0017\u0001\u0007\u0002i\u000ba!\\6eSJ\u001cHCA&\\\u0011\u0015\u0001\u0005\f1\u0001B\u0011\u0015i\u0006A\"\u0001_\u0003\t\u0019\u0007\u000f\u0006\u0003L?\u0006\u001c\u0007\"\u00021]\u0001\u0004\t\u0015\u0001\u00024s_6DQA\u0019/A\u0002\u0005\u000b!\u0001^8\t\u000fAc\u0006\u0013!a\u0001\u0017\"\"1MU+W\u0011\u00151\u0007A\"\u0001h\u0003\tig\u000f\u0006\u0003LQ&T\u0007\"\u00021f\u0001\u0004\t\u0005\"\u00022f\u0001\u0004\t\u0005b\u0002)f!\u0003\u0005\ra\u0013\u0015\u0005UJ+f\u000bC\u0003n\u0001\u0019\u0005a.\u0001\u0003iK\u0006$GcA!pc\")\u0001\u000f\u001ca\u0001\u0003\u0006!a-\u001b7f\u0011\u001d\u0011H\u000e%AA\u0002M\f\u0001\"\\1y\u0005f$Xm\u001d\t\u0003\u0017QL!!\u001e\u0007\u0003\u0007%sG\u000f\u000b\u0003r%V;\u0018%\u0001=\u0002\u000bY*Tg\r\u001c\t\u000bi\u0004a\u0011A>\u0002\u0007A,H\u000f\u0006\u0003Lyv|\b\"\u00029z\u0001\u0004\t\u0005\"\u0002@z\u0001\u0004\t\u0015\u0001C2p]R,g\u000e^:\t\u0011\u0005\u0005\u0011\u0010%AA\u0002-\u000b\u0011b\u001c<fe^\u0014\u0018\u000e^3)\t}\u0014VK\u0016\u0005\b\u0003\u000f\u0001a\u0011AA\u0005\u0003)\u0019\u0017m\u00195f)\u0006\u0014G.\u001a\u000b\u0004\u0017\u0006-\u0001bBA\u0007\u0003\u000b\u0001\r!Q\u0001\ni\u0006\u0014G.\u001a(b[\u0016Dq!!\u0005\u0001\r\u0003\t\u0019\"\u0001\u0007v]\u000e\f7\r[3UC\ndW\rF\u0002L\u0003+Aq!!\u0004\u0002\u0010\u0001\u0007\u0011\tC\u0004\u0002\u001a\u00011\t!a\u0007\u0002\u0015\r\f7\r[3GS2,7\u000fF\u0002L\u0003;A\u0001\"a\b\u0002\u0018\u0001\u0007\u0011\u0011E\u0001\u0006M&dWm\u001d\t\u0005\u0017\u0005\r\u0012)C\u0002\u0002&1\u0011!\u0002\u0010:fa\u0016\fG/\u001a3?\u0011\u001d\tI\u0003\u0001D\u0001\u0003W\tA\"\u001e8dC\u000eDWMR5mKN$2aSA\u0017\u0011!\ty\"a\nA\u0002\u0005\u0005\u0002bBA\u0019\u0001\u0019\u0005\u00111G\u0001\u0006[>,h\u000e\u001e\u000b\f\u0017\u0006U\u0012\u0011HA\u001f\u0003\u000f\n\t\u0006C\u0004\u00028\u0005=\u0002\u0019A!\u0002\rM|WO]2f\u0011\u001d\tY$a\fA\u0002\u0005\u000b!\"\\8v]R\u0004v.\u001b8u\u0011%\ty$a\f\u0011\u0002\u0003\u0007\u0011)\u0001\bf]\u000e\u0014\u0018\u0010\u001d;j_:$\u0016\u0010]3)\r\u0005u\"+VA\"C\t\t)%\u0001\u0002#E!I\u0011\u0011JA\u0018!\u0003\u0005\r!Q\u0001\u0006_^tWM\u001d\u0015\u0007\u0003\u000f\u0012V+!\u0014\"\u0005\u0005=\u0013\u0001\u00028vY2D!\"a\u0015\u00020A\u0005\t\u0019AA+\u00031)\u0007\u0010\u001e:b\u0007>tg-[4t!\u0019\t9&!\u0018B\u00036\u0011\u0011\u0011\f\u0006\u0004\u00037b\u0011AC2pY2,7\r^5p]&!\u0011qLA-\u0005\ri\u0015\r\u001d\u0015\u0007\u0003#\u0012V+a\u0019\"\u0005\u0005\u0015\u0014!G'ba:*W\u000e\u001d;z7N#(/\u001b8hY\u0001\u001aFO]5oOvCq!!\u001b\u0001\r\u0003\tY'A\u0007sK\u001a\u0014Xm\u001d5N_VtGo\u001d\u000b\u0002\u0017\"9\u0011q\u000e\u0001\u0007\u0002\u0005E\u0014AB7pk:$8\u000f\u0006\u0002\u0002tA!!FMA;!\r1\u0014qO\u0005\u0004\u0003s:$!C'pk:$\u0018J\u001c4p\u0011\u001d\ti\b\u0001D\u0001\u0003\u007f\nq!\u001e8n_VtG\u000fF\u0002L\u0003\u0003Cq!a\u000f\u0002|\u0001\u0007\u0011\tC\u0005\u0002\u0006\u0002\t\n\u0011\"\u0001\u0002\b\u0006a!/\u001c\u0013eK\u001a\fW\u000f\u001c;%eU\u0011\u0011\u0011\u0012\u0016\u0004\u0017\u0006-5FAAG!\u0011\ty)!'\u000e\u0005\u0005E%\u0002BAJ\u0003+\u000b\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0007\u0005]E\"\u0001\u0006b]:|G/\u0019;j_:LA!a'\u0002\u0012\n\tRO\\2iK\u000e\\W\r\u001a,be&\fgnY3\t\u0013\u0005}\u0005!%A\u0005\u0002\u0005\u001d\u0015\u0001D2qI\u0011,g-Y;mi\u0012\u001a\u0004\"CAR\u0001E\u0005I\u0011AAD\u00031ig\u000f\n3fM\u0006,H\u000e\u001e\u00134\u0011%\t9\u000bAI\u0001\n\u0003\tI+\u0001\biK\u0006$G\u0005Z3gCVdG\u000f\n\u001a\u0016\u0005\u0005-&fA:\u0002\f\"I\u0011q\u0016\u0001\u0012\u0002\u0013\u0005\u0011qQ\u0001\u000eaV$H\u0005Z3gCVdG\u000fJ\u001a\t\u0013\u0005M\u0006!%A\u0005\u0002\u0005U\u0016aD7pk:$H\u0005Z3gCVdG\u000fJ\u001a\u0016\u0005\u0005]&fA!\u0002\f\"I\u00111\u0018\u0001\u0012\u0002\u0013\u0005\u0011QW\u0001\u0010[>,h\u000e\u001e\u0013eK\u001a\fW\u000f\u001c;%i!I\u0011q\u0018\u0001\u0012\u0002\u0013\u0005\u0011\u0011Y\u0001\u0010[>,h\u000e\u001e\u0013eK\u001a\fW\u000f\u001c;%kU\u0011\u00111\u0019\u0016\u0005\u0003+\nYiB\u0004\u0002H\nA\t!!3\u0002\u0013\u0011\u0013gm]+uS2\u001c\bc\u0001\u000b\u0002L\u001a1\u0011A\u0001E\u0001\u0003\u001b\u001cB!a3\u000b!!A\u0011\u0011[Af\t\u0003\t\u0019.\u0001\u0004=S:LGO\u0010\u000b\u0003\u0003\u0013D!\"a6\u0002L\n\u0007I\u0011BAm\u0003%iW\r^1`a\u0006$\b.\u0006\u0002\u0002\\B!\u0011Q\\At\u001b\t\tyN\u0003\u0003\u0002b\u0006\r\u0018\u0001\u00027b]\u001eT!!!:\u0002\t)\fg/Y\u0005\u0004\r\u0006}\u0007\"CAv\u0003\u0017\u0004\u000b\u0011BAn\u0003)iW\r^1`a\u0006$\b\u000e\t\u0005\u000b\u0003_\fYM1A\u0005\n\u0005E\u0018a\u00013pGV\t\u0011\t\u0003\u0005\u0002v\u0006-\u0007\u0015!\u0003B\u0003\u0011!wn\u0019\u0011\t\u0015\u0005e\u00181\u001ab\u0001\n\u0013\t\t0\u0001\u0004mg~#wn\u0019\u0005\t\u0003{\fY\r)A\u0005\u0003\u00069An]0e_\u000e\u0004\u0003B\u0003B\u0001\u0003\u0017\u0014\r\u0011\"\u0003\u0002r\u00061!/\\0e_\u000eD\u0001B!\u0002\u0002L\u0002\u0006I!Q\u0001\be6|Fm\\2!\u0011)\u0011I!a3C\u0002\u0013%\u0011\u0011_\u0001\u000b[.$\u0017N]:`I>\u001c\u0007\u0002\u0003B\u0007\u0003\u0017\u0004\u000b\u0011B!\u0002\u00175\\G-\u001b:t?\u0012|7\r\t\u0005\u000b\u0005#\tYM1A\u0005\n\u0005E\u0018AB2q?\u0012|7\r\u0003\u0005\u0003\u0016\u0005-\u0007\u0015!\u0003B\u0003\u001d\u0019\u0007o\u00183pG\u0002B!B!\u0007\u0002L\n\u0007I\u0011BAy\u0003\u0019igo\u00183pG\"A!QDAfA\u0003%\u0011)A\u0004nm~#wn\u0019\u0011\t\u0015\t\u0005\u00121\u001ab\u0001\n\u0013\t\t0\u0001\u0005iK\u0006$w\fZ8d\u0011!\u0011)#a3!\u0002\u0013\t\u0015!\u00035fC\u0012|Fm\\2!\u0011)\u0011I#a3C\u0002\u0013%\u0011\u0011_\u0001\baV$x\fZ8d\u0011!\u0011i#a3!\u0002\u0013\t\u0015\u0001\u00039vi~#wn\u0019\u0011\t\u0015\tE\u00121\u001ab\u0001\n\u0013\t\t0\u0001\bdC\u000eDW\rV1cY\u0016|Fm\\2)\t\t=\"Q\u0007\u0016\u0005\u0005o\u0011i\u0004\u0005\u0003\u0002^\ne\u0012\u0002\u0002B\u001e\u0003?\u0014!\u0002R3qe\u0016\u001c\u0017\r^3eW\t\u0011y\u0004\u0005\u0003\u0003B\t\u001dSB\u0001B\"\u0015\u0011\u0011)%!&\u0002\t5,G/Y\u0005\u0005\u0005\u0013\u0012\u0019E\u0001\u0004hKR$XM\u001d\u0005\t\u0005\u001b\nY\r)A\u0005\u0003\u0006y1-Y2iKR\u000b'\r\\3`I>\u001c\u0007\u0005\u0003\u0006\u0003R\u0005-'\u0019!C\u0005\u0003c\f\u0001#\u001e8dC\u000eDW\rV1cY\u0016|Fm\\2)\t\t=#Q\u0007\u0005\t\u0005/\nY\r)A\u0005\u0003\u0006\tRO\\2bG\",G+\u00192mK~#wn\u0019\u0011\t\u0015\tm\u00131\u001ab\u0001\n\u0013\t\t0\u0001\bdC\u000eDWMR5mKN|Fm\\2)\t\te#Q\u0007\u0005\t\u0005C\nY\r)A\u0005\u0003\u0006y1-Y2iK\u001aKG.Z:`I>\u001c\u0007\u0005\u0003\u0006\u0003f\u0005-'\u0019!C\u0005\u0003c\f\u0001#\u001e8dC\u000eDWMR5mKN|Fm\\2)\t\t\r$Q\u0007\u0005\t\u0005W\nY\r)A\u0005\u0003\u0006\tRO\\2bG\",g)\u001b7fg~#wn\u0019\u0011\t\u0015\t=\u00141\u001ab\u0001\n\u0013\t\t0A\u0005n_VtGo\u00183pG\"A!1OAfA\u0003%\u0011)\u0001\u0006n_VtGo\u00183pG\u0002B!Ba\u001e\u0002L\n\u0007I\u0011BAy\u0003)iw.\u001e8ug~#wn\u0019\u0005\t\u0005w\nY\r)A\u0005\u0003\u0006YQn\\;oiN|Fm\\2!\u0011)\u0011y(a3C\u0002\u0013%\u0011\u0011_\u0001\u0012e\u00164'/Z:i\u001b>,h\u000e^:`I>\u001c\u0007\u0002\u0003BB\u0003\u0017\u0004\u000b\u0011B!\u0002%I,gM]3tQ6{WO\u001c;t?\u0012|7\r\t\u0005\u000b\u0005\u000f\u000bYM1A\u0005\n\u0005E\u0018aC;o[>,h\u000e^0e_\u000eD\u0001Ba#\u0002L\u0002\u0006I!Q\u0001\rk:lw.\u001e8u?\u0012|7\r\t\u0005\u000b\u0005\u001f\u000bY-!A\u0005\n\tE\u0015a\u0003:fC\u0012\u0014Vm]8mm\u0016$\"Aa%\u0011\t\u0005u'QS\u0005\u0005\u0005/\u000byN\u0001\u0004PE*,7\r\u001e")
public interface DbfsUtils extends Serializable, WithHelpMethods
{
    FileSystem dbfs();
    
    Seq<FileInfo> ls(final String p0);
    
    boolean rm(final String p0, @Default("false") final boolean p1);
    
    boolean rm$default$2();
    
    boolean mkdirs(final String p0);
    
    boolean cp(final String p0, final String p1, @Default("false") final boolean p2);
    
    boolean cp$default$3();
    
    boolean mv(final String p0, final String p1, @Default("false") final boolean p2);
    
    boolean mv$default$3();
    
    String head(final String p0, @Default("65536") final int p1);
    
    int head$default$2();
    
    boolean put(final String p0, final String p1, @Default("false") final boolean p2);
    
    boolean put$default$3();
    
    boolean cacheTable(final String p0);
    
    boolean uncacheTable(final String p0);
    
    boolean cacheFiles(final Seq<String> p0);
    
    boolean uncacheFiles(final Seq<String> p0);
    
    boolean mount(final String p0, final String p1, @Default("\"\"") final String p2, @Default("null") final String p3, @Default("Map.empty[String, String]") final Map<String, String> p4);
    
    String mount$default$3();
    
    String mount$default$4();
    
    Map<String, String> mount$default$5();
    
    boolean refreshMounts();
    
    Seq<MountInfo> mounts();
    
    boolean unmount(final String p0);
}
