### Java Executable

This is a simple JAR executable file that runs on Java Virtual Machine.

[Download (~13 MiB)](./waybackmachineproxy.jar)

### Requirements

- Java Runtime Environment, version 1.8

### Usage

Launch executable with following command:

'java -jar waybackmachineproxy.jar --httpServerPort "%PORT%" --httpServerHost "%HOST%" --timestamp "%TIMESTAMP%"'

Replace following values:

%PORT% - Port to host the server at.

%HOST% - Host value (127.0.0.1 for private, 0.0.0.0 for public access)

%TIMESTAMP% - Timestamp of the timeline where you want to browse pages at (format: YYYYMMDDHHMMSS)