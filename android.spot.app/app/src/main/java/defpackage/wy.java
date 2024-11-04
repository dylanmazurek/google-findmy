package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wy implements wq {
    private final /* synthetic */ wu a;

    public wy(float f, float f2, va vaVar) {
        wr wrVar;
        if (vaVar != null) {
            wrVar = new wr(vaVar, f, f2, 1);
        } else {
            wrVar = new wr(f, f2, 0);
        }
        this.a = new wu(wrVar);
    }

    @Override // defpackage.wq
    public final long a(va vaVar, va vaVar2, va vaVar3) {
        return this.a.a(vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va b(va vaVar, va vaVar2, va vaVar3) {
        return this.a.b(vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va c(long j, va vaVar, va vaVar2, va vaVar3) {
        return this.a.c(j, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va d(long j, va vaVar, va vaVar2, va vaVar3) {
        return this.a.d(j, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final boolean e() {
        return false;
    }
}
