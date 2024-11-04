package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wz implements ws {
    public final int a;
    public final int b;
    private final vg c;
    private final wu d;

    public wz(int i, int i2, vg vgVar) {
        this.a = i;
        this.b = i2;
        this.c = vgVar;
        this.d = new wu(new vm(i, i2, vgVar));
    }

    @Override // defpackage.wq
    public final /* synthetic */ long a(va vaVar, va vaVar2, va vaVar3) {
        return rf.b(this);
    }

    @Override // defpackage.wq
    public final /* synthetic */ va b(va vaVar, va vaVar2, va vaVar3) {
        return rc.c(this, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va c(long j, va vaVar, va vaVar2, va vaVar3) {
        return this.d.c(j, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va d(long j, va vaVar, va vaVar2, va vaVar3) {
        return this.d.d(j, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.ws
    public final int f() {
        return this.b;
    }

    @Override // defpackage.ws
    public final int g() {
        return this.a;
    }

    public wz() {
        this(300, 0, vi.a);
    }
}
