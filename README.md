hive-udf
========

Simply Measured's collection of Hive User Defined Functions

Usage
-----

Include in your Hive classpath via Hive's auxjars functionality, or via the ADD JAR command in the Hive CLI.

Query away!

Functions
---------

    iso8601_to_unix_timestamp(String) - Convert an ISO 8601 String (like, 2013-06-10T12:31:00-0700) to a UNIX timestamp. Returns a BIGINT.

    sha1hash(String) - Generate a SHA1 hash of any string. Returns a String.

Maven
-----

Add the Maven dependency:

    <dependency>
        <groupId>com.simplymeasured.hive</groupId>
        <artifactId>hive-udf</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

Hive CLI
--------

    ADD JAR commons-codec-1.6.jar;
    ADD JAR joda-time-2.2.jar;
    ADD JAR hive-udf-1.0-SNAPSHOT.jar;

Hive configuration files
------------------------

    <property>
      <name>hive.aux.jars.path</name>
      <value>file:///path/to/commons-codec-1.6.jar,file:///path/to/joda-time-2.2.jar,file:///path/to/hive-udf-1.0-SNAPSHOT.jar</value>
    </property>

License
-------

Apache Public License 2.0. See the LICENSE file for more details.
