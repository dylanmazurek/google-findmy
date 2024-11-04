package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlr implements dll {
    private final /* synthetic */ int a;

    public dlr(int i) {
        this.a = i;
    }

    @Override // defpackage.dll
    public final /* synthetic */ int a(Object obj) {
        if (this.a != 0) {
            return ((byte[]) obj).length;
        }
        return ((int[]) obj).length;
    }

    @Override // defpackage.dll
    public final int b() {
        if (this.a != 0) {
            return 1;
        }
        return 4;
    }

    @Override // defpackage.dll
    public final /* synthetic */ Object c(int i) {
        if (this.a != 0) {
            return new byte[i];
        }
        return new int[i];
    }
}
