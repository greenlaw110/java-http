# OSGL HTTP Change Log

1.2.0 - 19/Dec/2017
* Update to osgl-1.5.0

1.1.4
* `H.Request.accept` parsing shall support `text/css` #13

1.1.3
- Deprecate H.Status.UNAVAILABLE_FOR_LEGAL_REASON to H.Status.UNAVAILABLE_FOR_LEGAL_REASONS

1.1.2
- Support unknown HTTP method #7

1.1.1
- Define http status int constant #4

1.0.6
- `H.Response.writeBinary` shall close the outputstream #5

1.0.5
- `H.Method.actionMethod()` shall include `H.Method.Patch` #3

1.0.4
- `H.Session` and `H.Flash` shall implement `hashCode()` and `equals()` method #2

1.0.3
- Decouple the osgl-storage dependency by making it provided scope

1.0.2
- Take out version range. See https://issues.apache.org/jira/browse/MNG-3092

1.0.1
- H.Rquest.fullUrl() shall not output `80` when sending to port `80` #1

1.0.0
- baseline from 0.5

0.5.0-SNAPSHOT
- update tool to 0.10.0
- update storage to 0.8.0
- update cache to 0.5.0
- add H.MediaType enum

0.4.0-SNAPSHOT
- add H.Response.writeBinary(ISObject) API

0.3.4-SNAPSHOT
- update HttpConfig cache service relevant API

0.3.3-SNAPSHOT
- update osgl-storage to 0.7.3-SNAPSHOT

0.3.1-SNAPSHOT
- Add secure configuration to HttpConfig
- Add H.Response.prepareDownload(String, String) method
- Add H.Format.isText() method
- Add H.Request.referer() and H.Request.referrer() methods

0.3.0-SNAPSHOT
- update to osgl-tool 0.9
- allow parsing remote address aggressively
- Add H.Format.CSS and H.Format.JAVASCRIPT content type

0.2.5-SNAPSHOT
- update osgl-tool to 0.7.1-SNAPSHOT

0.2.4-SNAPSHOT
- H.Session.getId() should try to pull from data map before generating new one
- H.Request.format() now renamed to H.Request.accept()
- H.Request.contentType() now return H.Format type
- H.Status now implemented with class instead of enum. And it allows to create non-standard http status instance
- H.Format now implemented with class instead of enum. And it allows to create custom http format instances
- H.Cookie, H.Session, H.Status, H.Format now implement Serializable interface

0.2.3-SNAPSHOT
- Fix issue in getting expires() on H.Cookie when maxAge is less than zero

0.2.2-SNAPSHOT
- Remove threadlocal from cookie operations on Request
- Add accept(Format) method to H.Request to allow set a accept to request

0.2.1-SNAPSHOT
- add FOUND_AJAX(278) as new http status
- KV as abstract class for Session and Flash

0.2-SNAPSHOT
- upgrade to osgl-tool 0.4-SNAPSHOT
- H.Request param now support multiple param values
- Binding now take H.Request instead of Map<String, String[]> as parameter source
- Add more methods to H.Response and H.Cookie

0.1-SNAPSHOT
- base version when history log started