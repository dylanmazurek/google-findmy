package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ifn implements jei {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ifn(eow eowVar, gok gokVar, lqd lqdVar, boolean z, int i) {
        this.e = i;
        this.b = eowVar;
        this.c = gokVar;
        this.d = lqdVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ifr, java.lang.Object] */
    @Override // defpackage.jei
    public final Object a(Object obj) {
        if (this.e != 0) {
            Void r8 = (Void) obj;
            boolean B = ((gok) this.c).B();
            Object obj2 = this.d;
            Object obj3 = this.b;
            if (!B) {
                eow eowVar = (eow) obj3;
                eowVar.c.k((lqd) obj2);
                eowVar.f.m(R.string.spot_remove_device_success);
            }
            eow eowVar2 = (eow) obj3;
            eowVar2.i(lnb.ERASE_DEVICE_SUCCESS, this.a, (lqd) obj2);
            ((jni) ((jni) eow.a.e().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "lambda$eraseDevice$1", 141, "EraseDeviceHandlerImpl.java")).r("Device deleted successfully");
            return r8;
        }
        Object obj4 = this.b;
        Object obj5 = ((ifo) obj4).h;
        Long l = (Long) obj;
        ?? r2 = this.d;
        Object obj6 = this.c;
        boolean z = this.a;
        synchronized (obj5) {
            ((ifo) obj4).n = z;
            if (((ifo) obj4).j == obj6) {
                if (z) {
                    ((ifo) obj4).d(ifj.RINGING, l.longValue(), jdl.a);
                    if (!r2.f()) {
                        ((ifo) obj4).g(((ifo) obj4).i + ifo.d);
                    }
                } else {
                    ((ifo) obj4).d(ifj.STOPPED, 0L, jdl.a);
                }
            }
        }
        return null;
    }

    public /* synthetic */ ifn(ifo ifoVar, boolean z, ifj ifjVar, ifr ifrVar, int i) {
        this.e = i;
        this.b = ifoVar;
        this.a = z;
        this.c = ifjVar;
        this.d = ifrVar;
    }
}
