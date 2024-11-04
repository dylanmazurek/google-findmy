package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfg extends kff {
    private final long[] d;

    kfg() {
        super(new long[10], new long[10], new long[10]);
        this.d = new long[10];
    }

    @Override // defpackage.kff
    public final void b(long[] jArr, long[] jArr2) {
        kfl.b(jArr, jArr2, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfg(kuv kuvVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.d = jArr;
        long[] jArr2 = this.a;
        kpb kpbVar = (kpb) kuvVar.a;
        kfl.j(jArr2, (long[]) kpbVar.c, (long[]) kpbVar.b);
        long[] jArr3 = this.b;
        kpb kpbVar2 = (kpb) kuvVar.a;
        kfl.i(jArr3, (long[]) kpbVar2.c, (long[]) kpbVar2.b);
        System.arraycopy(((kpb) kuvVar.a).a, 0, jArr, 0, 10);
        kfl.b(this.c, (long[]) kuvVar.b, kfi.b);
    }
}
