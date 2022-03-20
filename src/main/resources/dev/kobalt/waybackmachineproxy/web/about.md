### Purpose

This program provides a proxy server to browse the old web through Internet Archive's Wayback Machine.

### Mechanism

Define the timestamp to define the nearest timeline of browsing the web. HTTP proxy server will start and when you
configure a browser or system to run through it, all requests will be passed to Internet Archive's Wayback Machine
service to get archived versions of pages.

All requests that receive a response will be cached. Cache is bound to requested URL and timestamp. To remove the cache,
stop the server, remove "cache" folder and start the server again.

### Limitations

- Few simultaneous requests can be active at a time.
- Some requests may fail and require another attempt.
- This isn't well optimized and it may cause high memory usage.
- Cache has no storage limit and it may fill your storage if browsing a lot.