package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eww implements jei {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ eww(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        int i = this.b;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                int i2 = this.a;
                if (i2 == 65535) {
                    return Long.MAX_VALUE;
                }
                return Long.valueOf(i2 * 100);
            }
            if (((Integer) obj).intValue() == this.a) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (((efp) obj).r() == this.a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
