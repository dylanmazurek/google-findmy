package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izl {
    public final Object a;
    public final /* synthetic */ Object b;

    public izl(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public final HttpResponse a(HttpUriRequest httpUriRequest) {
        int i = izf.a;
        return ((izj) this.a).execute(httpUriRequest);
    }

    public final void b() {
        synchronized (((hyy) this.b).c) {
            Object obj = this.b;
            hyx hyxVar = ((hyy) obj).d;
            hyx hyxVar2 = hyx.STOPPED;
            if (hyxVar == hyxVar2) {
                return;
            }
            ((hyy) obj).e.put(this.a, hyxVar2);
        }
    }
}
