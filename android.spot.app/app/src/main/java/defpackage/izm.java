package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izm implements ResponseHandler {
    private final ResponseHandler a;

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        int i = izf.a;
        return this.a.handleResponse(httpResponse);
    }
}
