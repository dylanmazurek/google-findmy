package defpackage;

import java.net.URI;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kvo implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public kvo(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj2;
        this.a = obj3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Object obj = this.a;
                kvp kvpVar = (kvp) obj;
                boolean z = kvpVar.a;
                Object obj2 = this.c;
                Object obj3 = this.b;
                if (!z) {
                    try {
                        ((kvp) obj).c.a((mca) obj3, (mbc) obj2);
                        return;
                    } finally {
                        kvpVar.a = true;
                        kvpVar.b.g.a();
                    }
                }
                return;
            case 1:
                ((kvt) this.b).j((hwx) this.a, (kvq) this.c);
                return;
            case 2:
                ((kwa) this.a).a.a((mca) this.b, (mbc) this.c);
                return;
            case 3:
                ((mek) this.b).b.a((mjo) this.a, (mbc) this.c);
                return;
            case 4:
                ((mej) this.b).c.a((mca) this.c, (mbc) this.a);
                return;
            case 5:
                Object obj4 = this.b;
                mgu mguVar = ((mgk) obj4).b;
                if (obj4 == mguVar.t) {
                    mguVar.j((maq) this.c);
                    Object obj5 = this.a;
                    if (obj5 != lze.SHUTDOWN) {
                        ((mgk) this.b).b.F.b(2, "Entering {0} state with picker: {1}", obj5, this.c);
                        ((mgk) this.b).b.o.a((lze) this.a);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                synchronized (((miv) this.a).a) {
                    Object obj6 = this.a;
                    if (((miv) obj6).b) {
                        return;
                    }
                    ((miv) obj6).a();
                    ((miz) this.c).b.f.execute(new mgs(this, 9));
                    return;
                }
            case 7:
                Object obj7 = this.b;
                nmx nmxVar = (nmx) obj7;
                nmxVar.p = URI.create(nmxVar.m).resolve((String) this.a).toString();
                nmxVar.f.add(nmxVar.p);
                nmxVar.i(2, 3, new miy(obj7, (UrlResponseInfo) this.c, 6));
                return;
            default:
                Object obj8 = this.a;
                Object obj9 = this.c;
                Object obj10 = this.b;
                try {
                    ((nni) ((nmu) obj10).a).onFailed((UrlRequest) ((nmu) obj10).d, (UrlResponseInfo) obj9, (CronetException) obj8);
                } catch (Exception e) {
                    ((nmx) ((nmu) obj10).d).h("onFailed", e);
                }
                nmu nmuVar = (nmu) obj10;
                nmuVar.b();
                ((nmx) nmuVar.d).r.b();
                return;
        }
    }

    public /* synthetic */ kvo(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public kvo(mek mekVar, mjo mjoVar, mbc mbcVar, int i) {
        this.d = i;
        this.a = mjoVar;
        this.c = mbcVar;
        this.b = mekVar;
    }

    public kvo(miz mizVar, miv mivVar, mja mjaVar, int i) {
        this.d = i;
        this.a = mivVar;
        this.b = mjaVar;
        this.c = mizVar;
    }

    public /* synthetic */ kvo(mjo mjoVar, mca mcaVar, mbc mbcVar, int i) {
        this.d = i;
        this.a = mjoVar;
        this.b = mcaVar;
        this.c = mbcVar;
    }

    public /* synthetic */ kvo(nmu nmuVar, UrlResponseInfo urlResponseInfo, CronetException cronetException, int i) {
        this.d = i;
        this.b = nmuVar;
        this.c = urlResponseInfo;
        this.a = cronetException;
    }
}
