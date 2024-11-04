package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class meg implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public meg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, mhe] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, lzy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, mhe] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.b) {
            case 0:
                ((mek) this.a).b.d();
                return;
            case 1:
                mdd mddVar = (mdd) this.a;
                mrx mrxVar = mddVar.b;
                if (mrxVar != null && mrxVar.b()) {
                    mrxVar.a();
                }
                mddVar.a = null;
                return;
            case 2:
                ((mej) this.a).c.g();
                return;
            case 3:
                this.a.a(true);
                return;
            case 4:
                this.a.a(false);
                return;
            case 5:
                mgh mghVar = (mgh) this.a;
                hwx.V(mghVar.a.A.get(), "Channel must have been shut down");
                mgu mguVar = mghVar.a;
                mguVar.B = true;
                mguVar.i(false);
                mghVar.a.g();
                return;
            case 6:
                hwx.V(((mgh) ((mem) this.a).f).a.A.get(), "Channel must have been shut down");
                return;
            case 7:
                ((meo) this.a).e.s();
                return;
            case 8:
                ((meo) this.a).d();
                return;
            case 9:
                ((meo) this.a).e.r();
                return;
            case 10:
                ((meo) this.a).e.i();
                return;
            case 11:
                ((men) this.a).a.d();
                return;
            case 12:
                mfv mfvVar = (mfv) this.a;
                mfvVar.r = null;
                mfvVar.d.a(2, "CONNECTING after backoff");
                ((mfv) this.a).b(lze.CONNECTING);
                ((mfv) this.a).g();
                return;
            case 13:
                if (((mfv) this.a).o.a == lze.IDLE) {
                    ((mfv) this.a).d.a(2, "CONNECTING as requested");
                    ((mfv) this.a).b(lze.CONNECTING);
                    ((mfv) this.a).g();
                    return;
                }
                return;
            case 14:
                mfv mfvVar2 = (mfv) ((kvz) this.a).b;
                mhf mhfVar = mfvVar2.j;
                mfvVar2.s = null;
                mfvVar2.j = null;
                mhfVar.e(mca.i.d("InternalSubchannel closed transport due to address change"));
                return;
            case 15:
                ((mfv) this.a).d.a(2, "Terminated");
                ?? r0 = this.a;
                mfr mfrVar = ((mfv) r0).a;
                mfrVar.b.i.v.remove(r0);
                lzw.b(mfrVar.b.i.G.c, r0);
                mfrVar.b.i.g();
                return;
            case 16:
                mft mftVar = (mft) this.a;
                mfv mfvVar3 = mftVar.c;
                mfvVar3.q = null;
                if (mfvVar3.p != null) {
                    if (mfvVar3.n == null) {
                        z = true;
                    }
                    hwx.V(z, "Unexpected non-null activeTransport");
                    mft mftVar2 = (mft) this.a;
                    mftVar2.a.e(mftVar2.c.p);
                    return;
                }
                meb mebVar = mfvVar3.m;
                meb mebVar2 = mftVar.a;
                if (mebVar == mebVar2) {
                    mfvVar3.n = mebVar2;
                    mfv.h(((mft) this.a).c);
                    ((mft) this.a).c.b(lze.READY);
                    return;
                }
                return;
            case 17:
                mft mftVar3 = (mft) this.a;
                mftVar3.c.k.remove(mftVar3.a);
                if (((mft) this.a).c.o.a == lze.SHUTDOWN && ((mft) this.a).c.k.isEmpty()) {
                    ((mft) this.a).c.e();
                    return;
                }
                return;
            case 18:
                mgu mguVar2 = (mgu) this.a;
                if (mguVar2.t != null) {
                    mguVar2.i(true);
                    mguVar2.y.d(null);
                    mguVar2.F.a(2, "Entering IDLE state");
                    mguVar2.o.a(lze.IDLE);
                    mfl mflVar = mguVar2.O;
                    Object[] objArr = {mguVar2.x, mguVar2.y};
                    for (int i = 0; i < 2; i++) {
                        if (mflVar.a.contains(objArr[i])) {
                            mguVar2.f();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                mgu mguVar3 = ((mgk) this.a).b;
                mguVar3.m.c();
                if (mguVar3.s) {
                    mguVar3.r.b();
                    return;
                }
                return;
            default:
                ((mgq) this.a).c.f();
                return;
        }
    }

    public /* synthetic */ meg(mdd mddVar, int i) {
        this.b = i;
        this.a = mddVar;
    }
}
