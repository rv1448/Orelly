__STREAMS__

``` java
public abstract class Outputstream
public void write(byte[] data)
```
## Output Stream
* subclass of the Outputstream use these methods to write data onto particular method
* FileoutputStream write uses the same methods to write data into a file
* Bytearrayoutput stream uses these methods to write data into an expandable byte array
* The power of polymorphism - if you know how to use the superclass, you know how to use all the subclass too
* Stream can be buffered as well by chaining __BufferedOutputStream BufferedWriter__ 
* Suppose you are writing 300 byte request to HTTP server that uses HTTP keep alive
* The flush() method breaks the deadlock by forcing buffered stream to send its data even buffer is not full yet

## Input Stream

``` java
public abstract class InputStream


public abstract int read()
public int read(byte[] input)
public int read(byte[] input, int offset, int length)
public long skip(long n)
public int available()
public void close()
```

* Input stream and outstream are fairly raw classes. They read and write bytes singly or group
* These bytes could mean integers or float or text
* Integers are passed as parts of 32 bits
* Text is passed 7 bit ascii or multibyte UTF-8
* Filters come in two versions the filter streams, Readers and Writers
* the readers and writers handle the special case of text in a variety of encodings such as UTF-8 and ISO 8859
==
* Unicode
	- Unicode is a universal character set, ie. a standard that defines, in one place, all the characters needed for writing
	the majority of living languages in use on computers. It aims to be, and to a large extent already is, a superset of all
	other character sets that have been encoded.
* Character Set
	- A set of characters, Letter A is a character. It has no direct relationship to ASCII, Unicode, Or even computers
* Coded Character Set
	- A assignment of numeric values to set of characters. Letter a is assignged a decimal value 221 or 0xE1 in hexadecimal nota
	tion. A unicode code can have a value between 0x0000 and 0x10FFFF
	- Coded character sets are sometimes called code pages
* Character-Encoding-Scheme
	- Reflects the way the coded character set is mapped to bytes for manipulation in a computer.


	- for instance DataOutputStream provides a method that convert an int into 4 Bytes and write the bytes to outputstream
	- Readers and writers can be chained to input and output streams to read and write text streams
	- Readers and Writers can handle a wide varity of character sets including multibyte character UTF-8

* OutputStreams
	- write,flush, close methods
	- Subclass of outputstream use these methods to write data onto particular media
	- ByteArrayoutput stream writes to expandable bytearray
	- outputstream fundamental write method takes a integer from 0 to 255 as an argument and write byte to the output stream
	- write method take a int and write only first eight bits are placed on the wire
	- if a int over 255 is passed to the write method, the least signiifcant byte of the number is written to the wire
* InputStream
	- The basic method of InputStream is read(). This method reads a single byte of data form the input stream and returns 
	it as int from 0 to 255. End of stream by returning -1. THe read() method awaits and blocks execution of code that follows
	it until a byte of data is available and ready to be read.

* Thread
	- Either subclass thread and override its run method or Implement runnable interface
	- To start a Thread
``` java
Thread t = new Thread();
t.start()
```	
	- To give a thread something to do, you either subclass the Thread class and override its run() method
	or implement the runnable interface and pass the Runnable object to the Thread constructor
	- Subclass Thread whose run() method calculates a 256 bit SHA-2 message digest for a specified file.
``` java
@Override
public void run(){
FileinputStream fn = new FileinputStream(input);
MessageDigest sha = MessageDigest.getInstance("SHA-256");
DigestinputStream din = new DigestInputStream(in,sha);
while(din.read()!=-1);
din.close();
byte[] digest = sha.digest()
StringBuilder ss = new Stringbuilder(filename);
ss.append(":");
ss.append(hexadecimalnumber);
println(ss)
}

Thread t = new DigestThread(file)
t.start()
```
	- The run method is fixed, you can't pass arguements to it or return values from it.
	- Getting information out of a thread back into orginal calling thread is tricky

* Returning information from a Thread
	- The run() and start() method of a thread don't return any values
	- main thread passes the execution before initiated thread completes
* Callback
	- The 

