package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjs implements mho {
    private final /* synthetic */ int a;
    private final Object b;

    public mjs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mjq, java.lang.Object] */
    @Override // defpackage.mho
    public final Object a() {
        if (this.a != 0) {
            return this.b;
        }
        return mjr.a(this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mjq, java.lang.Object] */
    @Override // defpackage.mho
    public final void b(Object obj) {
        if (this.a != 0) {
            return;
        }
        mjr.d(this.b, obj);
    }
}
