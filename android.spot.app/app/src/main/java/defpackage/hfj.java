package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfj implements jei {
    private final /* synthetic */ int a;

    public hfj(int i) {
        this.a = i;
    }

    public static int b(int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                return 1;
            }
            if (i2 != 1) {
                return 3;
            }
            return 2;
        }
        throw null;
    }

    @Override // defpackage.jei
    public final /* synthetic */ Object a(Object obj) {
        if (this.a != 0) {
            return ((ddh) obj).a;
        }
        throw null;
    }
}
