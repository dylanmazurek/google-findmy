package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nmt implements nmy {
    public final /* synthetic */ nmu a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nmt(nmu nmuVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = nmuVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.nmy
    public final void a() {
        if (this.d != 0) {
            nmu nmuVar = this.a;
            if (((nmx) nmuVar.d).g.compareAndSet(5, 4)) {
                Object obj = this.c;
                UrlResponseInfo urlResponseInfo = this.b;
                ((nni) nmuVar.a).onReadCompleted((UrlRequest) nmuVar.d, urlResponseInfo, (ByteBuffer) obj);
                return;
            }
            return;
        }
        nmu nmuVar2 = this.a;
        Object obj2 = this.c;
        ((nni) nmuVar2.a).onRedirectReceived((UrlRequest) nmuVar2.d, this.b, (String) obj2);
    }
}
