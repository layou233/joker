# Joker

Play a trick with some stupid process identification.

## Usage

```shell
java -jar <Joker jar file> your_shared_library.so
```

DLLs and other shared/static library are also supported.  
We use JNA as the native call implementation.

The given library should have an exported function like this:

```c
void JokerMain()
```

`JokerMain` would be the entry for Joker.

Here are some guides to write such libraries.

### Example (Go)

```go
package main

import "C"

//export JokerMain
func JokerMain() {
	println("The quick brown fox jumps over the lazy dog.")
}

func main() {} // dummy
```

And then compile with:

```shell
go build -buildmode=c-shared -v -ldflags="-s -w -buildid="
```

Then add library filename extension of your platform to the output file (like .so, .dll, etc).
