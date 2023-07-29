REM # This shell script (re)creates the classes if you decide to update the proto contract files.
cd /d "%~dp0"
set DIR=%CD%
protoc -I="%DIR%\src\main\resources\proto" --java_out="%DIR%\src\main\java" --kotlin_out="%DIR%\src\main\kotlin" "%DIR%\src\main\resources\proto\user.proto"
