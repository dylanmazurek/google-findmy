package defpackage;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izi implements HttpRequestInterceptor {
    final /* synthetic */ izj a;

    public izi(izj izjVar) {
        this.a = izjVar;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        iqh iqhVar = this.a.b;
    }
}
