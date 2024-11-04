package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bth implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bth(bpy bpyVar, int i, int i2) {
        this.c = i2;
        this.b = bpyVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hix, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, haw] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((bpy) this.b).a(this.a);
                return;
            case 1:
                ((brj) this.b).a(this.a);
                return;
            case 2:
                ((fjb) this.b).k(this.a);
                return;
            case 3:
                apc apcVar = (apc) this.b;
                ?? r2 = apcVar.b;
                Object a = apcVar.c.a();
                ljn ljnVar = (ljn) apcVar.a;
                ljh ljhVar = (ljh) ljnVar.z(5);
                ljhVar.w(ljnVar);
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                int i = this.a;
                lnh lnhVar = (lnh) ljhVar.b;
                lnh lnhVar2 = lnh.g;
                lnhVar.b = i - 1;
                lnhVar.a |= 1;
                r2.a(a, (lnh) ljhVar.q());
                return;
            case 4:
                ((isp) this.b).E(this.a);
                return;
            case 5:
                ((kvd) this.b).b().e(this.a);
                return;
            case 6:
                ((kvi) this.b).b.e(this.a);
                return;
            case 7:
                kvt kvtVar = (kvt) this.b;
                if (!kvtVar.h) {
                    int i2 = this.a;
                    if (kvtVar.e.e == 4) {
                        kvtVar.i.e(i2);
                        return;
                    } else {
                        kvtVar.d += i2;
                        return;
                    }
                }
                return;
            case 8:
                try {
                    int i3 = mkl.a;
                    mhi mhiVar = ((mcu) this.b).m;
                    int i4 = this.a;
                    hwx.K(true, "numMessages must be > 0");
                    if (mhiVar.b()) {
                        return;
                    }
                    mhiVar.e += i4;
                    mhiVar.a();
                    return;
                } catch (Throwable th) {
                    ((mcu) this.b).k(th);
                    return;
                }
            case 9:
                ((mek) this.b).b.e(this.a);
                return;
            case 10:
                ((meo) this.b).e.t(this.a);
                return;
            case 11:
                ((meo) this.b).e.l(this.a);
                return;
            case 12:
                ((meo) this.b).e.m(this.a);
                return;
            default:
                ((nnj) this.b).onStatus(this.a);
                return;
        }
    }

    public /* synthetic */ bth(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    public bth(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }
}
