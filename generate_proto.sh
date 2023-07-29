#!/bin/bash
# This shell script (re)creates the classes if you decide to update the proto contract files.
cd "$(dirname "$0")"
DIR=$(pwd)
protoc -I="$DIR/src/main/resources/proto" --java_out="$DIR/src/main/java" --kotlin_out="$DIR/src/main/kotlin" "$DIR/src/main/resources/proto/user.proto"
