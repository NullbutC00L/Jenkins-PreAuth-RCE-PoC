cd code
javac -target 8 -source 8 Payload.java
jar cvf payload-1.jar .
yes | cp -rf payload-1.jar ../www/package/payload/1
