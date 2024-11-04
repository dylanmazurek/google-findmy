package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxg implements jxc {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jxg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r0v7, types: [jxc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [jxc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, jbe] */
    @Override // defpackage.jxc
    public final jyz a() {
        miv f;
        jbe e;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (!((jyc) this.b).compareAndSet(jyb.NOT_RUN, jyb.STARTED)) {
                    return ivc.C();
                }
                return this.a.a();
            }
            ?? r0 = this.a;
            f = jbu.f();
            e = jbu.e(f, r0);
            try {
                jyz a = this.b.a();
                jbu.e(f, e);
                a.getClass();
                return a;
            } catch (Throwable th) {
                try {
                    jaq.a(th);
                    throw th;
                } finally {
                }
            }
        }
        jxk jxkVar = new jxk();
        try {
            Object obj = this.a;
            jck jckVar = jxkVar.a;
            ?? r3 = ((jbi) obj).a;
            Object obj2 = ((jbi) obj).b;
            int i2 = jbn.a;
            jckVar.getClass();
            f = jbu.f();
            e = jbu.e(f, r3);
            try {
                Object obj3 = ((jbi) obj2).a;
                Object obj4 = ((jbi) obj2).b;
                ige igeVar = ((igd) obj3).b;
                final jer jerVar = (jer) obj4;
                final igd igdVar = (igd) obj3;
                igeVar.a.add(new icj() { // from class: igc
                    /* JADX WARN: Type inference failed for: r0v6, types: [icj, java.lang.Object] */
                    @Override // defpackage.icj
                    public final void a(ick ickVar) {
                        ((jni) ((jni) igh.a.e()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$GattClientValueAndCloser", "lambda$getImmutableGattClient$0", 554, "SharedGattConnectionManagerInternal.java")).u("Found device ID %s in a scan.", igd.this.c);
                        jer jerVar2 = jerVar;
                        if (jerVar2.g()) {
                            jerVar2.c().a(ickVar);
                        }
                    }
                });
                jckVar.e(new icc(obj3, obj4, 3), ((igd) obj3).d);
                jxp jxpVar = new jxp(ivc.F(((igd) obj3).a));
                jbu.e(f, e);
                jxpVar.a((jxk) this.b);
                return jxpVar.d;
            } finally {
            }
        } finally {
            ((jxk) this.b).a(jxkVar, jxv.a);
        }
    }

    public final String toString() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return this.a.toString();
            }
            return "propagating=[" + this.b + "]";
        }
        return this.a.toString();
    }

    public jxg(jyc jycVar, jxc jxcVar, int i) {
        this.c = i;
        this.b = jycVar;
        this.a = jxcVar;
    }
}
