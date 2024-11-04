package defpackage;

import java.util.Map;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class dgh implements dgj {
    protected final HttpClient a;

    public dgh(HttpClient httpClient) {
        this.a = httpClient;
    }

    public static void a(HttpUriRequest httpUriRequest, Map map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }
}
