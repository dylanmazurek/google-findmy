package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nij {
    public static final nig[] a = {new nig(nig.f, ""), new nig(nig.c, "GET"), new nig(nig.c, "POST"), new nig(nig.d, "/"), new nig(nig.d, "/index.html"), new nig(nig.e, "http"), new nig(nig.e, "https"), new nig(nig.b, "200"), new nig(nig.b, "204"), new nig(nig.b, "206"), new nig(nig.b, "304"), new nig(nig.b, "400"), new nig(nig.b, "404"), new nig(nig.b, "500"), new nig("accept-charset", ""), new nig("accept-encoding", "gzip, deflate"), new nig("accept-language", ""), new nig("accept-ranges", ""), new nig("accept", ""), new nig("access-control-allow-origin", ""), new nig("age", ""), new nig("allow", ""), new nig("authorization", ""), new nig("cache-control", ""), new nig("content-disposition", ""), new nig("content-encoding", ""), new nig("content-language", ""), new nig("content-length", ""), new nig("content-location", ""), new nig("content-range", ""), new nig("content-type", ""), new nig("cookie", ""), new nig("date", ""), new nig("etag", ""), new nig("expect", ""), new nig("expires", ""), new nig("from", ""), new nig("host", ""), new nig("if-match", ""), new nig("if-modified-since", ""), new nig("if-none-match", ""), new nig("if-range", ""), new nig("if-unmodified-since", ""), new nig("last-modified", ""), new nig("link", ""), new nig("location", ""), new nig("max-forwards", ""), new nig("proxy-authenticate", ""), new nig("proxy-authorization", ""), new nig("range", ""), new nig("referer", ""), new nig("refresh", ""), new nig("retry-after", ""), new nig("server", ""), new nig("set-cookie", ""), new nig("strict-transport-security", ""), new nig("transfer-encoding", ""), new nig("user-agent", ""), new nig("vary", ""), new nig("via", ""), new nig("www-authenticate", "")};
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            nig[] nigVarArr = a;
            if (!linkedHashMap.containsKey(nigVarArr[i].g)) {
                linkedHashMap.put(nigVarArr[i].g, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static final void a(nks nksVar) {
        int b2 = nksVar.b();
        for (int i = 0; i < b2; i++) {
            byte a2 = nksVar.a(i);
            if (a2 >= 65 && a2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(nksVar.d()));
            }
        }
    }
}
