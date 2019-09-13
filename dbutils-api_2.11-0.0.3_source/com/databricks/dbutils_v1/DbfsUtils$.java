// 
// Decompiled by Procyon v0.5.36
// 

package com.databricks.dbutils_v1;

import scala.collection.immutable.StringOps;
import scala.Predef$;
import scala.Serializable;

public final class DbfsUtils$ implements Serializable
{
    public static final DbfsUtils$ MODULE$;
    private final String meta_path;
    private final String doc;
    private final String ls_doc;
    private final String rm_doc;
    private final String mkdirs_doc;
    private final String cp_doc;
    private final String mv_doc;
    private final String head_doc;
    private final String put_doc;
    private final String cacheTable_doc;
    private final String uncacheTable_doc;
    private final String cacheFiles_doc;
    private final String uncacheFiles_doc;
    private final String mount_doc;
    private final String mounts_doc;
    private final String refreshMounts_doc;
    private final String unmount_doc;
    
    static {
        new DbfsUtils$();
    }
    
    private String meta_path() {
        return this.meta_path;
    }
    
    private String doc() {
        return this.doc;
    }
    
    private String ls_doc() {
        return this.ls_doc;
    }
    
    private String rm_doc() {
        return this.rm_doc;
    }
    
    private String mkdirs_doc() {
        return this.mkdirs_doc;
    }
    
    private String cp_doc() {
        return this.cp_doc;
    }
    
    private String mv_doc() {
        return this.mv_doc;
    }
    
    private String head_doc() {
        return this.head_doc;
    }
    
    private String put_doc() {
        return this.put_doc;
    }
    
    @Deprecated
    private String cacheTable_doc() {
        return this.cacheTable_doc;
    }
    
    @Deprecated
    private String uncacheTable_doc() {
        return this.uncacheTable_doc;
    }
    
    @Deprecated
    private String cacheFiles_doc() {
        return this.cacheFiles_doc;
    }
    
    @Deprecated
    private String uncacheFiles_doc() {
        return this.uncacheFiles_doc;
    }
    
    private String mount_doc() {
        return this.mount_doc;
    }
    
    private String mounts_doc() {
        return this.mounts_doc;
    }
    
    private String refreshMounts_doc() {
        return this.refreshMounts_doc;
    }
    
    private String unmount_doc() {
        return this.unmount_doc;
    }
    
    private Object readResolve() {
        return DbfsUtils$.MODULE$;
    }
    
    private DbfsUtils$() {
        MODULE$ = this;
        this.meta_path = "dbutils.fs";
        this.doc = new StringOps(Predef$.MODULE$.augmentString("<b>dbutils.fs</b> provides utilities for working with FileSystems. Most methods in\n      |this package can take either a DBFS path (e.g., \"/foo\" or \"dbfs:/foo\"), or\n      |another FileSystem URI.\n      |\n      |For more info about a method, use <b>dbutils.fs.help(\"methodName\")</b>.\n      |\n      |In notebooks, you can also use the %fs shorthand to access DBFS. The %fs shorthand maps\n      |straightforwardly onto dbutils calls. For example, \"%fs head --maxBytes=10000 /file/path\"\n      |translates into \"dbutils.fs.head(\"/file/path\", maxBytes = 10000)\".\n    ")).stripMargin();
        this.ls_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Lists the contents of a directory.\n      |\n      |Example: display(ls(\"/mnt/my-folder/\"))\n      |\n      |The FileInfo object that is returned has the following helper methods:\n      |val files = ls(\"/mnt/my-folder/\")\n      |files.map(_.name)    // [myFile, myDir/]\n      |files.map(_.length)  // [1286, 0]\n      |files.map(_.path)    // [/mnt/my-folder/myFile, /mnt/my-folder/myDir/]\n      |files.map(_.isDir)   // [false, true]\n      |files.map(_.isFile)  // [true, false]\n      |\n      |@param dir FileSystem URI\n      |@return Ordered sequence of FileInfos containing the name and size of each file.\n    ")).stripMargin();
        this.rm_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Removes a file or directory.\n      |\n      |Example: rm(\"/mnt/my-folder/\", true)\n      |\n      |@param dir FileSystem URI for a single file or a directory\n      |@param recurse if true, all files and directories will be recursively deleted\n      |@return true if the file or directory was present and is now deleted\n    ")).stripMargin();
        this.mkdirs_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Creates the given directory if it does not exist, also creating any necessary parent\n      |directories.\n      |\n      |Example: mkdirs(\"/mnt/my-folder/a/b/c\")\n      |\n      |@param dir FileSystem URI\n      |@return true if the directory was successfully created\n    ")).stripMargin();
        this.cp_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Copies a file or directory, possibly across FileSystems..\n      |\n      |Example: cp(\"/mnt/my-folder/a\", \"s3n://bucket/b\")\n      |\n      |@param from FileSystem URI of the source file or directory\n      |@param to FileSystem URI of the destination file or directory\n      |@param recurse if true, all files and directories will be recursively copied\n      |@return true if all files were successfully copied\n    ")).stripMargin();
        this.mv_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Moves a file or directory, possibly across FileSystems.\n      |This is implemented as a copy followed by delete, even for intra-FileSystem moves.\n      |\n      |Example: mv(\"/mnt/my-folder/a\", \"s3n://bucket/b\")\n      |\n      |@param from FileSystem URI of the source file or directory\n      |@param to FileSystem URI of the destination file or directory\n      |@param recurse if true, all files and directories will be recursively moved\n      |@return true if the move was successful (so 'from' is deleted and 'to' contains the data)\n    ")).stripMargin();
        this.head_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Returns up to the first 'maxBytes' bytes of the given file as a String encoded in UTF-8.\n      |\n      |Example: head(\"/mnt/my-folder/my-file\")\n      |\n      |@param file FileSystem URI\n      |@param maxBytes Maximum number of bytes to read\n      |@return String containing contents of the file, possibly truncated to the max bytes.\n      |@throws IllegalArgumentException if the file is actually a directory.\n    ")).stripMargin();
        this.put_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Writes the given String out to a file, encoded in UTF-8.\n      |\n      |Example: put(\"/mnt/my-folder/my-file\", \"Hello world!\", true)\n      |\n      |@param file FileSystem URI\n      |@param contents Contents of file to write, encoded in System default charset.\n      |@param overwrite If set to true, the file will be overwritten if it existed already.\n      |                 Note that if overwrite is true and the the write fails, the original file\n      |                 may still be deleted.\n    ")).stripMargin();
        this.cacheTable_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |NOTE: This feature is a no-op as of Jan 1, 2017 unless you have specifically opted\n      |in to DBFS caching. Please contact help@databricks.com if you have questions or concerns.\n      |\n      |Caches the contents of the given table on the local SSDs of this cluster. The provided\n      |table must be backed by files stored in DBFS or S3; this cannot cache arbitrary tables\n      |constructed via transformations.\n      |\n      |Note that this simply calls cacheFiles() after looking up the location of the source data\n      |for this table, so the cache is actually based on the files, not the metadata of the table.\n      |For instance, if another table uses the same underlying data as this one, it will also\n      |start using the cache.\n      |\n      |See the documentation for cacheFiles() for the semantics of this cache, and how it differs\n      |from normal sqlContext.cacheTable().\n      |\n      |Example: cacheTable(\"sales\")\n      |\n      |@param tableName name of the Hive or registered temp table.\n      |@return True if the table was successfully cached or re-cached.\n    ")).stripMargin();
        this.uncacheTable_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |NOTE: This feature is a no-op as of Jan 1, 2017 unless you have specifically opted\n      |in to DBFS caching. Please contact help@databricks.com if you have questions or concerns.\n      |\n      |Removes the cached version of the given table from SSDs. If the table is not cached, this\n      |will do nothing.\n      |\n      |Example: uncacheTable(\"sales\")\n      |\n      |@param tableName name of the Hive or registered temp table that was previously cached.\n      |@return True if the table was successfully uncached (or wasn't cached originally).\n    ")).stripMargin();
        this.cacheFiles_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |NOTE: This feature is a no-op as of Jan 1, 2017 unless you have specifically opted\n      |in to DBFS caching. Please contact help@databricks.com if you have questions or concerns.\n      |\n      |Caches a set of files on the local SSDs of this cluster. This will ignore directories, and\n      |will not recursively cache. Already-cached files will be uncached and re-cached. (In order\n      |to recursively cache, you can use fs.ls() in a recursive manner to list all the files you\n      |wish to cache.)\n      |\n      |This manner of caching differs in several fundamental ways from RDD caching. Most\n      |importantly, cached data is persistent in the face of Spark crashes or being restarted,\n      |as the cache metadata is handled by DBFS, not Spark itself. The cached data is also shared\n      |among all clusters in the shard.\n      |\n      |Cached data always resides in local SSDs, not memory (save for OS buffer cache). It remains\n      |in the data's serialized form, so the size of the cached data is equivalent to the size of\n      |the files you're caching.\n      |\n      |The cache is as long-lived as the machines on which the SSDs are placed. This means that\n      |the data will survive a \"restart cluster\" operation, but will not survive termination of\n      |the instances. Data is not automatically re-cached or moved, so when an instance is lost,\n      |you must explicitly call cacheFiles() again in order to repopulate the local SSDs of your\n      |cluster (though other clusters and instances can access this data remotely). In order to\n      |improve performance when clusters are scaled up and down, you should recache your data.\n      |\n      |Further, data is not automatically evicted from the cache. In order to make room for new\n      |cached data, you must delete previously cached data, similar to the model of a disk.\n      |\n      |Examples:\n      |cacheFiles(\"/my-folder/foo-0\", \"/my-folder/foo-1\", \"/baz\")\n      |cacheFiles(fs.ls(\"/my-folder/\").map(_.name): _*) // \": _*\" turns Seq into a list of names\n      |\n      |@param files Set of files to be cached.\n      |@return True if the files were all successfully cached or re-cached.\n    ")).stripMargin();
        this.uncacheFiles_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |NOTE: This feature is a no-op as of Jan 1, 2017 unless you have specifically opted\n      |in to DBFS caching. Please contact help@databricks.com if you have questions or concerns.\n      |\n      |Removes the cached version of the files. table from SSDs. If a file is not cached, this\n      |will do nothing.\n      |\n      |Examples:\n      |uncacheFiles(\"/my-folder/foo-0\", \"/my-folder/foo-1\")\n      |uncacheFiles(cachedFiles: _*)\n      |\n      |@param files Set of files to be uncached.\n      |@return True if the files were all successfully uncached (or were not cached originally).\n    ")).stripMargin();
        this.mount_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Mounts the given source directory into DBFS at the given mount point.\n      |\n      |Examples:\n      |  mount(\"s3n://ACCESS_KEY:SECRET_KEY@my-twitter-bucket/tweets2013/\", \"/mnt/tweets\")\n      |  ls(\"/mnt/tweets\")\n      |\n      |  mount(\"s3n://ACCESS_KEY:SECRET_KEY@my-twitter-bucket/tweets2013/\", \"/mnt/tweets\",\n      |        \"sse-s3\")\n      |\n      |Mount points are persistent -- they will not be lost upon cluster or instance termination.\n      |The mount point metadata will remain until termination of your Databricks service\n      |(or until the point is explicitly unmounted). Once a directory is mounted, it can be\n      |treated like a normal DBFS directory.\n      |\n      |Mounting a directory will securely persist any provided credentials, enabling access\n      |to the data within the mounted directory without having to re-provide credentials.\n      |It is not possible to access or view the credentials used to support a mount point after\n      |the mount point is created and the command used to mount the data has been removed. Thus,\n      |one Databricks user can mount a bucket, delete the mount command and share the data\n      |with other Databricks users in the same organization, without sharing the security\n      |credentials with them.\n      |\n      |Mounting with encryption is possible. Currently, SSE-S3 and SSE-KMS are supported. Use\n      |encryptionType = \"sse-s3\" for sse-s3 encryption, \"sse-kms\" for sse-kms encryption with\n      |default kms master key, and \"sse-kms:key-id\" for sse-kms encryption with separate kms key.\n      |The source directory will not be mounted if an invalid encryption type is passed in.\n      |\n      |Once this method returns, the mount should be accessible from every instance within your\n      |shard. However, since this information may be cached, you may have to run refreshMounts()\n      |in a cluster for it to show up. Note that mount() actually runs refreshMounts() on the\n      |current cluster.\n      |\n      |@param source FileSystem URI that contains the source data.\n      |              This cannot be a DBFS URI.\n      |@param mountPoint The directory within DBFS to mount the source. This must be within /mnt.\n      |@param encryptionType Encryption type with which we mount the source. This means every new\n      |                      object written using this mount will be written with encryption.\n      |@param owner Deprecated. This parameter is deprecated, please do not set it.\n      |@param extraConfigs A map containing extra configurations that will be used when\n      |                    accessing the mount point. For every entry in the map, key\n      |                    is the config name and the value is the value of the config.\n      |                    Please only provide configs that are advised by Databricks\n      |                    documentations.\n      |@return True if the path was successfully mounted.\n    ")).stripMargin();
        this.mounts_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Displays information about what is mounted within DBFS. The returned information includes\n      |the mount point, source directory, and encryption type. Any credentials used to mount the\n      |mount points listed will not be displayed.\n      |\n      |Example:\n      |  display(mounts())\n      |\n      |@return Ordered sequence of MountInfos containing the mount point, the source of every\n      |        mount, and the encryption type of that mount, if present.\n    ")).stripMargin();
        this.refreshMounts_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Forces all machines in this cluster to refresh their mount cache, ensuring they receive\n      |the most recent information.\n      |\n      |You may have to call this method if you mount or unmount a directory inside one cluster,\n      |and then quickly switch to another cluster (where it may be cached but not updated).\n      |\n      |Creating or deleting a mount automatically calls this method in the current cluster.\n      |@return True if the mount points were refreshed successfully.\n    ")).stripMargin();
        this.unmount_doc = new StringOps(Predef$.MODULE$.augmentString("\n      |Deletes a DBFS mount point. Once this method returns, the mount point metadata is\n      |guaranteed to be deleted from persistent storage and should be inaccessible from every\n      |instance within your shard. However, since this information may be cached, you may have to\n      |run refreshMounts() in a cluster for it to disappear. Note that unmount() actually runs\n      |refreshMounts() on the current cluster.\n      |\n      |Example:\n      |  unmount(\"/mnt/tweets\")\n      |\n      |@param mountPoint DBFS directory previously mounted\n      |@return True if the mount point was successfully unmounted, or wasn't mounted originally.\n    ")).stripMargin();
    }
}
