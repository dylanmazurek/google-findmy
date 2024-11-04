package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class idf implements jxl {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ idf(ibf ibfVar, fyy fyyVar, int i) {
        this.c = i;
        this.b = ibfVar;
        this.a = fyyVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, jxl] */
    @Override // defpackage.jxl
    public final Object a(jck jckVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ?? r0 = this.a;
                int i2 = jbn.a;
                jckVar.getClass();
                jbe e = jbu.e(jbu.f(), r0);
                try {
                    return this.b.a(jckVar);
                } finally {
                }
            } else {
                ((jni) ((jni) ibf.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "lambda$connect$0", 225, "BleScannerImpl.java")).u("Connecting to %s", ((fyy) this.a).a());
                ((jni) ((jni) ibf.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "addConnection", 243, "BleScannerImpl.java")).r("Adding connection.");
                Object obj = this.b;
                ibf ibfVar = (ibf) obj;
                synchronized (ibfVar.f) {
                    if (((ibf) obj).h == 0) {
                        ((jni) ((jni) ibf.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "pauseAllScans", 402, "BleScannerImpl.java")).r("Pausing scans.");
                        synchronized (((ibf) obj).f) {
                            ((ibf) obj).d(new eew(8));
                        }
                        ((ibf) obj).h(true);
                    }
                    ((ibf) obj).h++;
                }
                jckVar.e(new ibc(obj, 0), ibfVar.e);
                return null;
            }
        } else {
            Object obj2 = this.a;
            ibc ibcVar = new ibc(obj2, 2);
            idt idtVar = (idt) obj2;
            jckVar.e(ibcVar, idtVar.d);
            jckVar.e(new ibc(this.b, 3), idtVar.d);
            return null;
        }
    }

    public /* synthetic */ idf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
